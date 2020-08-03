---
title: Event Driven Architecture
category: software-architecture
authors: [ valentina-cupac ]
---

## Introduction

Event Driven Architecture (EDA) is vased on building applications with loosely coupled components and services which communicate via events - producing and consumping events. For example, suppose we have microservices including Order Microservice, Customer Microservice and Payment Microservice. When the user makes a purchase, it sends a message to the Payment Microservice which processes the payment, and returns response if it succeeded or failed. In the case that it succeeded, it generates a PaymentSucceededMessage, and then the Order Microservice reacts by setting the status as successfully paid, and the Customer Microservice sends a confirmation email to the customer.

## Advanced Message Queueing Protocol (AMPQ)

Advanced Message Queueing Protocol (AMPQ) which defines a standardized way for systems to communicate via messages:

* Messages contain information, including attributes (e.g. request header) and message content (i.e. payload / request body)
* Publishers are applications which produce (generate) the message
* Consumers are applications which consume (process) the message
* Messaging systems receive messages from publishers and route them to consumers
* An exchange is the mailbox inside the messaging system where the publisher drops the message, and then the exchange distribute the the messages to queues
* Queue is where the messages are distributed (e.g. FIFO order) and messages are stored in the queue, and then they are either delivered to consumers who are subscribed or are fetched from queues by consumers on demand
* Routing are the rules for delivery messages to the correct queues, this is defined by bindings and routing keys
* Bindings are links between exchanges and queues
* Routing keys are specific mesage attributes used for routing

The following are AMPQ exchange types:

* Direct exchange - bind to a specific queue using the routing key
* Fanout exchange - routes messages to all the queues that are bound to it (and ignores the routing key)
* Topic exchange - routes messages to one or many queues based on matching between routing key and a pattern used to bind a queue to exchange (used for multicast routing of messages where multiple consumers want to selectively choose which messages to receive) 
* Headers exchange - routing on multiple attributes that are more conveniently expressed as message headers than routing key (so here the routing key is ignored, but instead use attributes for routing from headers attribute)


<!-- TODO: VC -->
<!--
RabbitMQ follows the 

Kafka

Pending description.

-->

## Advantages

* High decoupling - publisher does not need to know about consumers and vice versa
* Asynchronous task handling - actions which follow an event are independent, can be executed in parallel
* Increased reliability - queue acts as a buffer if a consumer fails temporarily
* Setting up retry queues - enable automatic publishing of a message in a queue after a certain amount of time, if processing failed, e.g. retrying several times if a consumer needs to get information from unreliable API

## Disadvantages

* High decoupling - even notification is good only if the publisher does not care about the response
* Implementation overhead - setting up messaging systems requires additional effort

## References

* https://en.wikipedia.org/wiki/Event-driven_architecture
* https://pradeeploganathan.com/architecture/event-driven-architecture/
* https://blog.theodo.com/2019/08/event-driven-architectures-rabbitmq/
* https://www.rabbitmq.com/tutorials/amqp-concepts.html