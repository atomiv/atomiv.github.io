---
title: Domain
category: architecture
authors: [ valentina-cupac]
---

The Domain Layer implements the business logic. The Domain Layer is based on Domain Driven Design \(DDD\) principles, containing entities and aggregate roots, value objects and repository interfaces. There model the domain, implement the business logic, the "heart" of the system. 

## Entity

**Theory**

When we're modelling, the first step is to identify the entities, the things in a system which have a unique identity and a thread of continuity. The equivalence of entities is determined by their Id.

**Practice**

Entities within the template are:
* Customer
* Product
* Order
* OrderItem

The Atomiv Framework includes a base Entity class, which has an identity field. This is a convenience class to reduce code.

## Aggregates

**Theory**

An aggregate is an entity or a collection of entities which are are treated as a transactional unit.

**Practice**

Aggregates in the template:
* Customer Aggregate consists of entities: Customer
* Product Aggregate consists of entities: Product
* Order Aggregate consists of entities: Order, OrderItem

Aggregate Roots in the template:
* Customer
* Product
* Order


## Value Objects

**Theory**

Value objects are immutable types which are distinguishable only by properties, but not by identity.

**Practice**
Value objects within the template are:
* Money
* ExchangeRate


## Identity

**Theory**

Each entitity has a unique identity. The identity encapsulates

**Practice**

Identities within the template are:
* CustomerIdentity
* ProductIdentity
* OrderIdentity
* OrderItemIdentity

## Factories

**Theory**

Factories are used to encapsulate the creation of 




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