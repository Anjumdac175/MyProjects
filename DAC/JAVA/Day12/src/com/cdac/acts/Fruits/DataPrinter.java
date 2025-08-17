package com.cdac.acts.Fruits;

import java.util.Iterator;
import java.util.List;

public class DataPrinter {
	
	public static void printData(List<Fruits> fruits) {
		Iterator<Fruits> itr = fruits.iterator();
		System.out.println("List of Fruits are: ");
		System.out.println("\n***************************\n");
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
