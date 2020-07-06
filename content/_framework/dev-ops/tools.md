---
title: Tools
category: dev-ops
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
Tool that supports teams to plan, report, manage work and track progress.


DevOps teams also use good balance between practical approach and tools to integrate and automate processes in organization.  
Commonly used tools to support daily operations:

* Bash, Python, Go  
Scripting and programming are common processes to develop, extend, integrate solutions, automate processes with aim to improve teams productivity.

* Docker, rkt, LXC, runC, containerd  
Container is a lightweight virtual environment for running applications.  
Containerization involves building an image, a standalone executable software package that contains an application and all its dependencies.
Preferable approach to build a container image is using Dockerfile. A Dockerfile is a text file with instructions on how to build an image.  
For consistent and reliable infrastructure images are treated as immutable, it means we build a new image in case an update is required.  
Container runtime is a managed environment used for deploying images (the applications) in containers.  
![Containerized app workflow](https://quppler.com/wp-content/uploads/2019/03/DockerComponents-300x242.png) &nbsp; 
![Container Architecture](https://miro.medium.com/max/350/1*IGYaJSfDLzXjE-aJcTai4Q.png)  
source: quppler.com and cloud.google.com

* Kubernetes, Mesos, Docker Swarm  
Container orchestration manages containers lifecycles.  
It is used to control and automate processes like container provisioning, deployment, scheduling, availability, service discovery, load balancing, monitoring.    
  
  [Red Hat - What is container orchestration?](https://www.redhat.com/en/topics/containers/what-is-container-orchestration "Red Hat")

* VMware, VirtualBox  
Virtual machine is (heavyweight) environment that runs complete operating system and applications.
Virtual machine is known as guest and physical machine as host machine.
The hypervisor is software installed on the host and manages hardware resources for the guest environment. Common use case is to combine virtualization technologies and run containers inside a virtual machine.  
  
  [What is a virtual machine?](https://www.redhat.com/en/topics/virtualization/what-is-a-virtual-machine "Red Hat")  
  ![Containerized app workflow](https://www.ktexperts.com/wp-content/uploads/2020/01/Hosted-Virtual-Machine-Architecture.png)  
  source: researchgate.net

* GitHub, GitLab, Bitbucket  
Source code management supports teams to collaborate on developing solutions using tools and practices to effectively manage and track code changes in a shared codebase.  
Teams use version control tools and define own practical code workflow, a model that aims to make branching and release management more consistent and seamless.  

  [nvie - A successful Git branching model](https://nvie.com/posts/a-successful-git-branching-model "nvie")

* Jenkins CI, CircleCI, GitLab, Travis CI  
Continuous integration (CI) and continuous delivery (CD) operates on set of principles and practices that enables teams to automate the process of building, testing, delivering solutions.  
CI/CD tools increase visibility into the state of the entire pipeline, and provide fast feedback enabling teams to correct errors in real time.  

  [Red Hat - What is CI/CD?](https://www.redhat.com/en/topics/devops/what-is-ci-cd "Red Hat")

* Ansible, Chef, Puppet, Terraform  
Infrastructure as Code (IaC) automates infrastructure, platform and application management in a descriptive way.
The configuration files (written in json or yaml) are stored in version control system and are serving as single source of truth.
Idempotence - same call repeatedly produces same result, is a principle of IaC that ensures consistent state in the environment.   

  [IBM Cloud - Infrastructure as Code](https://www.ibm.com/cloud/learn/infrastructure-as-code "IBM Cloud")

<!---
* Kubernetes package manager  
Helm 
--->

* New Relic, Datadog, Splunk, Elasticsearch (elastic stack)  
The concepts of monitoring and observability help to understand complete system state, addressing questions as when, what, why a service is failing.  
The process contains activities like collecting metrics at various levels (infrastructure, OS, application, data), logging, generating alerts, visualising, analysing.  
The feedback (technical, business) loop assist team to take right actions in the process of continuous improvement.  

  [Google Site Reliability Engineering book - Monitoring Distributed Systems](https://landing.google.com/sre/sre-book/chapters/monitoring-distributed-systems "Google SRE book")
  
