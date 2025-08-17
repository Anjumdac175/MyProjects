package com.cdac.acts.ArrayCollections.AddNumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

public class AddNumber {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of numbers to be added");
		int n = sc.nextInt();
		sc.nextLine();
		double sum = 0.0;
		
		List<Double> addnumbers = new ArrayList<>();
		
		for(int i = 0; i < n; i++)
		{
			System.out.println("Enter Number: "+(i+1));
			double num = sc.nextDouble();
			addnumbers.add(num);
		}	
		
		System.out.println("\nPrinting of Number in the List...........");
		ListIterator<Double> itr = addnumbers.listIterator();
		while(itr.hasNext())
		{
			Double number = itr.next();
			System.out.println(number);
		}
		
		for(int i = 0; i < addnumbers.size(); i++)
		{
			sum = sum+addnumbers.get(i);
		}
		System.out.println("\nSum of All Numbers is:..........." + sum);

		
		sc.close();

	}

}
