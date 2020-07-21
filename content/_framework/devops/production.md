---
title: Production
category: devops
authors: [ boban-bojkovski ]
---

## Orchestration and Scheduling

### Kubernetes, Mesos, Docker Swarm  

Container orchestration manages containers lifecycles.  

It is used to control and automate processes like container provisioning, deployment, scheduling, availability, service discovery, load balancing, monitoring.    
  
[Red Hat - What is container orchestration?](https://www.redhat.com/en/topics/containers/what-is-container-orchestration "Red Hat")


<!-- NOTE: Question from VC: Does this belong here or somewhere else? I didn't know, so I put it here but please check -->

### VMware, VirtualBox  

Virtual machine is (heavyweight) environment that runs complete operating system and applications.

Virtual machine is known as guest and physical machine as host machine.

The hypervisor is software installed on the host and manages hardware resources for the guest environment. Common use case is to combine virtualization technologies and run containers inside a virtual machine.  
  
[What is a virtual machine?](https://www.redhat.com/en/topics/virtualization/what-is-a-virtual-machine "Red Hat")  
  ![Containerized app workflow](https://www.ktexperts.com/wp-content/uploads/2020/01/Hosted-Virtual-Machine-Architecture.png)  
  source: researchgate.net
  
## Monitoring and Logging  

### New Relic, Datadog, Splunk, Elasticsearch (elastic stack)  

The concepts of monitoring and observability help to understand complete system state, addressing questions as when, what, why a service is failing.  

The process contains activities like collecting metrics at various levels (infrastructure, OS, application, data), logging, generating alerts, visualising, analysing.  

The feedback (technical, business) loop assist team to take right actions in the process of continuous improvement.  

  [Google Site Reliability Engineering book - Monitoring Distributed Systems](https://landing.google.com/sre/sre-book/chapters/monitoring-distributed-systems "Google SRE book")