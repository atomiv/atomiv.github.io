---
layout: page
title: Features
description: Features
---

## Productivity Features

The goal of Atomiv is, first and foremost, to help IT leaders provide their teams with a foundation to successfully achieve the above goals:

* Atomiv provides a project template, thereby decreasing the initial up-front effort needed by your team to get started
* Atomiv has a well-defined software architecture, based on industry best practices, ensuring that software is maintainable and extensible in the future
* Atomiv has in-built components for automated testing of web services and web applications, providing a foundation for quality automation from the start
* Atomiv provides predefined components for common technical tasks so that your teams write less code
* Atomiv is highly flexibility, so that your team is free to integrate with existing technologies or to make fully custom components
* Atomiv is built in a standardized way, so that you can use it for any project or product, and make it easy to integrate new team members, decreasing training time
* Atomiv is optimized for high performance, especially for database integration
* Atomiv is designed in a modular way with interfaces, making it easy for team members to work in parallel

In summary, Atomiv will help your teams achieve the following:

* Build consistently high quality software
* Deliver software faster than ever before
* Make your customers happy


## Business Features

The Atomviv template provides an example of implementing functional requirements for a company which purchases products from suppliers and then sells them to customers. This was chosen because it's a very popular and well-known domain, so we used it to illustrate sample implementation. The following is an overview of the use cases implemented.

Customers:

* Creating customers
* Editing customer details
* Deactivating customers
* Browsing customers
* Viewing a customer

Orders:

* Creating draft orders
* Editing draft orders
* Submitting orders
* Cancelling orders
* Archiving orders
* Browsing orders
* Viewing an order

Products:

* Creating products
* Editing product details
* Unlisting products
* Relisting products
* Syncing products with external sources
* Browsing products
* Viewing a product

## Architecture Features

Atomiv architecture is built based on the following architecture and design approaches:

* Clean Architecture
* Domain Driven Design
* Use Case Driven Design
* Test Driven Design

Architecture template features:

* Extensibility: Ready made template provides the setup for the software architecture. Architecture includes REST API, application, domain, database connectivity (supports swapping).
* Productivity: Easy. Simple. Fast. Create controllers, services and repositories in minutes. We've dramatically reduced the amount of code you need to write to get the system up and running.
* Quality: Follow best practices in architecture, modularisation, separation of web, business and data access layers. Build high quality easily maintenable and extensible apps.


## Technical Features

The following are the technical features of Atomiv (note: some of these are pending to be implemented):

* Authentication: Authentication including Open Id Connect, OAuth, and custom authentication to help you build secure websites
* Authorization: Role based and permission based authorization to ensure access controls
* Validation: Validation as well as validation error handling
* Localization: Localization to enable both translations and regional settings
* Logging: Logging of errors
* CRUD operations: Basic operations like creating, updating, deleting and viewing data records
* Actions and statuses: Examples for operations like approving, cancelling, etc. to show operations and statuses
* Data tables, filtering and pagination: Data tables for browsing through data, including filtering and pagination


Technologies supported:

* .NET Core 3.1 - Currently, Atomiv is focused on backend web development and it targets .NET Core 3.1.
* Java Spring - In the future, we plan to support Java 9, using Spring Framework, Hibernate, etc. This section will be updated with instructions.
* PHP Laravel - In the future we plan to support PHP using Laravel.

## Technical Features (.NET Core 3.1)

For .NET Core 3.1:

* Atomiv includes a template, which can be installed via NuGet - and after inputting the project name, a new solution will be generated for you with all the architectural layers and with sample code (customers, products and orders) which can be used a starting point and practical example for implementation
* Atomiv provides standardized implementation for CRUD operations across all layers of the sofware (from REST controllers, to application services, to repositories)
* Atomiv has pre-packaged popular NuGet packages, including Entity Framework Core 2, FluentAssertions, AutoMapper, MediatR, which are used for implementation in the infrastructure layer - however, these are defaults, so you are not locked in but can choose other packages and provides, because Atomiv relies on interfaces so that third party libraries and frameworks are easily swappable
* Atomiv is designed to be high performance, especially efficient operations with  Entity Framework Core 2 - efficiently working with large data sets
* Atomiv contains components which simplify automated testing, especially Selenium and REST API testing, so that automated tests can be produced faster and with less code



<!-- TODO: VC: Adding in details regarding the templates -->

<!--
TEMPLATES

These would be row-based, including title, paragraph and then a screencast, and it would also link to the menu items

Backend (screencast: installing and running template in Visual Studio, shows Swagger)
Frontend (screencast: installing and running template in Visual Studio Code, shows screen)
QA (screencast: installing and running template in Visual Studio, shows Test Explorer)
DevOps (future)
PM (future)
BA (future)
Process (screencast: viewing/downloading the templates for documents/process)
-->