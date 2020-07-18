---
title: Java
category: docker
---

## Step 1 - Containerization

Goal is to containerize (dockerize) Spring Boot application. 

A sample application prints out a text message in web browser.  

Documentation is available at https://atomiv.org/java/get-started

HelloController.java snippet:
```
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello to this app!";
	}
}
```

### Clone Repository

Get a copy of the sample code.
```
git clone https://github.com/atomiv/atomiv-java.git
```
  
### Create Dockerfile
  
Change to **template.web.restapi** directory.
```
cd atomiv-java/template.web.restapi
```

Create a new Dockerfile, for instance **template.web.restapi.Dockerfile** uses multistage build feature to optimize the image build process. 

Note, the image sources are from docker hub:
* https://hub.docker.com/_/maven
* https://hub.docker.com/_/openjdk

```
FROM maven:3.6.3-openjdk-14-slim AS builder
WORKDIR /app
COPY ./pom.xml ./
RUN mvn dependency:go-offline -B
COPY ./src ./src/
RUN mvn package


FROM openjdk:14-jdk-slim
WORKDIR /app
COPY --from=builder /app/target/template.web.restapi-0.0.1-SNAPSHOT.jar ./
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "template.web.restapi-0.0.1-SNAPSHOT.jar"]
```
Sample Dockerfiles are located at [atomiv-devops Dockerfiles](https://github.com/atomiv/atomiv-devops/tree/master/Dockerfiles)
  
## Build Image
  
Build new **atomiv/atomiv-java:0.1** image.
```
docker build -f template.web.restapi.Dockerfile -t atomiv/atomiv-java:0.1 .
```
  
List images.
```
docker image ls
```
Output:
```
REPOSITORY           TAG                      IMAGE ID            CREATED             SIZE
atomiv/atomiv-java   0.1                      b739d7b1c9df        4 seconds ago       106MB
<none>               <none>                   9fa8270ebbc0        13 seconds ago      373MB
maven                3.6.3-ibmjava-8-alpine   147a1ed602ad        3 days ago          274MB
openjdk              8-jre-alpine             f7a292bbb70c        13 months ago       84.9MB
```
  
### Run Container
  
Run container using the new **atomiv/atomiv-java:0.1** image.
```
docker run --name atomiv-java-0.1 -d -p 8080:8080 atomiv/atomiv-java:0.1
```
  
List containers.
```
docker container ps -a
```
Output:
```
CONTAINER ID        IMAGE                    COMMAND                  CREATED             STATUS              PORTS                    NAMES
9b1c0ce21847        atomiv/atomiv-java:0.1   "java -jar template.…"   21 seconds ago      Up 20 seconds       0.0.0.0:8080->8080/tcp   atomiv-java-0.1
```

### Run Application
  
Open a web browser, type url <http://localhost:8080/> and following text will be displayed.
```
Hello to this app!
```

### Stop Container
  
Stop and delete the container.
```
docker stop atomiv-java-0.1  
docker rm atomiv-java-0.1
```

### Delete Images

Delete all images.
```
docker rmi $(docker images -a -q)
```

