package com.cdac.acts.Shape.ShapeTester;

import java.util.Scanner;

import com.cdac.acts.Shape.ShapeInherit.Circle;
import com.cdac.acts.Shape.ShapeInherit.Rectangle;
import com.cdac.acts.Shape.ShapeInherit.Shape;

public class ShapeTester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("******Circle********\n");
		System.out.println("Enter radius of Circle");
		double radius = sc.nextDouble();
		
		Shape circle = new Circle();
		circle = new Circle(radius);
		System.out.println("\nArea of Circle is: " + circle.Area());
		System.out.println("Perimeter of Circle is: " + circle.Perimeter()+"\n");
		circle.draw();
		
		
		System.out.println("\n******Rectangle********\n");
		System.out.println("Enter Length of Rectangle");
		double length = sc.nextDouble();
		System.out.println("Enter breadth of Rectangle");
		double breadth = sc.nextDouble();
		
		Shape rectangle = new Rectangle();
		rectangle = new Rectangle(length,breadth);
		System.out.println("\nArea of Rectangle is: " + rectangle.Area());
		System.out.println("Perimeter of Circle is: " + rectangle.Perimeter()+"\n");
		rectangle.draw();
		
		sc.close();
	}
}
