---
title: Overview
category: embedded-development
---


Embedded Development...

Various platforms / architectures

Also Android open source

## What is Embedded Systems

According to Encyclopedia Brittanica “Embedded processor, a class of computer, or computer chip, embedded in various machines”.
Embedded systems can be thought of as a device that contains or incorporates a microcontroller, which has memory encapsulated inside, contains softare making it possible to commuicate with its peripheral such as sensors through its Pins. The communication is following standardised pattern called "protocol". 

When buying a new washing machine nowadays you can most likely be certains of that it has a micocontroller inside. It is communicating with its periherals in order to e.g. know at what speed the washing machine drum is rotating. Depending on the current speed, which the microcontroller knows by reading/getting the data from its peripheral it knows if it should send (write data) and increase or decrease the speed, all depending on the current washing program. Embedded systems can be thought as an autonomous systems which has already preset parameters to follow during the executin, in this case a certain washing program with degree, water level and rotating speed. Embedded system is developed for handling certain tasks that are determined in the phase before starting the implementaion, this phase is called requirements phase. E.g. if an accessory of a smartphone is to be developed there is a certain requiaremend about how mach current the accessory is allowed to draw. Accoridng to that requirement there has to be investigation made in finding the correct microcontroller that consumes energy less that the allowed requirement. 

They contain a processor or microcontroller that are executing the code. The processor can read the data from its sensors, i.e. thermometer and perform an action such as turn the fridge on if the temperature has increased beyond a treshold. 
Embedded Development is about developing software that is executed on an embedded processor.
 When developing a product that uses a microcontroller there has to be certain use cases are meant which is different that a PC which is general device i.e. is not targeting special use cases. A special use case can be measuring temperature in the room or measuring the heart rate and if necessary triggers the heart, all according to added parameters by the programmer. 
Embedded processors often use a battery as an energy source. Therefore it is necessary to keep in mind not to consume unnecessary energy when that is not needed. Such situation can be to reduce the speed that the processor is executing the software. However the developer needs to develop the software . Another solution can be to put the microcontroller in a sleep mode. In that case it needs to be woken up, which is also the task of the developer to know what can be important in order to wake up the microcontroller.
 the product to take situations into account. The software developed is targeting special use cases. 
 
 Some products that belong to the category of embedded systems:
 * Pacemaker - e.g. reads the heart beat
 * Smartphone - e.g. gets notification of incoming call and needs to take action in order to present that information to the user.
 * Missile - e.g. searches and follows it target even if the target is turning, increasing its speed or throwing out decoy.
 


