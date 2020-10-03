---
title: Overview
category: software-architecture
authors: [ milan-vidakovic ]
---

## Introduction to Software Architecture

Software architecture definitions usually come in a form of abstract, high-level structural building block schemes and convoluted data path analytical diagrams. Pair that with equally mystifying, and rarely clearly demarcated software design patterns, it becomes obvious how many succumb to common software development pitfalls.    

Interpreting the concept of software architecture shouldn’t require any technical lingo, as at the highest level, software architecture is nothing more but a constant struggle between project feasibility constraints and pursuing a clean code dream.

## Software Architecture best practices

Gauging projects performance metrics is a multifold issue, but from an architecture standpoint the emphasis should be on successful and maintainable implementation of business and operation requirements.

Putting aside the technical aspect of product development, perhaps the single most important factor for project success is core understanding of required business logic, and being able to chart the foreseeable project trajectory. Allocating time and resources to properly translate stakeholder demands to technical specification should be a priority that will ensure a solid foundation for technical decisions that follow.

In a perfect world, your initial architectural draft would be a flurry of completely agnostic and reusable components, with infrastructure and automation covering the entire project life cycle. In reality, this is where time and cost restrictions are evaluated, and necessary cuts to your technology stack are made. And although the option of slight pivoting will always be available, poorly executed design choices at this point will result in major risks to project completion.  

Predominantly used service architectural approaches include

* Monolith-derived or multi-service patterns - Used for vertically scalable business logic
* Microservice patterns - Used for horizontally scalable business logic

Combining services as infrastructural elements of business logic dataflow a number of composite architectural patterns emerge:

* Client-server pattern,
* EventBus pattern,
* Broker pattern,
* Pipe filter pattern,
* Master-slave pattern,
* Peer-to-peer pattern

The main obstacle that should be overcome during initial drafting is over-engineering. One can easily be swayed by buzzwords of the day such as microservices/kubernetes/docker, distributed cache, messaging queues etc. If your service is solving linear logic or targeting a small user pool, adding such infrastructural overhead will surely effect you project goals.

After initial technology guidelines have been adopted, main efforts should focus on general development and maintenance practices. What is often encountered at this stage is potential for under-engineering. Failing to correctly assess project scale can lead to a number of issues that might significantly lower your productivity. 

---

 A predominantly vertical service designs will never allow for a fully distributed or parallel development. 

---

---

Condensed business logic layer will always necessitate some form of domain language to cope with rapid business rule changes, adding to onboarding times and bad code maturation. 

---

Also, this is where line separating architecture and development patterns becomes less visible, and one of the easiest ways to avoid collisions is to concentrate on interfacing, not implementation.

All design patterns fall within three generally accepted categories, Creational, Structural, and Behavioral patterns, and they present solutions to single and typically recurring software development issues. Architectural patterns add a layer of abstraction and complexity by combining design pattern implementations into service building blocks.

## Closing note

In recent years a misconception started manifesting that software architect is the carrier pinnacle in software development. Initially confusing novices and recruiters, it made developers rush their CVs and VPEs dilute the position pool that doesn’t merit from having too many voices.    

Software architect occupies a specific place in project development life-cycle and is equally tied to project success as any other senior position involved. That being said, becoming an architect is a great goal. Merging technical and interpersonal skills with a fair amount of abstract thinking creates a positively challenging and balanced work environment.

Further read:   
* [Architecture patterns in a nutshell](https://towardsdatascience.com/10-common-software-architectural-patterns-in-a-nutshell-a0b47a1e9013)
* [Patterns of Enterprise Application Architecture](https://www.martinfowler.com/books/eaa.html)
* [Software architecture in practice](https://www.oreilly.com/library/view/software-architecture-in/9780132942799/)

