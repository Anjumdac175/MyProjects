package com.cdac.acts.ArrayCollections.Fruits;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class FruitMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<Fruit> fruitList = new ArrayList<>();
		
		System.out.println("Enter No of Fruits to be entered: ");
		int n = sc.nextInt();
		sc.nextLine();
		System.out.println("***********************************\n");
		
		for(int it = 0; it < n; it++)
		{
			System.out.println("Enter Name of the Fruit");
			String name = sc.nextLine();
			System.out.println("Enter color of the Fruit");
			String color = sc.nextLine();
			System.out.println("Enter the Price of the Fruit");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter the Qauntity of Fruit");
			int qty = sc.nextInt();
			sc.nextLine();
			fruitList.add(new Fruit(name,color,price,qty));
		}
		//Adding using Add manually
		fruitList.add(3, new Fruit("JackFruit","LemonYellow",120,1) );
		
		System.out.println("\nThis Retrieving of data is using Traditional for loop.............");
		System.out.println("Fruits in ArrayList are: \n");
		System.out.println("***********************************\n");
		for(int it = 0; it < fruitList.size(); it++)
		{
			
			System.out.println(fruitList.get(it));
		}
		
		System.out.println("\nThis Retrieving of data is using toString.............");
		System.out.println("***********************************\n");
		System.out.println(fruitList);
		
		System.out.println("\nThis Retrieving of data is using Advance Loop.............");
		System.out.println("***********************************\n");
		for(Fruit fl: fruitList)
		{
			System.out.println(fl);
		}
		System.out.println("\nThis Retrieving of data is using Iterators.............");
		System.out.println("***********************************\n");
		ListIterator<Fruit> itr = fruitList.listIterator();
		while(itr.hasNext())
		{
			Fruit fl =  itr.next();
			System.out.println(fl);
		}
		
		//Removing any fruit using index
		fruitList.remove(4);
		System.out.println("\nAfter Removing of data Fruit List is.............");
		System.out.println("***********************************\n");
		System.out.println(fruitList);
		
		//Updating Data of Fruits with Set
		fruitList.set(0,new Fruit("BlueBerry","Blue",350,3));
		System.out.println("\nAfter Updating Fruit List is........");
		System.out.println("***********************************\n");
		while(itr.hasNext())
		{
			Fruit f = itr.next();
			System.out.println(f);
		}
		
		
		sc.close();

	}

}
