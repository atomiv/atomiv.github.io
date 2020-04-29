package com.vemcodex.code.abstraction.fail;

import java.util.ArrayList;

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
