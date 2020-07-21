---
title: Network
category: system-admin
author: [ vladimir-maljm ]
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
If you are creating an ad hoc network via a laptop, make sure the host device is connected to the LAN via a network cable to avoid using a wireless adapter.
For Windows 8, 8.1 and 10, open the Command prompt as administrator and enter the following code where you will replace the SSID with the name of your network and key with your password,

`netsh wlan set hostednetwork mode=allow ssid=networkname key=password`

then start the hosted network with code,

`netsh wlan start hostednetwork`

After this, open the **Control Panel**, select **Network and Sharing Center**, select **Change adapter settings**,

![](https://raw.githubusercontent.com/atomiv/atomiv.github.io/master/_pages/framework/08-system-admin/images/pic1.png)  

> *in the example as in the picture, you need to connect the device to the network with a cable so that the wireless device is free*.

In the list of network adapters on the computer, right-click the adapter that you're connected with, then choose **Properties**,

Click to the **Sharing** tab,

Select the **Allow other network users to connect through this computer's Internet connection** check box. Then, select the **Home networking connection** drop-down arrow and choose the interface from the ad hoc network.


Select **OK** to save the changes.

Return to the **Network and Sharing Center** to verify that the ad hoc network is connected to the internet through the other interface.

![](https://raw.githubusercontent.com/atomiv/atomiv.github.io/master/_pages/framework/08-system-admin/images/pic2.png)  

You should know that Ad hoc wireless networking only includes WEP-only security and when the host computer shuts down or disconnects from the ad hoc network, Ad hoc network is deleted.

Also pay attention and keep in mind that the SSID cannot be hidden (*you cannot disable SSID broadcast like infrastructure mode devices can*), neither can you see how much the signal strength  is like in the infrastructure mode, so you must make sure that all ad hoc devices are within range of the host computer. The baud rate is limited to 11mbps
