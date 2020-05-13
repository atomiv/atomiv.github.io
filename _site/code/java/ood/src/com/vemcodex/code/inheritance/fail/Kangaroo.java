package com.vemcodex.code.inheritance.fail;

public class Kangaroo {
	
	private String name;
	private double height;
	private boolean hasPouch;
	
	public Kangaroo(String name, double height, boolean hasPouch) {
		this.name = name;
		this.height = height;
		this.hasPouch = hasPouch;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) {
		this.height = height;
	}

	public boolean getHasPouch() {
		return hasPouch;
	}

	public void setHasPouch(boolean hasPouch) {
		this.hasPouch = hasPouch;
	}
	
	public void eat() {
		System.out.println("Eating food...");
	}
	
	public void hop() {
		System.out.println("Hopping...");
	}
	
}
