---
layout: post
title: Four pillars of object oriented design
author: vcupac
created: 2018-04-11 20:08:00
modified: 2018-06-27 20:46:00
category: architecture 
---

When we are doing programming (or any other kind of activity), the principles which guide our decisions are one of the critical factors which affect what kind of software we implement. When we come to object oriented design, the key question becomes, what are the core principles underlying object oriented design? How do we know if code is object oriented or not? What is good object oriented design?

## Pillars

There are four fillars underlying OOP:
1. Encapsulation
2. Abstraction
3. Inheritance
4. Polymorphism

## Pillar 1 - Encapsulation

The first pillar of object oriented design is encapsulation, which refers to "data hiding" ("information hiding"). This means that the object state (held by the object data values) is hidden within the class, so that it is not possible for other parties to directly access the state. Instead other parties can only access or mutate the state via publicly accessible methods. Effectively, this means that the object's internal representation is hidden from the outside view. 

Before we look at what is encapsulation, let's firstly look at what is NOT encapsulation:

```java
public class BankAccount {
	public long accountNumber;
	public String ownerName;
	public double balance;
}
```

In this case, all the data is publicly accessible and may be directly changed by the caller:
```java
BankAccount bankAccount = new BankAccount();

bankAccount.accountNumber = 9243242342335L;
bankAccount.ownerName = "John Smith";
bankAccount.balance = 4000; // Initial balance
bankAccount.balance = 9000; // Updated balance after deposit
bankAccount.balance = 7000; // Updated balance after withdrawal
```

Ok, the code looks simple, but let's see if it works correctly:
1. Based on business rules within the bank, the account number is set once and only once for a bank account, it should never be allowed to change. But yet in the code above, it is possible to directly change the account number, and if in some other part of the code it is accidentally re-set, we get - oh no - a bug!
2. Based on the business rules within the bank, amounts can be withdrawn only if there is sufficient balance available. However, in the code above, there's nothing to enforce those rules. Sure we might add additional checks, but as we can see it is still directly possible to change the balance, and when that happens, we get - oh not - yet another bug!
3. However, it's not just about the high bug risk, but also the separation between the data and the operations between the data, i.e. the relationship between the balance and the operations associated with it (depost, withdrawal), so later when the business logic grows, it becomes an issue.

So let's look at the updated class with encapsulation being used, since the data members are private and can be accessed only via the public methods:

```java
public class BankAccount {
	private long accountNumber;
	private String ownerName;
	private double balance;
	
	public BankAccount(long accountNumber, String ownerName, double balance) {
		this.accountNumber = accountNumber;
		this.ownerName = ownerName;
		this.balance = balance;
	}
	
	public long getAccountNumber() {
		return accountNumber;
	}
	
	public String getOwnerName() {
		return ownerName;
	}
	
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposit(int amount) {
		balance += amount;
	}
	
	public void withdraw(int amount) {
		if(balance < amount) {
			throw new IllegalArgumentException("Cannot withdraw " + amount + " due to insufficient funds.");
		}
		
		balance -= amount;
	}
}
```

In the above, we can be sure that the business rule regarding the accountNumber being able to be set once only is adhered to, since, it is impossible in the code above to change the accountNumber from the outside. Furthermore, regarding depositing and withdrawal, we can be sure that any changes to the balance are done in a safe way.

```java
BankAccount bankAccount = new BankAccount(9243242342335L, "John Smith", 4000);
bankAccount.deposit(5000);
bankAccount.withdraw(2000);
```

What's so great regarding the encapsulation above:
1. The caller does not need to be concerned about the internal data structure, easier to understand, less complexity.
2. It ensures that certain bugs associated with incorrectly changing state have been eliminated, reducing the rate of defects.

## Pillar 2 - Abstraction

The second pillar of OOP is abstraction, which refers to the process of hiding away unnecessary details in order handle complexity. So in the case of abstraction, the idea is just to expose which methods can be called, what are the input parameters and output parameters, whilst hiding the internal implementation details, so that it's not necessary for the user to know or understand how the method implementation.

So, to illustrate the example, suppose we are making an application which computes the area of various shapes. 

Rectangle class:

```java
public class Rectangle {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
}
```

Circle class:

```java
public class Circle {
	
	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
```

Triangle class:

```java
public class Triangle {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return 0.5 * base * height;
	}
}
```

Then finally, we have some code which computes the total area of all those shapes:

```java
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Rectangle> rectangles = new ArrayList<Rectangle>();
		rectangles.add(new Rectangle(10, 20));
		rectangles.add(new Rectangle(15, 18));
		
		ArrayList<Circle> circles = new ArrayList<Circle>();
		circles.add(new Circle(12));
		circles.add(new Circle(14));
		circles.add(new Circle(23));
		
		ArrayList<Triangle> triangles = new ArrayList<Triangle>();
		triangles.add(new Triangle(30, 12));
		triangles.add(new Triangle(24, 19));
		
		double totalAreaRectangles = getTotalAreaRectangles(rectangles);
		double totalAreaCircles = getTotalAreaCircles(circles);
		double totalAreaTriangles = getTotalAreaTriangles(triangles);
		
		double totalArea = totalAreaRectangles + totalAreaCircles + totalAreaTriangles;
		
		System.out.println("Total area: " + totalArea);
	}
	
	private static double getTotalAreaRectangles(ArrayList<Rectangle> rectangles) {
		double totalArea = 0;
		
		for(Rectangle rectangle : rectangles) {
			totalArea += rectangle.getArea();
		}
		
		return totalArea;
	}
	
	private static double getTotalAreaCircles(ArrayList<Circle> circles) {
		double totalArea = 0;
		
		for(Circle circle : circles) {
			totalArea += circle.getArea();
		}
		
		return totalArea;
	}

	private static double getTotalAreaTriangles(ArrayList<Triangle> triangles) {
		double totalArea = 0;
		
		for(Triangle triangle : triangles) {
			totalArea += triangle.getArea();
		}
		
		return totalArea;
	}
	
}
```

This code gets quite cumbersome... Instead of thinking about rectangles, circles and triangles separately, why not just think of them in a more abstract way, as shapes? After all, we don't really need any fo their specific details, we just need to get their area.

In that case, we could specify the abstraction as an interface (or an abstract class):

```java
public interface Shape {
	
	public double getArea();
	
}
```

Subsequently, all the shapes implement that interface. A rectangle is a shape:

```java
public class Rectangle implements Shape {

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return width * height;
	}
}
```

Similarly, a circle is a shape:

```java
public class Circle implements Shape {

	private double radius;
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return Math.PI * Math.pow(radius, 2);
	}
}
```

Finally, a triangle is also a shape:

```java
public class Triangle implements Shape {
	
	private double base;
	private double height;
	
	public Triangle(double base, double height) {
		this.base = base;
		this.height = height;
	}
	
	public double getBase() {
		return base;
	}
	
	public double getHeight() {
		return height;
	}
	
	public double getArea() {
		return 0.5 * base * height;
	}
}
```

Finally, computing the area becomes much simpler:

```java
public class Main {

	public static void main(String[] args) {
		
		ArrayList<Shape> shapes = new ArrayList<Shape>();
		shapes.add(new Rectangle(10, 20));
		shapes.add(new Rectangle(15, 18));
		shapes.add(new Circle(12));
		shapes.add(new Circle(14));
		shapes.add(new Circle(23));
		shapes.add(new Triangle(30, 12));
		shapes.add(new Triangle(24, 19));
		
		double totalArea = getTotalArea(shapes);
		
		System.out.println("Total area: " + totalArea);
	}
	
	private static double getTotalArea(ArrayList<Shape> shapes) {
		double totalArea = 0;
		
		for(Shape shape : shapes) {
			totalArea += shape.getArea();
		}
		
		return totalArea;
	}
	
}
```

Based on the above, we can see how abstraction reduces complexity by hiding away unnecessary implementation details. After we introduced the shape abstraction, we no longer have to care what kidn of shape the object is, or how the area is computed.

  
## References

* [Object Oriented Design Principles (CodeProject)](https://www.codeproject.com/Articles/567768/Object-Oriented-Design-Principles)
  
* [Principles of Object Oriented Design (Wiki c2)](http://wiki.c2.com/?PrinciplesOfObjectOrientedDesign)

* [OOP Principles (Anampiu)](https://anampiu.github.io/blog/OOP-principles/)

* [Encapsulation (Wikipedia)](https://en.wikipedia.org/wiki/Encapsulation_(computer_programming))

* [Abstraction in object oriented programming (Wikipedia)](https://en.wikipedia.org/wiki/Abstraction_(computer_science)#Abstraction_in_object_oriented_programming)

* [OOP Concept for Beginners: What is Abstraction? (Stackify)](https://stackify.com/oop-concept-abstraction/)

* [Inheritance (Wikipedia)](https://en.wikipedia.org/wiki/Inheritance_(object-oriented_programming))

