---
layout: templates-layout
title: Get Started
permalink: /devops/get-started
vversion: 6
vversion2: 6
---



DevOps Template - Containerization

Phase 1: Create / build image

1. Containerization of envioronment ( .NET Core environment, npm angular) --> images
2. Installation of templates (.NET Core template, Angular template, Java template, Selenium)
All this goes into container image

--> DevOps container image template

Put the image into image repository


Generally separate images for DB

Image = environment (minimal) + dependencies/libraries + code

This is why images are small.

Challenges - best practices - how to build images... how to do it in minimal way and fast (so that developers wait less time), so that deployments can go more frequently in less time



Phase 2: Running image on development/staging (container: Docker or Docker Compose)


Note: one docker compose, says container for application, container for database, and what is the sequence in which they should be run

Ned to run the image -> use Docker
Docker builds the image and running the image
This is generally used development environment

This is a manual process (steps) -> developer installs Docker and puts image on it

Docker configuration file, which image to use for building, compiling code and on what image to run the code

Containers are short-lived (unlike servers). Containers can be shutdown. (Image running or stopped))

Reusability: if developer has Windows, developer can be sure that the code when run locally will have same effects on production...

When developer commits code, then a new image is created, then the image could be depoyed on staging/production/etc




Phase 3 Running image on production (orchestrators: Kubernetes or Docker Swarm)

Orchestrators for production environment


Phase 4

Making Jenkins pipeline (Jenkins) - stages:
* Code build
* Image is created/built
* Image is run and tested

One dashboard, avoiding manual


BENEFITS


* Guranteed same environment -> avoid mismatching environments (avoid works on my machine issue)

* Economic - reduce developer time spent on administration/configuration


<!--

FUTURE: when committing, automate the whole process



TODO: VC CHECK: initially laptop, then virtual machine on server  for long term


Demo -> laptop -> screencast recording (VC)


-->