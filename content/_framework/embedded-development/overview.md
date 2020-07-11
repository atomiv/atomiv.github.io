---
title: Overview
category: embedded-development
---


Embedded Development...

Various platforms / architectures

Also Android open source

## What is Embedded Systems

According to Encyclopedia Brittanica “Embedded processor, a class of computer, or computer chip, embedded in various machines”.
Embedded systems can be thought of as a device that contains an microcontroller, which has memory encapsulated inside, contains softare making it possible to commuicate with its peripheral such as sensors throught Pins. The communication is done using standardised pattern called "protocol". 

When buying a new washing machine nowadays you can most likely be certains that it has a micocontroller inside. It is communicating with its periherals in order to e.g. know at what speed the washing machine drum. Depending on the current speed, which the microcontroller knows by reading/getting the data its peripheral it knows if it should write/send and increase or decrease the speed, all depending on the current washing program. It can be thought as an autonomous systems which has already preset parameters to execute after, in this case a certain washing program. that are developed for handle certain tasks. They contain a processor or microcontroller that are executing the code. The processor can read the data from its sensors, i.e. thermometer and perform an action such as turn the fridge on if the temperature has increased beyond a treshold. 
Embedded Development is about developing software that is executed on an embedded processor.
 When developing a product that uses a microcontroller there has to be certain use cases are meant which is different that a PC which is general device i.e. is not targeting special use cases. A special use case can be measuring temperature in the room or measuring the heart rate and if necessary triggers the heart, all according to added parameters by the programmer. 
Embedded processors often use a battery as an energy source. Therefore it is necessary to keep in mind not to consume unnecessary energy when that is not needed. Such situation can be to reduce the speed that the processor is executing the software. However the developer needs to develop the software . Another solution can be to put the microcontroller in a sleep mode. In that case it needs to be woken up, which is also the task of the developer to know what can be important in order to wake up the microcontroller.
 the product to take situations into account. The software developed is targeting special use cases. 
 
 Some products that belong to the category of embedded systems:
 * Pacemaker - e.g. reads the heart beat
 * Smartphone - e.g. gets notification of incoming call and needs to take action in order to present that information to the user.
 * Missile - e.g. searches and follows it target even if the target is turning, increasing its speed or throwing out decoy.
 


