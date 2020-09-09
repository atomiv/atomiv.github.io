---
title: Get Started
category: android
authors: [ velibor-cakarevic ]
---

 
## Installation
This is showing buiulding AOSP on the Linux distribution:
Ubuntu Release: 20.04

After installing Ubuntu plese do the following steps before downloading the source code and building it.

sudo apt update

sudo apt install git

sudo apt install m4

sudo apt-get install libncurses5

vi ~/.bashrc 

PATH=~/bin:$PATH

source ~/.bashrc

sudo apt install curl

curl https://storage.googleapis.com/git-repo-downloads/repo > ~/bin/repo

chmod a+x ~/bin/repo


## Source code

## creating a working directory
mkdir WORKING_DIRECTORY

cd WORKING_DIRECTORY

git config --global user.name "your name"

git config --global user.email "your email adress"

sudo ln -s /usr/bin/python3 /usr/bin/python

### downloading code

Master branch


A particular branch: https://source.android.com/setup/start/build-numbers#source-code-tags-and-builds

repo init -u https://android.googlesource.com/platform/manifest -b android-10.0.0_r41

repo sync -j3

## Compilation

source build/envsetup.sh

lunch aosp_arm-eng

m

### Generate updates

## Execution

Some text.

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
