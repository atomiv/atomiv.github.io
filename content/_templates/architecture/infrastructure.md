---
title: Infrastructure
category: architecture
authors: [ valentina-cupac]
---

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