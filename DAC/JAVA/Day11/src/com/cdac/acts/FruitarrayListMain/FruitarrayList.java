package com.cdac.acts.FruitarrayListMain;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import com.cdac.acts.FruitarrayList.FruitList;

public class FruitarrayList {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		List<FruitList> fruitList = new LinkedList<>();
		System.out.println("Enter size of Fruit list");
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=0; i< n; i++) {
			System.out.println("Enter the FruitList");
			System.out.println("*******************************\n");
			System.out.println("Fruit: "+(i+1));
			System.out.println("\nEnter Fruit Name");
			String name = sc.nextLine();
			System.out.println("\nEnter Fruit Color");
			String color = sc.nextLine();
			System.out.println("\nEnter Fruit Price");
			double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("\nEnter Fruit Quantity");
			int qty = sc.nextInt();
			sc.nextLine();
			System.out.println("\n************************\n");

			fruitList.add(new FruitList(name,color,price,qty));
		}
		
		ListIterator<FruitList> itr = fruitList.listIterator();
		
		System.out.println("FruitList are:");
		System.out.println("*******************************\n");
		while(itr.hasNext())
		{
			FruitList fl = itr.next();
			System.out.println(fl);
		}
		
		
		//This is using LikedList
		LinkedList<FruitList> fruit = new LinkedList<>();
		fruit.add(new FruitList("Mango","Yelloe",350,3));
		fruit.add(new FruitList("Apple","Red",350,2));
		fruit.add(new FruitList("Avacado","LemonGreen",350,1));
		System.out.println("\nAfter Adding Fruit with Add(): " + fruit);
		System.out.println("*******************************\n");
		fruit.addFirst(new FruitList("Orange","Orange",250,2));
		System.out.println("After Adding Fruit with AddFirst(): " + fruit);
		System.out.println("*******************************\n");
		fruit.addLast(new FruitList("cherry","Red",150,4));
		System.out.println("After Adding Fruit with AddLast(): " + fruit);
		System.out.println("*******************************\n");
		fruit.remove(2);
		System.out.println("After Removing Fruit at Index 2: " + fruit);
		System.out.println("*******************************\n");
		fruit.removeFirst();
		System.out.println("After Removing Fruit with RemoveFirst: " + fruit);
		System.out.println("*******************************\n");
		fruit.removeLast();
		System.out.println("After Removing Fruit with RemoveLast: " + fruit);
		System.out.println("*******************************\n");
		System.out.println("After Getting Fruit At Index 1: " + fruit.get(1));
		System.out.println("*******************************\n");
		System.out.println("After Getting Fruit with getFirst: " + fruit.getFirst());
		System.out.println("*******************************\n");
		System.out.println("After Getting Fruit with getLast: " + fruit.getLast());
		System.out.println("*******************************\n");
		System.out.println("Fruits list size(): " + fruit.size());
		System.out.println("*******************************\n");
		
    	
    	System.out.println("Is the list empty? " + fruit.isEmpty()); // false
		
		sc.close();
	}

}
