---
title: Backend
---


<div class="container mb-5 pb-5">

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