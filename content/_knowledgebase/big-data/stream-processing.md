---
title: Stream Processing
category: big-data
authors: [ petar-zecevic ]
---

# Overview

Stream processing is model that computes one data element or a small window of data in near real-time, processing in seconds to minutes at most. Technology capable of stream processing produces near real-time data because it processes data as it comes through the system. It allows us to quickly detect conditions within small time period from the point of receiving the data.

![Stream processing data flow in data analysis](https://www.upsolver.com/wp-content/uploads/2019/09/Screen-Shot-2020-05-25-at-17.05.22.png)
source: upsolver.com

# Purpose

It is used to query continuous data stream and detect conditions, quickly, within a small time period from the time of receiving the data. The detection time period varies from few milliseconds to minutes. For example, with stream processing, you can receive an alert when the temperature has reached the freezing point, querying data streams coming from a temperature sensor.
When we need to analyze or serve data as close as possible to when we get hold of it, and get instant analytical results stream processing is must.


# Use cases

There are a lot of streaming data available:
- Customer transactions
- Website activities
- Logs
- Information from social networks
- Geospatial services)
- Sensors

Most of the streaming data is in te
Stream processing naturally fit with time series data and detecting patterns over time.
For example, IoT sensor data is being generated in a continuous stream and arriving at high velocity as the time series.

Applications of the stream processing:
- Real-time advertising
- Content personalization
- Online inference
- Fraud detection
- Alarms

# Tools

## Open-source
- Apache Storm
- Apache Spark
- Apache Flink

## Cloud providers
- Amazon Kinesis
- Google Cloud Dataflow
- Azure Stream Analytics
