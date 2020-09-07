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

We will also be using Lombok, it can be installed in Eclipse as follows:
1. Run cmd as an Administrator
2. cd C:\Users\Valentina.Cupac.m2\repository\org\projectlombok\lombok\1.18.12
3. java -jar lombok-1.18.12.jar
4. Project Lombok Installer appears -> it scans the IDE installations.
5. After installations are selected, click on "Install / Update"

Current build tool used is Maven (which is the most popular build tool) but there is also Gradle (pending switch to Gradle). Keep this in mind when importing projects.

## Project setup (Eclipse)

Creating database:
1. Open up MySql Workbench.
2. Create a schema called "lite" (clicking on the Icon "Create a new schema in the connected server" and then in name write "lite" and then OK).


Since we're using Maven, it means to open up the project in Eclipse:
1. Open up Eclipse
2. Click on File > Import
3. Select Maven > Existing Maven Projects
4. Click on Next.
5. For Root Directory, click on Browse.
6. Click the folder atomiv > atomiv-java > template-lite, then click on template.lite.web.restapi (but don't open it) and click on "Select Folder" button
7. Click on "Finish"
8. The newly imported project template.lite.web.restapi appears in the Project Explorer on the left sidebar


## Configuring template (Eclipse)

Configuration:
1. Open up Eclipse
2. Expand src/main/resources
3. Open up application.properties
4. Check the fields for spring.datasource.username and spring.database.password

## Running template (Eclipse)

1. Open up src/main/java and expland org.atomiv.template.lite.web.restapi
2. Right-hand click on Application.java and click on Run As > Java Application
3. When it runs you should see Tomcat initialized with port(s): 8080 (http)
4. Also, the first time that it's run, Hibernate will generate tables inside the "lite" schema

## Manual testing (Swagger)

1. Open up Swagger http://localhost:8080/swagger-ui.html
2. Click on customer-controller, then POST api/customers, then "Try it out" then "Execute"
3. Verify that the response is 200.
4. Run GET api/customers, click on "Try it out" then "Execute"
5. verify that the response is 200 and that you can see the newly added customer

## Running the template (command line)

The template is here [https://github.com/atomiv/atomiv-java](https://github.com/atomiv/atomiv-java).

```text
cd template.web.restapi
./mvnw spring-boot:run
```

There will be a success message: Tomcat started on port(s): 8080 (http)

Then go into the browser, type in http://localhost:8080/ and you will see the message "Hello to this app!"

