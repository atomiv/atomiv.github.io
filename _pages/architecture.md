---
layout: page
title: Architecture
description: Best practices in software architecture
---

# Some heading

## Some subheading

This is some paragraph.

This is another paragraph.


Introduction
One of the key challenges in software development is the overall productivity of the development team and consequently - the total cost of ownership, i.e. cost of development and cost of maintenance. One of the key factors which affect the total cost of software development is the software architecture.  

Quoting Uncle Bob (Clean Architecture), "The goal of software architecture is to minimize the human resources required to build and maintain the required system" and that the ultimate goal is "to minimize the lifetime cost of the system and to maximize programmer productivity". Architectural decisions are the “big” decisions which affect the structure of the software solution and which later become apparent when we analyze developer productivity, particularly during software maintenance.

Atomiv was envisioned to help you design and implement high quality architectures for software projects and products. Atomiv provides a templated solution architecture based on well-known best practices in clean architecture:
Objectives
The objectives of Atomiv Architecture Standards are are to develop software architecture systems which satisfy the following characteristics:

Modularity & re-usability
Extensibility & flexibility
Maintainability & testibility
Scalability and portability

This enables software teams to achieve the following:

Decrease overall development and maintenance costs
Enable high level of testability and high quality level
Provide a standardized foundation for software development teams
Foundations
The historical foundations of Atomiv Architecture Standards are based on the following architectures from globally recognized experts in software architecture:

​​Clean Architecture (Robert C. Martin)​
Onion Architecture (Jeffrey Palermo)​
Hexagonal Architecture, aka. Ports and Adapters (Alistair Cockburn) 

Furthermore, it is rooted in the following design and development approaches:

Domain Driven Design (DDD) (Eric Evans)
Use Case Driven Design (UCDD)
Test Driven Development (TDD) (Kent Beck)
Acceptance Test Driven Development (ATDD)
Behavior Driven Development (BDD)
Standards
System



Layers
Core
At the system center, we have the Core Layer, composed of the Domain Layer and Application Layer. The Domain Layer implements the business logic. The Application Layer contains thin application services, which execute use cases (and use cases delegate execution to the domain). Inside the Core Layer, any external dependencies are interfaces (e.g. Domain Layer contains repository interfaces for data persistence).

The Core Layer contains the Domain Layer and Application Layer. The Domain Layer is based on Domain Driven Design (DDD) principles, containing entities and aggregate roots, value objects and repository interfaces. There model the domain, implement the business logic, the "heart" of the system. The Application Layer consists of application services, which in turn execute use cases, these manage the flow, for example, calling repositories to retrieve aggregate roots, executing some actions, and then persisting the aggregate roots. The Application Layer consists of the Application Layer interfaces (application service interfaces) and Application Layer implementation (application service implementation, use case implementation). The Domain Layer is self-contained, and the Application Layer depends only on the Domain Layer.
Infrastructure
The Infrastructure Layer contains the implementations for the interfaces defined in the Core Layer. For example, it contains implementations using ORM's for data persistence, file system access implementation, email notification implementation.

The Infrastructure Layer contains third-party libraries and frameworks, as well as integration with external systems. The infrastructure contains the implementation for any interfaces which have been declared in the Core Layer. For example, inside the Infrastructure Layer contains repository implementations (e.g. using ORMs, SQL, NoSQL, etc.), implementations for messaging and notifications (e.g. integration with message queues, sending emails, sending SMS's), and implementations for integration with any external systems (e.g. integration with ERP, CRM, any external web services, databases, etc.). The Infrastructure Layer depends on the Core Layer, but the Core Layer does not depend on the Infrastructure Layer. This means that infrastructural concerns are replaceable (e.g. switching to a different database system, switching to a different messaging system, switching to other frameworks, etc.).
Web Service
The Web Service Layer contains the implementations for web services which exposed the application services in a web based way. We provide REST API implementations - thin controllers which delegate to the application services, which also forms the microservice boundary. Aside from REST API, SOAP could also be used.
UI
The UI Layer contains implementations for various clients - web clients, mobile clients, CLI clients, desktop clients. Examples of web clients are: ASP.NET Core MVC apps, Angular apps, react apps, Vue apps, etc.

The Presentation Layer presents the application to clients. It is the external interface to the software system. The Web Layer Web Layer serves as a web-based presentation layer, whilst the CLI Layer serves as a console-based application layer. The Web Layer contains REST APIs (controllers), SOAP services, and also additionally Web UI clients (views and controllers) and JavaScript web clients (Angular, React, Vue, etc.). The CLI Layer contains the console application (console commands). The Presentation Layer is dependent only on the application service interfaces which are declared in the Application Layer, but is not dependent on Application Layer implementation nor the Domain Layer implementation. On the other hand, the Core Layer does not depend on the Web Layer. This means that the presentation is easily replaceable (e.g. choosing any frontend implementations), and it also ensures that the Core Layer can be tested even without the Web Layer.
DI

The DI Layer contains the dependency injection mechanism, whereby it binds together the implementations from the Infrastructure Layer with the interfaces that have been defined in the Core Layer. This is also known as the "composition root", because it is at this point, the entry point for the application execution, where the dependencies are composed.
Test
The Test Layer contains all the tests - unit tests, integration tests, e2e system tests, for testing the layers mentioned above.

The Test Layer contains all the automated tests - Unit tests, Integration tests and System tests. Testing the Domain Layer is done exclusively through unit tests, because the Domain Layer contains exclusively business logic, and any interfaces to external systems are mocked. Testing the Application Layer is also able to be done via unit tests, to test the application logic. Furthermore, Integration tests can be made for the entire Core Layer, and System tests for the Web Layer.
Dependencies
To summarize, the dependencies are as follows:
The Core Layer is self-contained and it does not dependent on any other layers.
The Domain Layer does not have dependencies on other layers. 
The Application Layer Interface do not contain dependencies on other layers. 
The Application Layer Implementation depends both on Application Layer interfaces and the Domain Layer.

Other layers contain dependencies as follows:
The Infrastructure Layer depends on the Core Layer, because it implements the interfaces defined in the Core Layer. Thus, it is an "implementation detail" with ORM's, frameworks and external systems.
The Presentation Layer depends on the Application Layer interfaces. 
The DI Layer depends on the Core Layer and the Infrastructure Layer.
The Test Layer depends on the layers it is testing.

The core benefits is that due to the independence of the Application Core, it ensures separation of concerns and modularity, swappability of databases, UIs and any frameworks, and also enables the system to be testable. These factors increase system quality and decreasing overall total development and maintenance cost.
Flow
The flow is as follows:

Client sends a request to the Presentation Layer.
The Presentation Layer sends the Request to the Application Layer Interface, by calling a method in one of the Application Service Interfaces.
The DI Layer resolves the application service interface based on actual service implementation in the Application Layer Implementation. Furthermore, if the application service interface has dependencies on other interfaces which are in the Application Layer, then those are resolved too.
The application service implementation in the Application Layer Implementation handles the request by executing a use case which handles that request, whereby the use case is implemented in the Application Layer Implementation.  The DI Layer resolves any dependencies that the use case has, e.g. the DI Layer resolves the repository interfaces based on implementations in the Infrastructure Layer.
The Use Case reads / interprets the Request, and then it handles the request as follows in order to produce a Response:
In cases of Query Use Cases, i.e. use cases which only retrieve data but do not do modifications, the Query Use Case will likely call the Repository Interfaces in the Domain Layer to get the aggregate roots (based on some query), and then it will generate the Response.
In cases of Command Use Cases, i.e. use cases which execute a change on the system, then the Command Use Case will likely call the Repository Interfaces in the Domain Layer to retrieve the aggregate root(s), execute some action on the aggregate root (which internally contains business logic, which is encapsulated), and then it will add or update or delete the aggregate root via the Repository Interface. Finally, it will generate a Response.
The Application Layer returns the Response to the Presentation Layer.
The Presentation Layer presents the Response to the client.
Templates
We provide templates based on Atomiv Architecture Standards. These templates provide a ready-made project with all the layers described above as well as sample code.
Backend Templates
.NET Core Template
[Insert link]
Java Spring Template
[Insert link]
PHP Laravel Template
[Insert link]
Frontend Templates
Angular Template
[Insert link]
React Template
[Insert link]
Vue Template
[Insert link]
