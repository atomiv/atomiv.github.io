---
title: Get Started
category: android
authors: [ velibor-cakarevic ]
---

When mentioning Android one should take into account that there are different versions, depending on the vender. However they all (most likely) have the same codebase which is AOSP. AOSP is the acronym for Android Open Source Project and enables one to compile an own Android version. Below are how-to guide of downloading the AOSP source code, building it and starting the emulator.
 
## Installation
Building AOSP in the Linux distribution: Ubuntu Release 20.04  
After installing Ubuntu please do the following steps, before downloading the source code and building it.

Update the package list from the repositores and get information on the newest packages and their dependencies.  
**sudo apt update**

Install git version 2 (git will be used for fetching the source code from the repository).
**sudo apt install git**


**sudo apt install m4**

**sudo apt-get install libncurses5**

**vi ~/.bashrc**

**PATH=~/bin:$PATH**

**source ~/.bashrc**

**sudo apt install curl**

**curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo**

**chmod a+x ~/bin/repo**


## Source code

## creating a working directory
**mkdir WORKING_DIRECTORY**

**cd WORKING_DIRECTORY**

**git config --global user.name "your name"**

**git config --global user.email "your email adress"**

**sudo ln -s /usr/bin/python3 /usr/bin/python**

### downloading code

Master branch


A particular branch: https://source.android.com/setup/start/build-numbers#source-code-tags-and-builds

**repo init -u https://android.googlesource.com/platform/manifest -b android-10.0.0_r41**

**repo sync -j3**

## Compilation

**source build/envsetup.sh**

**lunch aosp_arm-eng**

**m**

### Generate updates

## Execution

When issuing the command **emulator** the default vuild will be executed.

If you wish to execute it on a device the these two devices:  
Google Pixel 2

Google Pixel 2 XL

This is an example of code in GitHub pages:


```
@RestController
public class HelloController {

	@RequestMapping("/")
	public String index() {
		return "Hello to this app!";
	}
}
```
