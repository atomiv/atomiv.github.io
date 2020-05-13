package com.vemcodex.code.abstraction.fail;

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
