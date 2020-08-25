---
title: Dependency Injection
category: architecture
authors: [ valentina-cupac]
---

The DI Layer contains the dependency injection mechanism, whereby it binds together the implementations from the Infrastructure Layer with the interfaces that have been defined in the Core Layer. This is also known as the “composition root”, because it is at this point, the entry point for the application execution, where the dependencies are composed.