---
title: System
category: software-architecture
authors: [ valentina-cupac ]
---

Atomiv was envisioned to help you design and implement high quality architectures for software projects and products. Atomiv provides a templated solution architecture based on well-known best practices in clean architecture.

![Architecture diagram](https://atomiv.github.io/img/architecture-layers.svg)

## History

The historical foundations of Atomiv Architecture Standards are based on the following architectures from globally recognized experts in software architecture:

* [Hexagonal Architecture, aka. Ports and Adapters \(Alistair Cockburn, 2005\)](https://dzone.com/articles/hexagonal-architecture-is-powerful) 
* [Onion Architecture \(Jeffrey Palermo, 2008\)](https://jeffreypalermo.com/2008/07/the-onion-architecture-part-1/)
* [Clean Architecture \(Robert C. Martin, 2012\)](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)

Furthermore, it is rooted in the following design and development approaches:

* Domain Driven Design \(DDD\) \(Eric Evans\)
* Use Case Driven Design \(UCDD\)
* Test Driven Development \(TDD\) \(Kent Beck\)
* Acceptance Test Driven Development \(ATDD\)
* Behavior Driven Development \(BDD\)
* Command Query Responsibility Segregation \(CQRS\)

## Dependencies

To summarize, the dependencies are as follows:

* The Core Layer is self-contained and it does not dependent on any other layers.
* The Domain Layer does not have dependencies on other layers.
* The Application Layer Interface do not contain dependencies on other layers.
* The Application Layer Implementation depends both on Application Layer interfaces and the Domain Layer.

Other layers contain dependencies as follows:

* The Infrastructure Layer depends on the Core Layer, because it implements the interfaces defined in the Core Layer. Thus, it is an “implementation detail” with ORM’s, frameworks and external systems.
* The Presentation Layer depends on the Application Layer interfaces.
* The DI Layer depends on the Core Layer and the Infrastructure Layer.
* The Test Layer depends on the layers it is testing.

The core benefits is that due to the independence of the Application Core, it ensures separation of concerns and modularity, swappability of databases, UIs and any frameworks, and also enables the system to be testable. These factors increase system quality and decreasing overall total development and maintenance cost.

## Core

At the system center, we have the Core Layer, composed of the Application Layer and the Domain Layer.

### Application Layer

The Application Layer is the outer layer of the Core, it is modelled around the user interaction with the system - so this is where we apply Use Case Driven Design, we're thinking from the perspective of the user and what tasks they want to accomplish with the system. Use cases can be divided into Commands and Queries.

**Commands** change the observable state of the system. Examples of commands are:

* Create a new customer (CreateCustomerCommand), Edit an existing customer (EditCustomerCommand)
* Create a new product (CreateProductCommand), Edit an existing product (EditProductCommand), Unlist a listed product (UnlistProductCommand), Relist an unlisted product (RelistProductCommand)
* Create a new order (CreateOrderCommand), Edit an existing order (EditOrderCommand), Submit an order (SubmitOrderCommand), Cancel an order (CancelOrderCommand)

Each command has a corresponding response (e.g. CreateCustomerCommand has the response CreateCustomerCommandResponse).

**Queries** do not change the observable state of the system i.e. no side effects. Examples of queries are:
* Browse customers based on search criteria (BrowseCustomersQuery), View details of a specific customer (ViewCustomerQuery)
* Browse products based on search criteria (BrowseProductsQuery), View details of a specific product (ViewProductQuery), View statistics for popular products (ViewPopularProductStatisticsQuery)
* Browse orders based on search criteria (BrowseOrdersQuery), View details of a specific order (ViewOrderQuery)

Each query has a corresponding response (e.g ViewCustomerQuery has the response ViewCustomerQueryResponse).

**Application Context** provides contextual information associated with commands and queries, including for example details about the current user and their permissions. This is used within Command Handlers and Query Handlers.

**Command Handlers** execute commands. For example, CreateCustomerCommand has the CreateCustomerCommandHandler which accepts CreateCustomerCommand and returns CreateCustomerCommandResponse. The command handlers are as thin as possible, they contain only the application logic, but delegate to the domain layer for executing business logic, i.e. this is the business workflow. This means command handlers often reference factory interfaces, repository interfaces, external service interfaces, and they work with domain objects. The Application Layer depends only on the Domain Layer. For example:
* CreateOrderHandler calls the OrderFactory interface to create a new order, then calls the OrderRepository interface to add that order
* SubmitOrderHandler retrieves the order from the OrderRepository interface, then calls the Submit() method on the retrieved order, and then updates the order by calling the OrderRepository interface.

**Query Handlers** execute queries. It should be noted that the application layer does NOT contain query handlers, because query handlers are not dependent on the domain (i.e. they bypass the domain). So query handlers are implemented in the Infrastructure layer, where relevant performance optimizations can be done (e.g. doing joins to get the right data, or using specialized read models from a separate read database for performance reasons).

_Note I: In the above, we are using CQRS for the Application Layer, for two reasons. One reason is that it fits in well with Use Case Driven Design, since we are thinking at the Use Case level. The other reason is that it enables us to have separation between write and read models, which enables greater control of performance. For simpler applications, Application Services could be used instead, e.g. OrderService which has methods to create order, edit order, submit order, cancel order (i.e. having these as methods instead of classes)._

_Note II: From theoretical standpoint, commands do not return a response. But from a practical perspective, there are debates whether or not commands should return responses, and it's related to the topic if all commands should be asynchronous, i.e. the caller won't know the result but will simply know that the command has started processing. In the Atomiv architecture, we leave this open up to you - if you're returning a response, then you fill the response object (e.g. EditProductCommandResponse w)_


### Domain Layer

The Domain Layer implements the business logic. The Domain Layer is based on Domain Driven Design \(DDD\) principles, containing entities and aggregate roots, value objects and repository interfaces. There model the domain, implement the business logic, the “heart” of the system. 

Business rules:

* **Single root entity business rules**, Business rules that are applicable to an entity's state, and are not dependent on anything else, are implemented inside the Entity. For example, the rule that only draft orders can be submitted is implemented within the Order entity (i.e. when calling the Submit() method, it checks that the current status is draft and then allows the status to go into submitted). In case of violation of these business rules (in constructors and methods), the Entity throws an exception. This means that the entity is guaranteed to be valid when constructed, and that in case of any mutations in state that it continues to be valid.
* **Multiple root entity business rules**, Business rules that affect more than one entity are implemented as domain services. For example, we want to reward loyal customers for purchasing products. So we could have a RewardCustomerService which give a customer and a product, gets the product price and depending on the threshold where its price fits in, it calculates the points that should be rewarded and then adds these points to the customer.
* **Complex business rules**. Complex business rules are implemented using the Policy pattern (Rules Pattern), which may contain references also to other interfaces (like repository interfaces). Examples includes checking that the order date is in the past (by using the TimeService interface), and other rules may be calculating discount (for example discounts due to holidays, or loyal customers, or senior customers, or new customer).


Elements inside the Domain layer:

* **Entities** model key business objects: Customer, Order, Product
* **Identities** are used to identity the identity of entities throughout their entire lifecycle: CustomerIdentity, OrderIdentity, ProductIdentity
* **Factories** are used to construct domain entities: CustomerFactory, OrderFactory, ProductFactory
* **Repositories** are used to retrieve entities from and persist entities to some persistence mechanism: CustomerRepository, OrderRepository, ProductRepository \(note: only the repository interfaces are in the domain layer, not the implementation\)
* *Policies*, *Specifications* and *Rules* are used for specifying more complex business logic, including validation and actions
* *Domain Services* are used to encapsulate more complex logic between root entities (in that case domain has both interface and implementation) as well as as interfaces for external services (e.g. ProductProvider interface which is used as external source for retrieving the products)

_Note I: It should be noted that Domain Entities (i.e. "Entities" in the context of the "Domain") has a different meaning compared to Database Entities (i.e. "Entities" in the context of "Entity Relationship Diagram"). Domain Entities are rich objects that encapsulate business logic, whereas Database Entities are just DTOs._


### Common Layer

Contains data primitives which are shared between Domain and Application. This is included for "pragmatic" reasons.

* **Enums** are used to specify a fixed range of values: OrderStatus, OrderItemStatus

## Infrastructure

The Infrastructure Layer contains the implementations for the interfaces defined in the Core Layer. For example, it contains implementations using ORM’s for data persistence, file system access implementation, email notification implementation.

The Infrastructure Layer contains third-party libraries and frameworks, as well as integration with external systems. The infrastructure contains the implementation for any interfaces which have been declared in the Core Layer. For example, inside the Infrastructure Layer contains repository implementations \(e.g. using ORMs, SQL, NoSQL, etc.\), implementations for messaging and notifications \(e.g. integration with message queues, sending emails, sending SMS’s\), and implementations for integration with any external systems \(e.g. integration with ERP, CRM, any external web services, databases, etc.\). The Infrastructure Layer depends on the Core Layer, but the Core Layer does not depend on the Infrastructure Layer. This means that infrastructural concerns are replaceable \(e.g. switching to a different database system, switching to a different messaging system, switching to other frameworks, etc.\).

Examples for application-level infrastructure:

* **Command Authorizers** are used to specify authorization rules for the execution of Commands: CreateCustomerCommandAuthorizer, SubmitOrderCommandAuthorizer
* **Command Mappers** are used to specify the mapping rules for mapping from domain objects to Command Responses: CreateCustomerCommandResponseProfile, SubmitOrderCommandResponseProfile
* **Command Validators** are used to specify validation rules for validating Commands: CreateCustomerCommandValidator, SubmitOrderCommandValidator
* **Query Authorizers** are used to specify authorization rules for the execution of Queries: ViewCustomerQueryAuthorizer, ViewOrderQueryAuthorizer
* **Query Validators** are used to specify validation rules for validating Queries: ViewCustomerQueryValidator, ViewOrderQueryValidator
* **Query Handlers** are used to specify the the retrieval of data, this is done by directly communicating with the data source and there is no domain logic: ViewCustomerQueryHandler, ViewOrderQueryHandler

Examples for domain-level infrastructure:

* **IdentityGenerators** are used to specify the generation mechanism for unique identifiers \(e.g. sequential guids\): CustomerIdentityGenerator, OrderIdentityGenerator, ProductIdentityGenerator
* **Repositories** are used to implement persistence mechanisms using ORM or raw SQL or stored procedures or any other communication with the underlying data storage: CustomerRepository, OrderRepository, ProductRepository \(these are concrete implementations\)
* **Services** are used to implement any infrastructural services to the support the domain \(e.g. communication with external REST services, external SOAP services, external databases, ERP, CRM, SRM-a, WMS, devices, etc.\): ProductProviderService

Examples for web presentation-level infrastructure:

* **Authentication** implements the authentication mechanism, e.g. OAuth, OpenID Connect, custom authentication, etc.

## DI

The DI Layer contains the dependency injection mechanism, whereby it binds together the implementations from the Infrastructure Layer with the interfaces that have been defined in the Core Layer. This is also known as the “composition root”, because it is at this point, the entry point for the application execution, where the dependencies are composed.

## Presentation

The Presentation Layer presents the application to clients. It is the external interface to the software system. The Web Layer Web Layer serves as a web-based presentation layer, whilst the CLI Layer serves as a console-based application layer. The Web Layer contains REST APIs \(controllers\), SOAP services, and also additionally Web UI clients \(views and controllers\) and JavaScript web clients \(Angular, React, Vue, etc.\). The CLI Layer contains the console application \(console commands\). The Presentation Layer is dependent only on the application service interfaces which are declared in the Application Layer, but is not dependent on Application Layer implementation nor the Domain Layer implementation. On the other hand, the Core Layer does not depend on the Web Layer. This means that the presentation is easily replaceable \(e.g. choosing any frontend implementations\), and it also ensures that the Core Layer can be tested even without the Web Layer.

### REST API

The Web Service Layer contains the implementations for web services which exposed the application services in a web based way. We provide REST API implementations - thin controllers which delegate to the application services, which also forms the microservice boundary. Aside from REST API, SOAP could also be used.

* **Controllers** are the REST API controllers: CustomerController, OrderController, ProductController

### REST API Client

REST API clients are used so that REST API tests are able to connect to the REST API, but may also be used for any other applications which need to access the REST API.

* **Controller Clients** are clients for REST API controllers: CustomerControllerClient, OrderControllerClient, ProductControllerClient

### UI

The UI Layer contains implementations for various clients - web clients, mobile clients, CLI clients, desktop clients. Examples of web clients are: ASP.NET Core MVC apps, Angular apps, react apps, Vue apps, etc.

* **Frontend Client** \(e.g. Angular app, React app, Vue app\)

## Test

The Test Layer contains all the tests - unit tests, integration tests, e2e system tests, for testing the layers mentioned above.

The Test Layer contains all the automated tests - Unit tests, Integration tests and System tests. Testing the Domain Layer is done exclusively through unit tests, because the Domain Layer contains exclusively business logic, and any interfaces to external systems are mocked. Testing the Application Layer is also able to be done via unit tests, to test the application logic. Furthermore, Integration tests can be made for the entire Core Layer, and System tests for the Web Layer.

* **Unit Tests** for testing units: CustomerUnitTest, OrderUnitTest, ProductUnitTest
* **Integration Tests** for testing components / groups of components: CreateCustomerCommandTest, CreateOrderCommandTest, ViewCustomerQueryTest
* **System Tests** for testing the entire system \(backend and frontend\): This is covered within the Quality Assurance section \(Automated Testing\)


## Slices

### Request

Client sends a request to the Presentation Layer.

The Presentation Layer sends the Request to the Application Layer Interface, by calling a method in one of the Application Service Interfaces.

The DI Layer resolves the application service interface based on actual service implementation in the Application Layer Implementation. Furthermore, if the application service interface has dependencies on other interfaces which are in the Application Layer, then those are resolved too.

### Handler

The application service implementation in the Application Layer Implementation handles the request by executing a use case which handles that request, whereby the use case is implemented in the Application Layer Implementation. The DI Layer resolves any dependencies that the use case has, e.g. the DI Layer resolves the repository interfaces based on implementations in the Infrastructure Layer.

The Use Case reads / interprets the Request, and then it handles the request as follows in order to produce a Response: In cases of Query Use Cases, i.e. use cases which only retrieve data but do not do modifications, the Query Use Case will likely call the Repository Interfaces in the Domain Layer to get the aggregate roots \(based on some query\), and then it will generate the Response. In cases of Command Use Cases, i.e. use cases which execute a change on the system, then the Command Use Case will likely call the Repository Interfaces in the Domain Layer to retrieve the aggregate root\(s\), execute some action on the aggregate root \(which internally contains business logic, which is encapsulated\), and then it will add or update or delete the aggregate root via the Repository Interface. Finally, it will generate a Response.

### Response

The Application Layer returns the Response to the Presentation Layer.

The Presentation Layer presents the Response to the client.
