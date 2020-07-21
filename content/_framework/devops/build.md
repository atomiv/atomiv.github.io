---
title: Build
category: devops
authors: [ boban-bojkovski ]
---

DevOps teams also use good balance between practical approach and tools to integrate and automate processes in organization.

Commonly used tools to support daily operations:

## Build

### Bash, Python, Go  

Scripting and programming are common processes to develop, extend, integrate solutions, automate processes with aim to improve teams productivity.

### Docker, rkt, LXC, runC, containerd  

Container is a lightweight virtual environment for running applications. Containerization involves building an image, a standalone executable software package that contains an application and all its dependencies.

Preferable approach to build a container image is using Dockerfile. A Dockerfile is a text file with instructions on how to build an image. For consistent and reliable infrastructure images are treated as immutable, it means we build a new image in case an update is required.  

Container runtime is a managed environment used for deploying images (the applications) in containers.  

![Containerized app workflow](https://quppler.com/wp-content/uploads/2019/03/DockerComponents-300x242.png) &nbsp; 
![Container Architecture](https://miro.medium.com/max/350/1*IGYaJSfDLzXjE-aJcTai4Q.png)  
source: quppler.com and cloud.google.com

## Version Control

###  GitHub, GitLab, Bitbucket  

Source code management supports teams to collaborate on developing solutions using tools and practices to effectively manage and track code changes in a shared codebase.  

Teams use version control tools and define own practical code workflow, a model that aims to make branching and release management more consistent and seamless.  

[nvie - A successful Git branching model](https://nvie.com/posts/a-successful-git-branching-model "nvie")

## CI / CD

### Jenkins CI, CircleCI, GitLab, Travis CI  

Continuous integration (CI) and continuous delivery (CD) operates on set of principles and practices that enables teams to automate the process of building, testing, delivering solutions.
  
CI/CD tools increase visibility into the state of the entire pipeline, and provide fast feedback enabling teams to correct errors in real time.  

[Red Hat - What is CI/CD?](https://www.redhat.com/en/topics/devops/what-is-ci-cd "Red Hat")
