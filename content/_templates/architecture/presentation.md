---
title: Presentation
category: architecture
authors: [ valentina-cupac]
---

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