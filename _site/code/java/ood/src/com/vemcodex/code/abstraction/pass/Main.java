package com.vemcodex.code.abstraction.pass;

import java.util.ArrayList;

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
