---
layout: post
title: Dependency injection in plain English
author: vcupac
created: 2014-10-15 19:39:17
modified: 2014-10-15 19:39:17
category: architecture 
---

There are many scenarios where we have a client that depends on some service to do something. There are three options:

<ul>
<li>client constructs the service itself</li>
<li>client finds the service via a locator</li>
<li>client is injected with the service</li>
</ul>

Let's consider a concrete example, suppose we are developing a socket-based game, so there are two functionalities that need to be developed, one is to implement the business logic associated with the game, and we also need to implement the socket logic and protocols.

A naive method would be just to have a game class which does everything, it manages player moves and scoring as well as transferring data via sockets. But what's wrong with this design? Well, it violates the first SOLID principle - Single Responsibility because now the game class has two separate responsibilities.

So then we decide we will actually have two classes, a Game class and a SocketService class, whereby in the game class we implement game logic and in the SocketService class we implement socket communication logic.

In this situation, the Game class depends on another class - the SocketService class. How will we handle this?

<h2>Option 1 - construct the service</h2>
The first idea that comes to mind is that in the Game class, we can construct a SocketService object. This is a simple solution, but the problem is that now the Game class much know how to instantiate the SocketService class, it must know the dependencies of SocketService. Suppose that SocketService might need to depend on protocol configuration as well as specifying the port. So now the Game class needs to know about those dependencies. So now, the Game class depends on both SocketService and all the dependencies of SocketService.

<h2>Option 2 - locate the service</h2>
We ask ourselves, if the concern of the Game class is to manage game logic, why should it know about socket protocols and ports? So then we decide to improve the design, and we create a Locator which is responsible for managing a SocketService object, and then a Game object can simply tell the Locator "give me a socket service" without worrying about how exactly the ServiceLocator is constructed.

This is better, but still not good enough. Now the Game class depends on SocketService and ServiceLocator. Can we do better?

<h2>Option 3 - inject the service</h2>

We get a third idea, that the Game class shouldn't need to know how to create a SocketService (our first attempt) and neither does should it how where to get the SocketService from - instead, all it needs, is just the ServiceSocket itself. So we can pass SocketService to the Game (through constructor or through setter method). We've arrived at something called "dependency injection", we injected a class (Game) with its dependency (ServerSocket).

Now that we know what dependency injection is, let us take a look at <a href="http://www.optivem.com/uncategorized/3-reasons-why-you-should-use-dependency-injection-2/" title="3 reasons why you should use dependency injection">why we would design our systems using dependency injection</a>. 