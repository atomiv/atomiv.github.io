---
layout: templates
title: Domain Driven Design
permalink: /software-architecture/domain-driven-design
vversion: 3
vversion2: 3
---

## Definition

Domain Driven Design (DDD) is a conceptual software framework for developing business applications, created by [Eric Evans](https://twitter.com/ericevans0?lang=en) and initially described in his famous [Blue Book](https://domainlanguage.com/ddd/blue-book/)

## Terminology

* Core domain
    - subdomain
* Business logic/business value
* Ubiquitous language
* Communication/collaboration
* Strategic design
    - bounded context
    - context map
* Tactical design
    - entities
    - value objects
    - domain events
    - aggregates
    - factories
    - repositories
* Application
    - presentation
    - user interface
* Infrastracture
    - persistence
    - messaging
    - deployment
    - CDI (continuous development integration)
    - testing

## Narrative

Domain-driven design (DDD) is an approach to developing software by deeply connecting the implementation to an evolving model of the core business concepts.

Its premise is:
- Place the project’s primary focus on the core domain and domain logic
- Base complex designs on a domain model
- Initiate a creative collaboration between technical and domain experts to iteratively cut ever closer to the conceptual core of the problem.

This looks simple, but putting it to work can be a challening work. It calls for new skills and discipline, and a systematic approach.

Domain-driven design is not a technology or a methodology. DDD provides a structure of practices and terminology for making design decisions that focus and accelerate software projects dealing with complex domains.
Of course many things can put a project off course, like: 
- bureaucracy
- unclear objectives
- lack of resources...

But it is the approach to design that largely determines how complex software can become. When complexity gets out of hand, the software can no longer be understood well enough to be easily changed or extended. By contrast, a good design can make opportunities out of those complex features.

Some of these design factors are technical, and a great deal of effort has gone into the design of networks, databases, and other technical dimension of software. Books have been written about how to solve these problems. Developers have cultivated their skills.

Yet the most significant complexity of many applications is not technical. It is in the domain itself, the activity or business of the user. When this domain complexity is not dealt with in the design, it won’t matter that the infrastructural technology is well-conceived. A successful design must systematically deal with this central aspect of the software



