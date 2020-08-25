---
title: Application
category: architecture
authors: [ valentina-cupac]
---

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
