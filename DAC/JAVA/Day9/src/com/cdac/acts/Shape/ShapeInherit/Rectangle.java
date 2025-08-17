package com.cdac.acts.Shape.ShapeInherit;

public class Rectangle extends Shape {

	private double length;
	private double breadth;
	
	public Rectangle() {
		super();
	}

	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double Area() {
		return length*breadth;
	}

	@Override
	public double Perimeter() {
		return 2*(length+breadth);
	}

	@Override
	public void draw() {
		System.out.println("Rectangle Can be Drawable..........");
		
	}

}
