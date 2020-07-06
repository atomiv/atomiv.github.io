---
title: Implementation
category: dotnet
---


## New Projects

The primary intended usage for Atomiv is for building new projects. This is where Atomiv provides the most value - in setting a clean architecture foundation. We recommend the following approach:

1. Install the Atomiv Template via NuGet [https://docs.optivem.com/framework/development/](https://docs.atomiv.com/development) which creates a new Visual Studio solution, with all the layers: Core Layer, Infrastructure Layer, Web Layer, Test Layer
2. Familiarize yourself with the sample code in the generated solution \(bases on the commonly used example in enterprise software - customers, products and orders\), it contains implementation across all layers: Sample REST controllers in the Web Layer, Sample application services and domain entities in the Core Layer, Sample integration with third-party frameworks \(Entity Framework Core, AutoMapper, FluentAssertions, MediatR\) in the Infrastructure Layer, Sample automated tests \(domain unit tests, application service integration tests, REST API integration tests and Selenium system tests\)
3. Based on the sample code, you can starting applying it to your project - i.e. to create relevant REST controllers, application services, domain entities, etc. by following the standardized structure, and when you're comfortable with that you can later delete the sample code
4. In the case that you want to work with additional third-party libraries or replace the default the default third-party libraries included within Atomiv Infrastructure, you can freely do so, by implementing wrappers for any other third-party libraries

_Note: We are also in the process of releasing automated code generation functionality for Atomiv, whereby it will generate classes for your entities across all layers._

## Existing Projects

A lot of software development revolves in working with existing software systems, by extending them with new features and bug fixing. When working with existing systems, it may be too difficult or risky or expensive to attempt major refactoring or system overhaul, and for that reason we recommend an incremental quality improvement approach using the Atomiv:

1. As a first \(less-invasive\) step, you can use the Atomiv Infrastructure packages individually - using them as you would use other NuGet libraries - with examples as follows: using Atomiv HTTP clients \(based on System.Net\), Csv Serializers \(based on CsvHelper\), Excel readers and writers \(based on EPPlus\), and generic repository and unit of work implementations \(implemented on top of Entity Framework Core 2\) and system utilities \(working with DataTables, reflection, parsing\), and web utilities \(exception handlers, validation responses, CSV formatters for ASP.NET Core\), and automated testing wrappers \(wrappers for automated web testing based on Selenium\)
2. As a next \(more invasive\) step, you can switch to Domain Driven Design \(DDD\) and use-case driven approach by implementing the interfaces from Atomiv Core packages \(Domain and Application\), which would involve refactoring your code into properly separated application services, use cases, entities, value objects, etc.
3. Last, but not least, in cases where changing the existing system is not feasible, we recommend using Atomiv when your team is assigned with the next bigger features or modules - to consider implementing them as microservices, using the Atomiv Template to create the microservice, whereby the old legacy application can communicate with the new microservice, and gradually other parts of the old application may be migrated too

In summary, Atomiv can be used both for new and existing projects - in both cases it will help your team to produce high quality solutions.

