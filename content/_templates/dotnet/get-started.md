---
title: Get Started
category: dotnet
---


This documentation is still in progress, we are finalizing it during June 2020, this message will disappear when the documentation has been finalized and ready to use.

## Prerequsites

Ensure you have the following installed for running the application:

* [https://dotnet.microsoft.com/download/dotnet-core](https://dotnet.microsoft.com/download/dotnet-core) \(we have used .NET Core SDK 3.1\)
* [SQL Server 2017 Developer](https://www.microsoft.com/en-us/sql-server/sql-server-downloads)

Additionally, the following should be installed (for developers):
* [https://visualstudio.microsoft.com/downloads/](https://visualstudio.microsoft.com/downloads/) \(we have used Visual Studio Community 2019, and installed via the Visual Studio Installer: ASP.NET and web development\)
* [SQL Server Management Studio 17.9.1](https://docs.microsoft.com/en-us/sql/ssms/download-sql-server-management-studio-ssms?view=sql-server-2017).

## Template Installation

Note: If you're using Visual Studio, then: Run Visual Studio \(in the "Getting Started", select "Continue without code"\), use the Package Manager Console \(Tools &gt; NuGet Package Manager &gt; Package Manager Console\) to install the Atomiv Template \(in the future you can also uninstall and re-install newer versions\):

Run the following command:

```text
dotnet new -i Atomiv.Templates
```



## Create project

Create the directory for your new project \(MyWebShop\) and go inside that directory:

```text
mkdir MyWebShop
cd MyWebShop
```

Create a new solution \(MyWebShop.sln\) based on the template inside that directory:

```text
dotnet new atomiv
```

You should see output like:

```text
The template "Atomiv" was created successfully.
```

## Open project

Note: If you're using Visual Studio, then open the solution \(MyWebShop.sln\) and set MyWebShop.Web.RestApi as the StartUp project.

Build the solution:

```text
dotnet build
```

You should see output like:

```text
Microsoft (R) Build Engine version 16.5.0+d4cbfca49 for .NET Core
Copyright (C) Microsoft Corporation. All rights reserved.
...
Build succeeded.
...
```

## Create database

Note: If needed, you can adjust the database connection \(inside the project MyWebShop.Web.RestApi, open up the file appsettings.Development.json and ensure that DefaultConnection is appropriately set to your development database server, note that the database does not exist\) yet. 

Run the command to create the database:

```text
dotnet ef database update --project .\src\Tools\MyWebShop.Tools.Migrator
```

You should see outout like:

```text
Build started...
Build succeeded.
The environment is Development.
Applying migration ...
Applying migration ...
Done.
```

You can verify inside SQL Server Management Studio that the database has been created.

## Run project

Run the project from the command line:

```text
dotnet run --project .\src\Web\MyWebShop.Web.RestApi
```

You will see output here, including the environment and the url:

```text
Hosting environment: Development
Content root path: C:\Users\Valentina.Cupac\source\repos\MyWebShop\src\Web\MyWebShop.Web.RestApi
Now listening on: http://localhost:5100
Now listening on: https://localhost:5101
Application started. Press Ctrl+C to shut down.
```

At the end, type in Ctrl+C to shut down the API.

Note: If you're using Visual Studio, then you can run the application in Debug mode. The application opens up automatically, e.g. [https://localhost:44315/](https://localhost:44315/api/values). You can stop debugging at the end.

## Manual tests

You can manually run the REST API via Swagger. Go to [https://localhost:5101](https://localhost:5101) and you will see the Swagger page.

Click on POST /api/customers, then click on "Try it out", then click on "Execute". Check that you see the response code 201.

You can also run this test via Postman.

You can also execute API calls via swagger, e.g. [https://localhost:44315/swagger/index.html](https://localhost:44315/swagger/index.html) and verify that the response is successful. \(Note that the port on your computer may differ from the port here.\) Finally, at the end you can stop debugging.

## Automated tests

You can run tests via the command:

```text
dotnet test
```

You should see output like:

```text
Microsoft (R) Test Execution Command Line Tool Version 16.5.0
Copyright (c) Microsoft Corporation.  All rights reserved.

Starting test execution, please wait...

...

Test Run Successful.
```

Note: If you're using Visual Studio, then to run the automated tests, open up the Test Explorer \(Visual Studio main menu: Test &gt; Windows &gt; Test Explorer\) and rebuild the solution to discover all the tests. For Integration and System tests, you can set the database connection string \(opening up appsettings.Test.json inside the test projects and setting a value for DefaultConnection\). Click on “Run All” inside the Test Explorer \(all tests should pass\).

## Custom development - Overview

We recommend you familiarize yourself with the solution and then you can adapt it to your own needs. This current template uses the eCommerce sample, with Customers, Products and Orders. However, let's say you're making an application for dentists, you could have Dentists, Patients and Appointments, etc.

## Custom development - Migrations

To add a new migration:

```text
PM> dotnet ef migrations add NameOfTheNewMigration --project .\src\Tools\MyWebShop.Tools.Migrator
```

To remove the last run migration:

```text
PM> dotnet ef migrations remove --project .\src\Tools\MyWebShop.Tools.Migrator
```

To update the database based on migrations:

```text
PM> dotnet ef database update --project .\src\Tools\MyWebShop.Tools.Migrator
```
