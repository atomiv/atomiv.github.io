---
title: Design Patterns
category: software-architecture
authors: [ valentina-cupac ]
---

## Purpose

Design patterns can be classified as:

* Creational patterns - dealing with the process of object creation
* Structural patterns - dealing with the composition of objects or classes
* Behavioral patterns - characterizing the ways that classes or objects interact and distribute responsibility


## Creational Patterns

Class scope:

* Factory method - Enables a class to defer instatiation to subclasses by defining an interface for creating an object and then letting suclasses decide which class to instantiate

Object scope:

* Abstract Factory - Provides an interface for contructing a family of related objects but without specifying their concrete classes
* Builder - Used to separate the construction of a complex object from the way that it is represented, so that different representations can be created via the same construction process
* Prototype - Enables the use of a prototypical instance to specify kinds of objects to create and creates new objects via copying the prototype
* Singleton - Enables a class to have only a single instance and provides a single global accss to

## Structural Patterns

Class scope:

* Adapter - Converts an interface into another interface expected by clients, thus resolving interface incompatibility and enabling classes to work together which otherwise wouldn't have been able to work with each other

Object scope:

* Adapter - See above
* Bridge - Enables decoupling between an abstraction and its implementation so that they can vary independently
* Composite - Enables clients to handle individual objects and compositions of individual objects in the same way, by composing objects into tree structures
* Decorator - Enables us to extend functionality by adding additional responsibilities to an object dynamically, instead of subclassing
* Facade - Provides a unified interface which makes subsystems easier to use so that clients don't have to directly deal with the subsystems
* Proxy - Provides a surrogate or placeholder for some other object in order to control access to that object

## Behavioral Patterns

Class scope:

* Interpreter - Enables us to define a representation of a grammar for a given language and the interpreter so that this can be used to intepret sentences of that language
* Template Method - Enables a class to define a skeleton of an algorithm but deferring some steps to be implemented by the subclasses, but without changing the algorithm structure

Object scope:

* Chain of Responsibility - Decouples the sender and the receiver of a request by enacling multiple objects to handle the request, whereby receiving objects are chained and the request is passed along the chain until an object handles it
* Command - Enables us to enacapsulate a request as an object, so that clients can be parametrized with different requests (as well as queuing requests, logging requests and undoing operations)
* Iterator - Enables clients to access elements in an aggregate object in a sequence but without exposing the underlying structure
* Mediator - Enables us to achieve loose coupling between objects by enpsulating their interactions so that they don't have to refer to each other explicitly
* Memento - Externalizes an object's internal state (but without violating encapsulation) in order to enable the object to be restored to this state later
* Flyweight - A shared object which can be simulatenously used in multiple contexts but acting as an independent object (i.e. as if not shared), and this is used to supporting sharing a large number of fine-grained objects efficiently
* Observer - Enables communication between objects without them directly depending on each other, so that when the state of one object changes that its dependents are notified automatically
* State - Enables objects to alter their behaviour based on changes in internal state, whereby the object appears to change class when it changes state
* Strategy - Encapsulates algorithms and makes them interchangeable so that algorithms can vary independently of clients
* Visitor - Enables you to define an operation to be performed on elements of an object structure without changing the classes of the elements on which it operates

## References

* https://medium.com/@buihuycuong/the-23-gang-of-four-design-patterns-974ae8d1a957
* https://www.d.umn.edu/~gshute/softeng/new/design_patterns/design_patterns.xhtml