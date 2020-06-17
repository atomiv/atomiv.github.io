---
layout: templates
title: Tools
permalink: /devops/tools
vversion: 9
vversion2: 3
---
  
  
DevOps team is build of professionals with specialized skills and cross-functionality capabilities, using wide number of tools and practices to deliver solutions. 

![DevOps tools](https://cdn.thenewstack.io/media/2018/11/8bebeea6-cicd-tooling-orchestration-1024x608.png)  
source: thenewstack.io
  
  
The team works in a collaborative environment with stakeholders and end users, to achieve shared objectives in timely manner.  Commonly used tools for communication and collaboration:

* Slack  
Communication tool that connects people, applications (for instance through bot services, ChatOps), data. 


* Confluence  
Wiki, documentation tool for sharing knowledge and experience. 

* Jira  
Issue tracking tool


DevOps teams also use good balance between practical approach and tools to integrate and automate processes in organization.  
Commonly used tools to support daily operations:

* Scripting and Programming Languages  
Bash, Python, Go

* Docker, rkt, LXC, runC, containerd  
Container is a lightweight virtual environment for running applications. 
Container development workflow containes multiple stages like build, test, run, troubleshoot, push. 
Dockerfile provides instructions to build an image, a standalone executable software package that contains an application and all its dependencies. For consistent and reliable infrastructure treat images as immutable, means build a new image in case an update is required.  
Container runtime is a managed environment for deploying images (the applications) in containers.
A container is a running (or stopped) instance of an image.  
![Containerized app workflow](https://quppler.com/wp-content/uploads/2019/03/DockerComponents-300x242.png) &nbsp; 
![Container Architecture](https://miro.medium.com/max/350/1*IGYaJSfDLzXjE-aJcTai4Q.png)  
source: quppler.com and cloud.google.com

* Container Orchestration  
Kubernetes

* VMware, VirtualBox  
Virtual machine is (heavyweight) environment that runs complete operating system and applications.
Virtual machine is known as guest and physical machine as host machine.
The hypervisor is software installed on the host and manages hardware resources for the guest environment. Common use case is to combine virtualization technologies and run containers inside a virtual machine.  
[What is a virtual machine?](https://www.redhat.com/en/topics/virtualization/what-is-a-virtual-machine "Red Hat")  
![Containerized app workflow](https://www.ktexperts.com/wp-content/uploads/2020/01/Hosted-Virtual-Machine-Architecture.png)  
source: researchgate.net

* Code Repository  
GitHub

* CI/CD  
Jenkins CI, CircleCI

* Ansible, Chef, Puppet, Terraform, CloudFormation (AWS)  
Infrastructure as Code (IaC) automates infrastructure, platform and application management in a descriptive way.
The configuration files (written in json or yaml) are stored in version control system and are serving as single source of truth.
Idempotence - same call repeatedly produces same result, is a principle of IaC that ensures consistent state in the environment.   
[IBM Cloud - Infrastructure as Code](https://www.ibm.com/cloud/learn/infrastructure-as-code "IBM Cloud")


* Kubernetes package manager  
Helm

* Monitoring & Observability  
New Relic, Splunk, Elasticsearch (elastic stack)

