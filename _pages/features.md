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


<div class="container">

<h2>Technical Features</h2>

<b>Architecture</b>

<ul>
<li>Domain Layer [DONE]</li>
<li>Application Layer [DONE]</li>
<li>Infrastructure Layer [DONE]</li>
<li>Web Layer [DONE]</li>
</ul>

<b>Application Layer</b>

<ul>
<li>Commands [DONE]</li>
<li>Queries [DONE]</li>
<li>Command Handlers [DONE]</li>
<li>Application Context [DONE]</li>
</ul>

<b>Domain Layer</b>

<ul>
<li>Entities [DONE]</li>
<li>Value Objects [DONE]</li>
<li>Domain Services [DONE]</li>
<li>Repository Interfaces [DONE]</li>
</ul>

<b>Common Layer</b>

<ul>
<li>Enums [DONE]</li>
<li>Resource Translations [TODO]</li>
</ul>

<b>Web Layer - REST API</b>

<ul>
<li>GET - Getting a single resource by id [DONE]</li>
<li>GET - Getting all resources (ids, names) [DONE]</li>
<li>GET - Paging, sorting, filtering [DONE]</li>
<li>GET - Exporting data to a file [TODO]</li>
<li>POST - Creating a single resource [DONE]</li>
<li>POST - Performing an operation on a single resource [DONE]</li>
<li>POST - Importing data from a file [TODO]</li>
<li>PUT - Updating a single resource [DONE]</li>
<li>DELETE - Deleting a single resource [DONE]</li>
</ul>

<b>Infrastructure Layer - Repositories</b>

<ul>
<li>Repository implementations with ORM [DONE]</li>
<li>Repository implementations with raw SQL, parameterized SQL, stored procedures[TODO]</li>
<li>Repository implementations with sql bulk operations (bulk update, bulk delete, bulk insert) [TODO]</li>
<li>Repository implementations for batch operations (errors and re-try) [TODO]</li>
<li>Repository implementations with NoSQL databases [TODO]</li>
<li>Repository implementations with files as data source [TODO]</li>
</ul>

<b>Infrastructure Layer - Query Handlers</b>

<ul>
<li>Query handlers with ORMs [DONE]</li>
<li>Query handlers with mixed data sources and data enrichment [TODO]</li>
</ul>

<b>Infrastructure Layer - Files</b>

<ul>
<li>Reading from and writing to various file formats (CSV, TSV, Excel, PDF) [IN PROGRESS]</li>
<li>Importing data from files and other sources (reading, validation, updates) [TODO]</li>
</ul>

<b>Infrastructure Layer - Data Sources</b>

<ul>
<li>REST client for communicating with REST services (authentication and executing REST API methods) [DONE]</li>
<li>SOAP client for communicating with SOAP services (authentication and executing SOAP methods) [TODO]</li>
<li>Process client for executing command line processes (executing local process amd remote procedure calls) [DONE]</li>
<li>FTP client for communicating with FTP services (uploading files, downloading files, authorization) [TODO]</li>
</ul>

<b>Infrastructure Layer - Messaging</b>

<ul>
<li>Sending messages to a message broker [TODO]</li>
<li>Receiving messages from a message broker [TODO]</li>
</ul>

<b>Infrastructure Layer - Jobs</b>

<ul>
<li>Configuring and executing job schedulers [DONE]</li>
</ul>

<b>Infrastructure Layer - Logging</b>

<ul>
<li>Logging to various targets (files, databases) [TODO]</li>
<li>Logging with various levels (trace, debug, info, warning, error, critical) [TODO]</li>
</ul>

<b>Infrastructure Layer - Authentication</b>

<ul>
<li>OpenId Connect (authentication with an identity provider) [IN PROGRESS]</li>
<li>API Key (authentication via API key) [TODO]</li>
<li>OAuth (authentication via OAuth) [TODO]</li>
<li>Custom authentication (authentication via custom provider) [DONE]</li>
<li>Authentication with Google, Microsoft, LinkedIn, GitHub [TODO]</li>
<li>Authentication as part of API and separate [TODO]</li>
<li>User identity with custom attributes [TODO]</li>
</ul>

<b>Infrastructure Layer - Configuration</b>

<ul>
<li>File-based configuration [DONE]</li>
<li>Database-based configuration [TODO]</li>
<li>Multiple environments [TODO]</li>
</ul>

<b>Infrastructure Layer - Authorization</b>

<ul>
<li>Role-based authorization [DONE]</li>
<li>Group-based authorization [TODO]</li>
<li>Permission-based authorization [DONE]</li>
</ul>

<b>Infrastructure Layer - Validation</b>

<ul>
<li>Declarative / fluent validation [DONE]</li>
</ul>

<b>Infrastructure Layer - Mapping</b>

<ul>
<li>Declarative / fluent mapping [DONE]</li>
</ul>

<b>Infrastructure Layer - Alerting</b>

<ul>
<li>Heartbeat checking for key systems [TODO]</li>
<li>Sending emails to system administrators in case of failure, error reports [TODO]</li>
</ul>

<b>Test Layer</b>

<ul>
<li>Unit tests [DONE]</li>
<li>Integration tests [DONE]</li>
</ul>


</div>






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


