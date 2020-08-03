---
title: Design Principles
category: software-architecture
authors: [ valentina-cupac ]
---

## SOLID

**Single Reponsibility Principle** states that a class should have one, and only one, reason to change. For example, if we have an order printer, which both creates a PDF file and then sends it to a printer to print, it is violating this principle, because now the class can change for two reasons - either due to changes in the PDF file formatting or due to changes in printing settings, so then it should be split into two classes, so that each one has a single resonsibility, one class for PDF creation and another class for printing. This leads to benefits - each class has a single focus, it has less code, easier to maintain, and there are less unexpected side-effects.

**Open/Closed Principle** states that software classes / modules / functions should be open for extension but closed for modification. This means writing code so that new functionality can be added without changing the existing code. One way to do this is via inheritance (adding new subclasses to add new features, so that the base class is not changed). But the alternative (and better) way is the Polymorphic Open/Closed Principle, using interfaces instead of base classes which allows different implementations, and they can be substituted without changing the code that uses them - whereby the interfaces are closed for modifications but new implementations can be added to extend functionality. Example of this is creating an interface for a PDF generator, and having different implementations whereby they might all take the same input data but may render it differently.

**Liskov Substitution Principle** states that objects of a base class should be replacable by objects of its subclasses without breaking the application, i.e. objects of subclasses should behave in the same way as objects of the base class. This means subclasses need to accept same parameter values as the base class, and that you cannot implement stricter validation rules than in the base class. Similarly for returning values, needs to comply with the return value of the superclass (or can be more strict). 

**Interface Segregation Principle** states that clients should not be forced to depend upon interfaces that they do not use. This is similar to the Single Respnbility Principle, but applied to interfaces.

**Dependency Inversion Principle** is about the direction of dependencies. Firstly, it states that high level modules should not depend on low level modules, instead both should depend on abstractions. Secondly, it states that abstraction should not depend on details, and that details should depend on abstractions.


## References

* https://stackify.com/solid-design-principles/