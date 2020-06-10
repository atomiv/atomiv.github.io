---
layout: templates
title: System
permalink: /software-architecture/system
vversion: 3
---


## {{page.permalink}} 

# System

Atomiv was envisioned to help you design and implement high quality architectures for software projects and products. Atomiv provides a templated solution architecture based on well-known best practices in clean architecture.

![Architecture diagram](https://atomiv.github.io/img/architecture-layers.svg)

### History

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

### Dependencies

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



