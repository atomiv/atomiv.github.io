---
title: Get Started
category: java
authors: [ valentina-cupac, milan-vidakovic, ivan-jovanovic, jelena-mitrovic ]
---

## Prerequsites

Ensure you have the following installed:

* [https://jdk.java.net](https://jdk.java.net) (We have used Java JDK 14)
* [https://www.eclipse.org/downloads](https://www.eclipse.org/downloads) (We have used Eclipse IDE 2020-06 which is free to download, another alternative is NetBeans, but for developers who already have IntelliJ we recommend IntelliJ)
* MySQL (TODO: Link)
* MySql Workbench (TODO: Link)

JAVA_HOME also needs to be set within environment variables (pointing to the Java JDK installation).

Creating database:
1. Open up MySql Workbench.
2. Create a scheme "lite".

Current build tool used is Maven (which is the most popular build tool) but there is also Gradle (pending switch to Gradle).

We will also be using Lombok, it can be installed in Eclipse as follows:
1. Run cmd as an Administrator
2. cd C:\Users\Valentina.Cupac.m2\repository\org\projectlombok\lombok\1.18.12
3. java -jar lombok-1.18.12.jar
4. Project Lombok Installer appears -> it scans the IDE installations.
5. After installations are selected, click on "Install / Update"


## Running the template

The template is here [https://github.com/atomiv/atomiv-java](https://github.com/atomiv/atomiv-java).

```text
cd template.web.restapi
./mvnw spring-boot:run
```

There will be a success message: Tomcat started on port(s): 8080 (http)

Then go into the browser, type in http://localhost:8080/ and you will see the message "Hello to this app!"

