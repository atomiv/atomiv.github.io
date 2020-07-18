---
title: Walkthrough
category: dotnet
---


This documentation is still in progress, we are finalizing it during June 2020, this message will disappear when the documentation has been finalized and ready to use.

## Introduction

In this walkthrough, you will familiarize yourself with the template structure, which contains Customers, Products and Orders. We recommend for you to add additional functionality, e.g. Suppliers, to famiarilize yourself with the template.

## Structure

The template project contains the following layers:

* Core
* Infrastructure
* Web
* Test

## Core

### Domain

Domain entities and associated business logic are implemented in the project MyWebShop.Core.Domain.

#### Define an entity and its identity

Entities represent concepts which are uniquely identifiable, and may contain business logic. In the template, entities are Customer, Product and Order. In the following class, we define the Customer entity by inheriting from the Entity base class and specifying that CustomerIdentity is the identifier for Customer entities:

```csharp
    public class Customer : Entity<CustomerIdentity>
    {
        public Customer(CustomerIdentity id, string firstName, string lastName)
            : base(id)
        {
            FirstName = firstName;
            LastName = lastName;
        }

        public string FirstName { get; set; }

        public string LastName { get; set; }
    }
```

An Identity is used to identify an Entity. In this example, CustomerIdentity is used to identify the customer, and the underlying type is Guid:

```csharp
    public class CustomerIdentity : Identity<Guid>
    {
        public CustomerIdentity(Guid value) : base(value)
        {
        }
    }
```

#### Define a factory for the entity

Factories are used to construct new instances of Entities. The following is the interface for the ICustomerFactory:

```csharp
    public interface ICustomerFactory : IFactory
    {
        Customer Create(string firstName, string lastName);
    }
```

The implementation of the factory is inside CustomerFactory:

```csharp
    public class CustomerFactory : ICustomerFactory
    {
        private readonly IIdentityGenerator<CustomerIdentity> _customerIdentityGenerator;

        public CustomerFactory(IIdentityGenerator<CustomerIdentity> customerIdentityGenerator)
        {
            _customerIdentityGenerator = customerIdentityGenerator;
        }

        public Customer Create(string firstName, string lastName)
        {
            var id = _customerIdentityGenerator.Next();

            return new Customer(id, firstName, lastName);
        }
    }
```

#### Define repositories for the entity

Repositories are used to retrieve entities from a persistence mechanism as well as to persist changes in entities \(the underlying persistence mechanism might be an SQL database, or NoSQL database, or file system or anything else - the domain is not concerned with the actual implementation, since that will be handled in the Infrastructure layer:

This is a mutable repository:

```csharp
    public interface ICustomerRepository : IRepository
    {
        Task AddAsync(Customer customer);

        Task<Customer> FindAsync(CustomerIdentity customerId);

        Task RemoveAsync(CustomerIdentity customerId);

        Task UpdateAsync(Customer customer);
    }
```

This is a readonly repository:

```csharp
    public interface ICustomerReadonlyRepository : IRepository
    {
        Task<bool> ExistsAsync(Guid customerId);

        Task<long> CountAsync();
    }
```



### Application

Dtos are referenced in the project Atomiv.Northwind.Core.Application.Dto. For example, we have the SupplierRequest:

In that same project, we also have the SupplierResponse:

 We declare the interfaces for services in the project Atomiv.Northwind.Core.Application.Service. For example, we have the interface ISupplierService:

Then we need to implement the services in the project Atomiv.Northwind.Core.Application.Service.Default. For example, we have implemented SupplierService:

### Infrastructure

Domain We implement repositories using the EntityFrameworkCore implementation in the project Atomiv.Northwind.Infrastructure.Repository.EntityFrameworkCore \(note: we could have used other providers\). For example, we have implemented SupplierRepository:

Inside that same project, we also add the repository SupplierRepository to the unit of work class NorthwindUnitOfWork:

 \#\#\# Application We implement request mapping using AutoMapper in the project Atomiv.Northwind.Infrastructure.Application.Mapping. For example, we have implemented SupplierRequestMapping:

Furthermore, inside that same project we also implement the response mapping. For example, we have implemented SupplierResponseMapping:

 \#\# Web \#\#\# AspNetCore Inside the project Atomiv.Northwind.Web.AspNetCore.Rest, we register the services and the mappings inside Startup. For example, we have registered SupplierService, SupplierRequestMapping and SupplierResponseMapping:

Furthermore, in that project, inside the folder Controllers we also need to implement the controllers. For example, we have implemented SuppliersController:

#### Test

Pending documentation.





