---
layout: templates
title: Microservices
permalink: /software-architecture/microservices
vversion: 3
---


### About

One of the newer ideas in the field of software architecture is Microservice architecture. The basic idea of this architecture is the splitting of large monolithic systems into smaller independent units. These small independent units have their own life cycle and cooperate with each other. Applications based on this architecture aim to keep microservices separate \(loosely coupled\) and as cohesive as possible.

### Architectural characteristics

Due to the possibility of dividing the server-side into several microservices, this architecture has great modularity. This allows people working on development to be focused on one or more modules, without knowing the overall business logic of the software, developers need to know only those parts for which it is in charge are enough, as well as the connections with the modules with which these modules cooperate.

Each service performs a small set of functions and each service can be implemented in different technologies which is an additional plus because it is possible to take advantage of this technology to solve specific problems.

#### Database per service and data replication

Each microservice should have its own database. This allows the possibility of applying different types of databases for each microservice. An important rule of microservice is data sovereignty. The service cannot directly access the database of another service. Service should ask for those data from service whose database it is. A common way to improve performance is to replicate data between databases. Therefore, it is necessary to take care that when the data in one database change, the redundant data in other databases remain up-to-date.

![Microservice architecture]({{site.url}}/assets/microservices.png)


#### API Gateway and security

The Microservice architecture is also characterized by the use of the API Gateway. API Gateway is a centralized intermediary for communication between microservices and client applications. Instead of the client application communicating directly with the microservices, it will send a Gateway API request and receive a response from it. In the background, the Gateway API communicates with the microservices in charge of that domain.

One of the most important roles of the API gateway is security. It should ensure that only authenticated and authorized users can access API back-end. The API Gateway should be able to integrate with existing and custom authentication providers. This ensures the back-end APIs don’t have to implement this logic and any changes to the authentication schemes require no changes to the back-end. 

One of the services in Microservice architecture needs to be implemented as authorization server\(OAuth and the OpenID Connect server\) . When using API gateway there is a single entry point for all the client requests. The client connects to the authorization server and obtains the access token. Then send the access token to the API gateway along with the request. API gateway extracts the access token and sends it to the authorization server to retrieve the JWT. Then API gateway passes this JWT along with the request to the microservices layer.

API gateway has also one network security advantage. When using API gateway you could be assigned public IP address only to API gateway and private IP addresses to all other back-end APIs. In this way API gateway is only one who is visible from the public network and also only one vulnerable to network attacks.

### Defining boundaries and loose coupling 

The biggest challenge in Microservice architecture is defining microservice boundaries. It is necessary to set boundaries in such a way that the services are loosely coupled to each other. Loose coupling is a concept of minimizing dependence. When services are loosely coupled, a change in one service requires minimal change in another service or no change at all. Loosely coupled services should know as little as possible about the service they are working with. One way to determine the boundaries between Microservices is to apply Domain-driven design \(DDD\) when designing a system.

The biggest advantage of loose coupling is scalability. Scalability is the ability of an application to resist an increase in requests and the number of users without the application itself having to change. This practically means that if the load on one functionality of the system is increased new instances of service are added which implements that functionality.

### Communication

The challenge that also arises after the transition from a monolithic to a Microservice architecture is to change the way of communication. The two types of protocols used are synchronous protocols and asynchronous messaging protocols:

* Synchronous protocol - The most well-known synchronous protocol is HTTP. With this type of protocol, the client sends a request and waits for a response from the server. An important characteristic  is that the client can continue executing only when it receives a response from the server.
* Asynchronous Protocol - An asynchronous protocol such as AMQP allows \(Advanced Message Queuing Protocol\) that the client does not have to wait for the server response and may proceed with the execution.

### Message queue

To achieve loose coupling asynchronous and communication message queue is used in Microservice architecture. Message queuing allows applications to communicate by sending messages to each other. Services communicate in such a way that one service sends a message to the message queue and each service subscribed to that type of message receives and processes it in its own way. When a generally accepted data format such as JSON is used for the message format then it is possible to implement each service in a different programming language. The message queue provides temporary message storage when the destination program is busy or not connected. When services communicate via a message queue, they are decoupled and can be easily scaled.  

![Message queuing]({{site.url}}/assets/queue.png)


### Acme Online Store microservice example

The application described in the [business analysis section](https://app.gitbook.com/@atomiv/s/docs/~/drafts/-M8vZliLelYahqo4XEiC/business-analysis/overview) can be divided into the following microservice components:

* Authorization service \(Identity Server\)
* API gateway
* ACME Backoffice - service used by backoffice employees within ACME globally
* ACME eStore - service for customers orders

### Conclusion

Like any other distributed system Microservice architecture in addition to advantages brings additional complexity and new challenges in implementation. The transition from a monolithic to a Microservice architecture is best reported when the application becomes extensive and therefore difficult to maintain and deploy new versions on the server. However, the transition to Microservice architecture brings not only convenience but also several difficulties. First of all, the application becomes more complex due to the nature of this distributed architecture.

Communication is subject to failures because it takes place between services that can be placed on different physical servers, which is not the case with Monolithic architecture. Due to additional communication between services, the performance of the system becomes slightly worse. Implementation and testing may take longer compared to a monolithic architecture but maintaining and upgrading the system is easier due to loose connectivity.

Due to the above, it is necessary to choose the architecture according to the domain of the problem and the expected scope of the application or to choose a suitable moment for the transition from a Monolithic to a Microservice architecture. If it is estimated that the business application will not be extensive and subject to frequent changes, then it is better to choose a monolithic architecture in order to speed up the development process and avoid unnecessary complexity. On the opposite, the Microservice architecture with its advantages is a good solution for this type of application.

### Pros and cons

#### Pros

* Scalability
* Develop, maintain, and deploy each microservice independently
* Smaller and faster deployments
* Maintenance is simpler and cheaper

#### Cons

* Communication overhead
* Testing is more complicated
* Application becomes more complex due to the nature of this distributed architecture
* Increased effort for monitoring



