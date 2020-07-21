---
title: Slices
category: software-architecture
author: [ valentina-cupac ]
---


## Request

Client sends a request to the Presentation Layer.

The Presentation Layer sends the Request to the Application Layer Interface, by calling a method in one of the Application Service Interfaces.

The DI Layer resolves the application service interface based on actual service implementation in the Application Layer Implementation. Furthermore, if the application service interface has dependencies on other interfaces which are in the Application Layer, then those are resolved too.

## Handler

The application service implementation in the Application Layer Implementation handles the request by executing a use case which handles that request, whereby the use case is implemented in the Application Layer Implementation. The DI Layer resolves any dependencies that the use case has, e.g. the DI Layer resolves the repository interfaces based on implementations in the Infrastructure Layer.

The Use Case reads / interprets the Request, and then it handles the request as follows in order to produce a Response: In cases of Query Use Cases, i.e. use cases which only retrieve data but do not do modifications, the Query Use Case will likely call the Repository Interfaces in the Domain Layer to get the aggregate roots \(based on some query\), and then it will generate the Response. In cases of Command Use Cases, i.e. use cases which execute a change on the system, then the Command Use Case will likely call the Repository Interfaces in the Domain Layer to retrieve the aggregate root\(s\), execute some action on the aggregate root \(which internally contains business logic, which is encapsulated\), and then it will add or update or delete the aggregate root via the Repository Interface. Finally, it will generate a Response.

## Response

The Application Layer returns the Response to the Presentation Layer.

The Presentation Layer presents the Response to the client.

