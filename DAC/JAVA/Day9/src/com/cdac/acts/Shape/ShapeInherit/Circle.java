package com.cdac.acts.Shape.ShapeInherit;

public class Circle extends Shape {

	public static final double PI = 3.142;
	private double radius;
	
	
	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double Area() {
		return PI*radius*radius;
	}

	@Override
	public double Perimeter() {
		return 2*PI*radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle is Drawable............");
		
	}

	@Override
	public String toString() {
		return "Circle [radius=" + radius + "]";
	}

}
