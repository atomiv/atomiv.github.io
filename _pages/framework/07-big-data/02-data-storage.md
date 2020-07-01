---
layout: templates
title: Data Storage
permalink: /big-data/data-storage
vversion: 7
vversion2: 3
---


## Overview

Data storage represents a repository of a collected data from the data sources. In the most solutions, this is a distributed, fail-tolerant DBMS that can hold high volumes of data. Most often data is collected in a distributed file store that has no constraints on the format of data. This kind of stores are called data lakes.

### Relational databases

This database is organized in tables, and each data record is a row in the table. Each row has a unique ID. All of the records in the table have the same fields, that are defined by the table columns (name of the field and data type). That is called schema. This approach restricts us from having rows that have the extra fields.

The main feature of the relational database is that multiple tables can be related (connected) by the row ID. This lets us reference rows from the one table in the row from another table. This is useful for performing join operations, complex queries, and efficient data updates because it updates only in one place and will take effect on every row where it is referenced. E.g. order table has fields for the customer and product ID.

Relational databases are not designed for the horizontal scaling, and it is very difficult to achieve it. They are designed for the vertical scaling by improving the hardware on the existing servers. Flexibility is sacrificed for the performance.

### Non-relational databases

This database is non tabular and does not rely on the predefined schema and relations. Data model is more flexible and supports adding new types of the data in the by default. E.g. adding a JSON document with extra or different fields than other documents in the same collection of the documents. The idea is to put all of the relevant information in one place.

There are four types, defined by the data model:
- Document
- Key-value
- Wide-column
- Graph

![NoSQL types](https://www.improgrammer.net/wp-content/uploads/2020/04/NoSQL-Database-Types.jpg)
source: improgrammer.net

They are designed to be scaled horizontally in massive scale on distributed systems.
These types of databases are optimized specifically for applications that require large data volume, low latency, and flexible data models, which are achieved by relaxing some of the data consistency restrictions of other databases.

Using this approach, a database can operate across hundreds of servers, petabytes of data, and billions of documents—and still manage to process tens of thousands of transactions per second. Another benefit is that if one node fails, the others can pick up the workload, thus eliminating a single point of failure.

### Data lake

### Technologies for data storages

#### Open source

#### Cloud providers









