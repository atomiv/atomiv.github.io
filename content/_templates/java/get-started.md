---
title: Get Started
category: java
authors: [ valentina-cupac, jelena-mitrovic ]
---

## Prerequsites

Ensure you have the following installed:

* [https://jdk.java.net](https://jdk.java.net) (We have used Java JDK 14)
* [https://www.eclipse.org/downloads](https://www.eclipse.org/downloads) (We have used Eclipse IDE 2020-06 which is free to download, another alternative is NetBeans, but for developers who already have IntelliJ we recommend IntelliJ)

JAVA_HOME also needs to be set within environment variables (pointing to the Java JDK installation).

Current build tool used is Maven (which is the most popular build tool) but there is also Gradle (pending switch to Gradle)

## Running the template

The template is here [https://github.com/atomiv/atomiv-java](https://github.com/atomiv/atomiv-java).

```text
cd template.web.restapi
./mvnw spring-boot:run
```

There will be a success message: Tomcat started on port(s): 8080 (http)

Then go into the browser, type in http://localhost:8080/ and you will see the message "Hello to this app!"

