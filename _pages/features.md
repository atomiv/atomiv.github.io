---
layout: page
title: Features
description: Features
---


<!-- Banner -->
<header class="ov-banner">
    <div class="container">
        <!-- <div> -->
            <!-- How Atomiv simplifies complex projects / detangles -->
            <!-- helps teams coolaborate / commuincate / work together -->
            <!-- How Atomiv demystifies complex projects -->
            <!-- Collaborate and develop with Atomiv -->
            <!-- Atomiv helps you collaborate on and develop great IT projects -->
            <h1>Collaborate and develop with Atomiv</h1>
            <div class="d-flex justify-content-center">
                <figure class="figure-features">
                    <img height="" width="" src="{{ site.url }}/img/features/feat0.svg" alt="architecture"	class="img-fluid">
                </figure>
            </div>
        <!-- </div> -->
    </div>
</header>



<!-- Promo / Benefits -->
<article class="ov-benefits22">
    <div class="container">
        <!-- row 1 -->
        <div class="row ov-benefits-row ov-padding-row">
            <div class="col-12 col-md-4 order-md-1 col-img-12">
                <img height="100" width="100" src="{{ site.url }}/img/features/feat1b.svg" alt="architecture"
                class="img-fluid w-100 benefits-img">
            </div>
            <div class="col-12 col-md-8 order-md-0 col-text-1">
                <h5>Process and architecture standardization</h5>
                <p>Atomiv is founded on standardization. It helps to standardize overall project processes, both for project management and development teams. It also standardizes product architecture to speed up software development.  </p>
            </div>
        </div>
        <!-- row 2 -->
        <div class="row ov-benefits-row ov-padding-row">
            <div class="col-12 col-md-4 order-0 col-img-22">
                <img height="100" width="100" src="{{ site.url }}/img/features/feat2.svg" alt="code" class="img-fluid w-100 benefits-img">
            </div>
            <div class="col-12 col-md-8 order-1 col-text-2">
                <h5>Cross cutting infrastructure aspects</h5>
                <p>Atomiv includes common cross cutting infrastructure aspects, including authentication, authorization, validation and logging, as well as databases and web service integraton. It covers common software requirements.</p>
            </div>
        </div>				
        <!-- row 3 pb-0 -->
        <div class="row ov-benefits-row ov-padding-row">
            <div class="col-12 col-md-4 order-md-1 col-img-12">
                <img height="100" width="100" src="{{ site.url }}/img/features/feat3.svg" alt="quality" class="img-fluid w-100 benefits-img">
            </div>
            <div class="col-12 col-md-8 order-md-0 col-text-1">
                <h5>Example-driven and production-ready</h5>
                <p>Atomiv solves one of the key challenges in development team trainings - showing the right examples and ensuring they are production-ready. Developers can see the examples and the adapt to their concrete needs.</p>
            </div>
        </div>
        <!-- row 3 -->
        <div class="row ov-benefits-row ov-padding-row">
            <div class="col-12 col-md-4 order-0 col-img-22">
                <img height="100" width="100" src="{{ site.url }}/img/features/feat4.svg" alt="code" class="img-fluid w-100 benefits-img">
            </div>
            <div class="col-12 col-md-8 order-1 col-text-2">
                <h5>Follows industry best practices</h5>
                <p>Atomiv follows globally recognized best practices in project management and software development. This means your teams get the assurance that they are implementing IT projects in the best way.</p>
            </div>
        </div>
    </div> 
</article>


<h2>Technical Features</h2>

Architecture

* Domain Layer
* Application Layer
* Infrastructure Layer
* Web Layer

Application Layer

* Commands
* Queries
* Command Handlers
* Application Context

Domain Layer:

* Entities
* Value Objects
* Domain Services
* Repository Interfaces

Web Layer - REST API:

* GET - Getting a single resource by id
* GET - Getting all resources (ids, names)
* GET - Paging, sorting, filtering
* GET - Exporting data to a file
* POST - Creating a single resource
* POST - Performing an operation on a single resource
* POST - Importing data from a file
* PUT - Updating a single resource 
* DELETE - Deleting a single resource


Infrastructure Layer - Repositories:

* Repository implementations with ORM
* Repository implementations with raw SQL
* Repository implementations with parameterized SQL
* Repository implementations with stored procedures
* Repository implementations with sql bulk operations (bulk update, bulk delete, bulk insert)
* Repository implementations for batch operations (errors and re-try)
* Repository implementations with NoSQL databases
* Repository implementations with files as source system

Infrastructure Layer - Query Handlers

* Query handlers with ORMs
* Query handlers with mixed data sources and data enrichment

Infrastructure Layer - Files:

* Reading from and writing to various file formats (CSV, TSV, Excel, PDF)
* Importing data from files and other sources (reading, validation, updates)

Infrastructure Layer - Data Sources:

* REST client for communicating with REST services (authentication and executing REST API methods)
* SOAP client for communicating with SOAP services (authentication and executing REST API methods)
* Process client for executing command line processes (executing local process amd remote procedure calls)
* FTP client for communicating with FTP services (uploading files, downloading files, authorization)

Infrastructure - Messaging:

* Sending messages to a message broker
* Receiving messages from a message broker

Infrastructure - Jobs:

* Configuring and executing job schedulers

Infrastructure - Logging:

* Logging to various targets (files, databases)
* Logging with various levels (trace, debug, info, warning, error, critical)

Infrastructure - Authentication:

* OpenId Connect (authentication with an identity provider)
* API Key (authentication via API key)
* OAuth (authentication via OAuth)
* Custom authentication (authentication via custom provider)
* Authentication with Google, Microsoft, LinkedIn, GitHub
* Authentication as part of API and separate
* User identity with custom attributes

Infrastructure - Configuration:

* File-based configuration
* Database-based configuration

Infrastructure - Authorization:

* Role-based authorization
* Group-based authorization
* Permission-based authorization

Infrastructure - Validation:

* Declarative / fluent validation

Infrastructure - Mapping:

* Declarative / fluent mapping

Infrastructure - Alerting:

* Heartbeat checking for key systems
* Sending emails to system administrators in case of failure, error reports



<!--

Asynchronous Processing
Queues - Taking jobs
Producer-consumer pattern
This is useful for cases when we have a service and accept long-running requests

Push notifications - Notifying status
When job finishes, notify clients

-->


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


