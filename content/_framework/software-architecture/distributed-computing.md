---
title: Distributed Computing
category: software-architecture
authors: [ valentina-cupac ]
---

## Overview

There are two important aspects in distributed computing which affect implementation choices:
* CAP
* BASE

## CAP Theorem

The CAP theorem states that "Though it's desirable to have Consistency, High-Availability and Partition-tolerance in every system, unfortunately no system can achieve all three at the same time".

* Consistency - A consistent service ensures that "what you read is what you get", based on the rule of ordering updates - i.e. if Client A writes old_value and then new_value to a certain location, then another Client B will read old_value then new_value. This is also known as strong consistency.

* Availability - An available service is one where its guaranteed that for every request there will be a response about whether it succeeded or failed.

* Partition tolerance - A partition-tolerant service continues to operate despite failure of a part of the system.


## References

* https://ivoroshilin.wordpress.com/2012/12/13/brewers-cap-theorem-explained-base-versus-acid