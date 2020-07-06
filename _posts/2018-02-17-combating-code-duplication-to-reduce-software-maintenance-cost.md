---
layout: post
title: Combating code duplication to reduce software maintenance cost
author: vcupac
created: 2018-02-17 15:33:00
modified: 2018-03-03 20:38:00 
category: development
---

Code duplication is a serious issue in software development, because it is one of the primary causes of high maintenance cost and reduction in quality. In cases of code duplication, it increases the code base size, thereby increasing the cost of any subsequent changes or bug fixes, causing development and test efforts to be unnecessarily duplicated. From a technical perspective, code duplication is a big problem because it violates some of the core underlying principles - it violates the DRY Principle and the Abstraction Principle. In this article, we review the concepts underlying code duplication, the costs of code duplication, different types of code duplication and how code duplication may be refactored.

## Background Story

John was pulling yet another all-nighter, trying to do some last minute fixes to prepare for the next release. The code base had grown so large, it took longer and longer to implement features, including even "simple" requests, and not to mention the bugs that came along. It was just one of those standard accounting applications, but there were some quirks needed to support the growing base of international customers.

At first, it was quite simple, but then there were more and more features, and customizations. So now, when there was just one change somewhere, it needed to be replicated to several other parts, and every change took longer and longer to do. Now John was spending more and more time maintaining those code "clones". He was thinking to himself: is there a better way?

## What is Code Duplication?

Code duplication refers to the presence of the same (or similar) code occurring multiple times within the code base. Each of these duplicate code blocks are referred to as code clones, or just clones. Code clones could be detected via manual inspection of the source code(identifying identical or similar code), or by automated Clone Detection mechanisms.

### What are the costs of Code Duplication?

* Code duplication increases overall code base size, thereby increasing the overall maintenance effort
* Maintenance effort is a big part of overall cost, so this leads to an overall more costly project
* Any bugs or vulnerabilities within the code are replicated when blocks of code are copy-pasted, decreasing quality
* Any changes or bugs affecting code clones need to be repeated for each clone, increasing development effort (changing / fixing each clone), test effort (re-testing each of the affected clones), and causes quality risk (there is possibility of human error that a code clone was overlooked or that changes were not propagated in the same way)

### How does Code Duplication violate general principles?

The following are some core principles in software development:
* Don't Repeat Yourself (DRY) Principle states that every piece of knowledge within a system must have a _single_ representatoion within a system (i.e. no duplication).
* Abstraction Principle indicates that appropriate levels of abstraction should be used, in order to minimize code duplication

So as can be seen above, from the technical perspective, code duplication violates core principles and best practices.

### Why does Code Duplication occur?

Some of the root causes for code duplication are as follows:

* Developers inadvertedly copy-paste code because it's faster (in the immediate short term) and they may be under pressure to fulfill deadlines
* Developers inadvertedly copy-paste code and do not refactor it because they do not know how to identify the abstraction and how to refactor it
* Multiple developers are working but are unaware that another developer has already implemented a certain functionality, so then the second developer implements it again

## What are the different types of Code Duplication? - Part I

The following will be used as a motivating example for illustrating the different types of code duplication. This is a banking application which keeps track of account balances, it prints a balance in the morning, then after transactions are performed, it again prints the account balance.


```java
// Register initial set of bank accounts

ArrayList<Double> accountBalances = new ArrayList<Double>();
accountBalances.add(5000.00);
accountBalances.add(4300.00);
accountBalances.add(6900.00);

// Display the balance for all accounts

double total = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	total += accountBalance;
}

System.out.println("Total balance for all accounts: " + total);

// Then, some further accounts are registered

accountBalances.add(7500.00);
accountBalances.add(8900.00);

// There could be transactions performed as well, and any other business logic

// However, at the end of the day, we need to again display the account balances
// so the simple "quick" solution is to copy-paste the code above and use it again below

total = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	total += accountBalance;
}

System.out.println("Total balance for all accounts: " + total);
```


### Character-for-Character Code Duplication

The following is a simple example of identical looking code, i.e. direct copy paste. The first part of the code has been copied, so the second part of is the code clone. Here, we did just one copy (to keep the example short), but it could have been copied even more times, resulting in multiple clones.

The first block displays the bank account balance:

```java
double total = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	total += accountBalance;
}

System.out.println("Total balance for all accounts: " + total);
```

Then after some transactions are executed, the copy-pasted block of code again prints the account balance:

```java
total = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	total += accountBalance;
}

System.out.println("Total balance for all accounts: " + total);
```


### Token-for-Token Code Duplication

However, there is also the possibility that there were some slight modifications that needed to be done, resulting in renaming, some minor changes such as different messages being shown, etc. 

Later, due to various change requests, the two blocks of code continue to further evolve, for example, the requirement could be that for the afternoon account display, it should also report the highest and lowest account balances. Perhaps later there will also be a requirement to display not only the morning and afternoon account balance, but also the evening balance, resulting in yet another copy-paste.

The following block prints the account balance in the morning:

```java
double totalMorning = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Morning balance for account " + i + " is: " + accountBalance);
	totalMorning += accountBalance;
}

System.out.println("Total morning balance for all accounts: " + totalMorning);
```

Then, that code was copy-pasted and (with some minor renaming from "morning" to "afternoon" and some other small variations), it looks quite similar:

```java
double totalAfternoon = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Afternoon balance for account " + i + " is: " + accountBalance);
	totalAfternoon += accountBalance;
}

System.out.println("Total afternoon balance for all accounts: " + totalAfternoon);
```

### Functional Code Duplication

The examples above focused on syntax-based similarities within code. However, it is also possible that whilst syntax is different, two blocks of code are functionally identical or similar. This may occur for example, if two different developers independently implemented the code.

Once again, going back to the original code:

```java
double total = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	total += accountBalance;
}

System.out.println("Total balance for all accounts: " + total);
```

The following code was written by another developer in the team, who needed to implement the exact same functionality, but he implemented it in a different way, thus it is functionally equivalent:

```java
total = accountBalances.stream().mapToDouble(Double::doubleValue).sum();

int i = 0;
while(i < accountBalances.size()) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Balance for account " + i + " is: " + accountBalance);
	i++;
}

System.out.println("Total balance for all accounts: " + total);
```

### Putting it all together

In practice, it quite often happens that the above cases of code duplication may be comined together.

First block:

```java
double totalMorning = 0;

for(int i = 0; i < accountBalances.size(); i++) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Morning balance for account " + i + " is: " + accountBalance);
	totalMorning += accountBalance;
}

System.out.println("Total morning balance for all accounts: " + totalMorning);
```

Second block:

```java
double totalAfternoon = accountBalances.stream().mapToDouble(Double::doubleValue).sum();

int i = 0;
while(i < accountBalances.size()) {
	double accountBalance = accountBalances.get(i);
	System.out.println("Afternoon balance for account " + i + " is: " + accountBalance);
	i++;
}

System.out.println("Total afternoon balance for all accounts: " + totalAfternoon);
```


## What are the different types of Code Duplication? - Part II

### Code Duplication with Data Variation

#### Duplication

Suppose we have a block of code somewhere which performs withdrawal from an account:

```java
double accountBalance = 3000;
double withdrawal = 50;

if(withdrawal <= accountBalance) {
	accountBalance -= withdrawal;
	System.out.println("Successful withdrawal, updated balance: " + accountBalance);
} else {
	System.out.println("Failed withdrawal");
}
```

Then later on, either within the same method, or perhaps another method, there is similar looking code, but just with different parameter values, but everything else is the same:


```java
double accountBalance2 = 6000;
double withdrawal2 = 7000;

if(withdrawal2 <= accountBalance2) {
	accountBalance2 -= withdrawal2;
	System.out.println("Successful withdrawal, updated balance: " + accountBalance2);
} else {
	System.out.println("Failed withdrawal");
}
```

#### Refactoring

Firstly, we identify that the code is the same (it was copy-pasted) and the only difference is the parameters. So then we make a separate method, which encapsulates the common code, and the parameters are passed into it:

```java
private static void withdraw(double accountBalance, double withdrawal) {
	if(withdrawal <= accountBalance) {
		accountBalance -= withdrawal;
		System.out.println("Successful withdrawal, updated balance: " + accountBalance);
	} else {
		System.out.println("Failed withdrawal");
	}
}
```

Then, the first block references the common withdrawal method:

```java
double accountBalance = 3000;
double withdrawal = 50;

withdraw(accountBalance, withdrawal);
```

Similar principle applies for the second block, also referencing the same withdrawal method:

```java
double accountBalance2 = 6000;
double withdrawal2 = 7000;

withdraw(accountBalance2, withdrawal2);
```

### Code Duplication with Type Variation

#### Duplication

Suppose we have this block of code:

```java
List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");

for(String stringElement : stringList) {
	System.out.println(stringElement);
}

int stringListSize = stringList.size();
System.out.println(stringListSize);
```

Then we have another similar-looking block of code, except that there's a difference in types (now it's an integer list instead of a string list):

```java
List<Integer> intList = Arrays.asList(60, 23, 80, 90);

for(int intElement : intList) {
	System.out.println(intElement);
}

int intListSize = intList.size();
System.out.println(intListSize);
```

#### Refactoring

We isolate the common code using generics, to handle the variation in type:

```java
private static <T> void showInfo(List<T> list) {
	for(T element : list) {
		System.out.println(element);
	}
	
	int listSize = list.size();
	System.out.println(listSize);
}
```

Then, we refactor the first block:

```java
List<String> stringList = Arrays.asList("Apple", "Banana", "Orange");
showInfo(stringList);
```

And we also refactor the second block:

```java
List<Integer> intList = Arrays.asList(60, 23, 80, 90);
showInfo(intList);	
```

### Code Duplication with Function Variation

#### Duplication

We have a block of code:

```java
int left = 5;
int right = 7;

System.out.println("Left: " + left);
System.out.println("Right: " + right);

int result = left + right;

System.out.println("Result: " + result);
```

Then we have another block of code, but this time the computation uses a different function (multiplication instead of addition):

```java
int left2 = 5;
int right2 = 7;

System.out.println("Left: " + left2);
System.out.println("Right: " + right2);

int result2 = left2 * right2;

System.out.println("Result: " + result2);
```

#### Refactoring

We now create a common method, extrapolating the abstraction that there is a difference in the binary function:

```java
private static void runBinary(BiFunction<Integer, Integer, Integer> binaryFunction, int left, int right) {
	System.out.println("Left: " + left);
	System.out.println("Right: " + right);
	
	int result = left + right;
	
	System.out.println("Result: " + result);		
}
```

We apply it to the first code block:

```java
int left = 5;
int right = 7;

runBinary((l, r) -> l + r, left, right);
```

Then we apply it to the second code block:

```java
int left2 = 5;
int right2 = 7;

runBinary((l, r) -> l * r, left2, right2);
```

## Summary

In this article, we have reviewed the definition of code duplication, analyzed reasons why code duplication should be minimized / avoided (both the technical perspective as well as the financial perspective), and we identified the different types of code duplication as well as how it can be refactored to remove the duplication. The core benefits that can be realized by this is reducing the maintenance cost of software as well as increasing the quality.

## References

Code duplication:
* [Duplicate Code (Wikipedia)](https://en.wikipedia.org/wiki/Duplicate_code)
* [Duplicate Code (Refactoring Guru)](https://refactoring.guru/smells/duplicate-code)
* [Types of Duplication in Code (Simple Programmer)](https://simpleprogrammer.com/types-of-duplication-in-code/)
* [Does source code duplication matter? (SolidSourceIT)](https://solidsourceit.wordpress.com/2012/08/03/does-source-code-duplication-matter/)
* [Refactoring Ruby: Bad Smells in Code - Duplicated Code (Informit)](http://www.informit.com/articles/article.aspx?p=1400866)
* [Four Types of Duplication in Source Code (Prakash)](https://www.sharmaprakash.com.np/four-types-of-duplication-in-source-code/)

Principles:
* [Don't Repeat Yourself (Wikipedia)](https://en.wikipedia.org/wiki/Don%27t_repeat_yourself)
* [Abstraction Principle (Wikipedia)](https://en.wikipedia.org/wiki/Abstraction_principle_(computer_programming))
* [Rule of three (Wikipedia)](https://en.wikipedia.org/wiki/Rule_of_three_(computer_programming))