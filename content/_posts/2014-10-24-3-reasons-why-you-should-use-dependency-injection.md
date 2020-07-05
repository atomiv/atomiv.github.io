---
layout: post
title: 3 reasons why you should use dependency injection
author: vcupac
created: 2014-10-24 22:25:02
modified: 2014-10-24 22:25:02
category: architecture 
---

One of the principles of SOLID programming philosophy is dependency inversion, and one way that can be achieved is through dependency injection. In this article we will look at the motivations for using dependency injection when designing a software system.

If you'd like to refresh you memory, you can <a href="http://www.optivem.com/software-development/dependency-injection-in-plain-english/" title="Dependency injection in plain English">read a bit about dependency injection in plain English</a>.

The key advantages can be summarized as follows:

<ul>
<li><b>Design benefits</b> - Dependency injection enables separation of concerns and development of orthogonal systems</li>
<li><b>Testability benefits</b> - Dependency injection enables classes to be tested via unit testing</li>
<li><b>Organizational benefits</b> - Dependency injection allows multiple developers to work on dependent components in parallel</li>
</ul>

<h2>Better designs with dependency injection</h2>

There are <a href="http://www.optivem.com/software-development/dependency-injection-in-plain-english/" title="Dependency injection in plain English">three options</a> which a client has to be able to access a service:
<ol>
<li>client constructs the service itself</li>
<li>client finds the service via a locator</li>
<li>client is injected with the service</li>
</ol>

Thee are two key reasons why dependency injection (option 3) is architecturally better than the other alternatives. Firstly, with option 1, the client depends on the service <Em>and</Em> all the services' dependencies;  with option 2, the client depends on the service <Em>and</Em> the locator from where the service is obtained; but, with option 3, the client depends <Em>only</Em> only the service itself and nothing else. The end result is dependency injection unburdens the client class from extraneous dependencies.

Secondly, with options 1 and 2, typically the client's dependency on the service is implicit, whilst in the case of option 3 the dependency is made explicit because the dependency would be part of the clients's constructor or method signature.

<h2>Increased testability with dependency injection</h2>

By default, every system is black-box testable, that is, for any system we can give it some input parameters and then verify the outputs. However, not every system is white-box testable, which refers to testing the internals of a system. Without dependency injection, a client has a hardcoded dependency to a service, which means it cannot be replaced during testing with a mock, which means we cannot test a component in isolation. More on this topic will be covered in a future article.

<h2>Efficient team management with dependency injection</h2>

One of the most difficult aspects of managing a team is handling the dependencies in code between the various components that team members are working on. Imagine if one person is working on the client, another one is working on service, and the code breaks. It may be hard and time-consuming to check every time why the problem occurred. Furthermore, this often leads to the problem of task dependencies and waiting times, which makes it difficult for work to proceed in parallel. More on this topic will also be covered in a future article.