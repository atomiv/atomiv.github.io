---
layout: templates
title: Layers
permalink: /software-architecture/layers
vversion: 3
---


## {{page.permalink}} 

# Layers

## Core

At the system center, we have the Core Layer, composed of the Domain Layer and Application Layer.

### Domain Layer

The Domain Layer implements the business logic. The Domain Layer is based on Domain Driven Design \(DDD\) principles, containing entities and aggregate roots, value objects and repository interfaces. There model the domain, implement the business logic, the “heart” of the system. 

Examples:

* **Entities** model key business objects: Customer, Order, Product
* **Identities** are used to identity the identity of entities throughout their entire lifecycle: CustomerIdentity, OrderIdentity, ProductIdentity
* **Factories** are used to construct domain entities: CustomerFactory, OrderFactory, ProductFactory
* **Repositories** are used to retrieve entities from and persist entities to some persistence mechanism: CustomerRepository, OrderRepository, ProductRepository \(note: only the repository interfaces are in the domain layer, not the implementation\)
* **External Services** \(interfaces\)

### Application Layer

The Application Layer contains thin application services, which execute use cases \(and use cases delegate execution to the domain\). Inside the Core Layer, any external dependencies are interfaces \(e.g. Domain Layer contains repository interfaces for data persistence\). The Application Layer consists of application services, which in turn execute use cases, these manage the flow, for example, calling repositories to retrieve aggregate roots, executing some actions, and then persisting the aggregate roots. The Application Layer consists of the Application Layer interfaces \(application service interfaces\) and Application Layer implementation \(application service implementation, use case implementation\). The Domain Layer is self-contained, and the Application Layer depends only on the Domain Layer.

Examples:

* **Commands** specify "write" operations, e.g. creating, updating, performing actions, etc: CreateCustomerCommand, CreateOrderCommand, SubmitOrderCommand, EditProductCommand, etc.
* **Queries** specify "read" operations, e.g. reading data: BrowseCustomerQuery, ViewCustomerQuery, FilterCustomersQuery, BrowseOrdersQuery, etc.
* **Command Handlers** implement the actions associated with specific Commands, they implement application-level logic and delegate to the domain for business logic execution and also repository interfaces \(handlers should be thin, manage flow of actions\): CreateCustomerCommandHandler, CreateOrderCommandHandler, SubmitOrderCommandHandler, EditProductCommandHandler
* **Application Context** is an application service which provides contextual information associated with some requests

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



