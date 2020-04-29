package com.vemcodex.code.inheritance.fail;

public class Lion {
	
	private String name;
	private double height;
	private String furColor;
	
	public Lion(String name, double height, String furColor) {
		this.name = name;
		this.height = height;
		this.setHasPouch(hasPouch);
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

	public boolean isHasPouch() {
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
