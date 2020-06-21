---
layout: templates
url: /system-admin/network
permalink: /system-admin/network
vversion: 8
vversion2: 3

description: Network basics
---


Network security should be taken into account when setting up a wireless network. Each organization has a different privacy policy, so some networks may be set to access the network using a public key, and some with unique logs that each employee or member of the organization receives from the system administrator or network manager.

There are two basic types of networks:

* Infrastructure mode,
* Ad hoc mode.

## Infrastructure mode

This environment is mainly used for homes, small office or home office and uses the access point to communicate with the wireless device. The access point and clients must be configured to use the same network name. The access point is wired to a router or switch to give customers access to the internet, printers or some peripheral devices.

### What is an Access Point?

A device that creates a wireless local area network that can be used to relieve one WLAN network or to increase the signal range. AP connects to the router by cable or wirelessly and can be configured as a separate wireless network with a special network name.

## Ad hoc mode

Ad hoc mode is used to directly connect two or more computers and printers. Devices in this mode do not require a central server, router, or access point for communication, data exchange, and printing. They are already accessing each other with a simple wifi connection. In order for this mode to work smoothly, it is best for all devices in the network to be close to each other so that the signal of the wireless network is good between them.

### How to Set Up an Ad-Hoc Network on Windows

In order to set up an ad hoc network, it is necessary for the devices to have a wireless network adapter and to support the hosted network.
For Windows 8 and 10, open the Command prompt as administrator and enter the following code where you will replace the SSID with the name of your network and the your password,

`netsh wlan set hostednetwork mode=allow ssid=networkname key=password`

then start the hosted network,

`netsh wlan start hostednetwork`

