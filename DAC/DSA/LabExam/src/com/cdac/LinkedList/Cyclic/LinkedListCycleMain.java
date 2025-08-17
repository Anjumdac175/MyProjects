package com.cdac.LinkedList.Cyclic;

import java.util.Scanner;

public class LinkedListCycleMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);		
		findCycle cycle = new findCycle();
		System.out.println("Elements in List are: ");
		cycle.insert(20);
		cycle.insert(15);
		cycle.insert(10);
		cycle.insert(5);
		cycle.insert(1);
		cycle.traverse();
		
		System.out.println("\nIndex at which cycle is to be create: ");
		int index = sc.nextInt();
		cycle.createCycle(index);
		
		System.out.println("\nIs Cycle Created in this List? " + cycle.isCycle());
		
		cycle.removeCycle();
		
		
		sc.close();
	}

}
