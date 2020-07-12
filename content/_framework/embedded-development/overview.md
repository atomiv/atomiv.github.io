---
title: Overview
category: embedded-development
---


Embedded Development...

Various platforms / architectures

Also Android open source

## What is Embedded Systems

According to Encyclopedia Brittanica “Embedded processor, a class of computer, or computer chip, embedded in various machines”. Embedded systems can be thought of as a device that contains or incorporates a microcontroller, which has memory encapsulated inside, contains software enabling it to communicate through its peripherals,  e.g. sensors. The communication with its peripherals is following a standardized pattern, called "protocol". Its peripherals are physical pins, through which data/information is transmitted and received.
When buying a new washing machine nowadays you can most likely be certain of that it has a microcontroller inside, which communicates with its peripherals in order to e.g. know at what speed the washing machine drum is rotating. Depending on the current speed, which the microcontroller knows by reading/getting the data from its pins it knows if it should send (write data) and increase or decrease the speed, depending on the current washing program. Embedded systems can be thought as an autonomous systems which has already preset parameters to follow during the executing, in this case a certain washing program with temperature, water level and rotating speed. It is developed for a certain purpose. Some products that belong to the category of embedded systems:

 * Pacemaker - e.g. monitors the heart rhythm/frequency and when the heart beat is not happening within an expected period of time, it triggers the heart to beat.
 * Smartphone - e.g. gets notification of incoming call and needs to take action in order to present that information to the user.
 * Missile - e.g. searches and follows it target even if the target is turning, increasing its speed or throwing out decoy.

The products above are targeting certain purpose and the embedded microcontroller executes the code, reads the data from its peripheral and based on the input continues to execute or makes some changes to the system, which is mention in the bullets above.
The purpose is defined in requirements in an early phase before the implementation. If e.g. an accessory of a smartphone is to be developed one requirement would be about how much current the accessory is allowed to draw from the smartphone. According to that requirement there has to be investigation made in finding the correct microcontroller that consumes maximum energy. Further depending om the size of the developed software and the purpose of it, the memory size, execution speed and peripherals (which sensors to communicate with) has to be taken into account.
Developing a embedded system the goals is to make a solution that serves the purpose at a reasonable cost. The disadvantages of such an solution is that it may not support changes as the requirements changes. It is therefore the task of the engineer to predict what may be required into the future. Choosing a microcontroller that has more memory than required can be a way of preparing for the future, even if the current cost is a bit higher. But this is something the engineer has to decide when looking in the crystal ball.
