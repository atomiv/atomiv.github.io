package com.vemcodex.code.abstraction.fail;

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
