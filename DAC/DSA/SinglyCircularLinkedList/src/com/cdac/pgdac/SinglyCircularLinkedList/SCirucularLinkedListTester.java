package com.cdac.pgdac.SinglyCircularLinkedList;

public class SCirucularLinkedListTester {

	public static void main(String[] args) {

		SCircularLinkedList SCList = new SCircularLinkedList();
		SCList.insert(10);
		SCList.insert(5);
		SCList.insert(20);
		SCList.insert(15);
		SCList.insert(13);
		SCList.insert(1);
		SCList.insert(40);
		SCList.insert(25);
		SCList.insert(11);
		SCList.insert(3);
		SCList.insert(10);
		SCList.insert(5);
		SCList.insert(20);
		SCList.insert(15);
		SCList.insert(1);
		SCList.insert(40);
		System.out.println("Elements in Singly Circular List are: ");
		SCList.print();
		
		//Deletion 
//		SCList.delete(5);
//		SCList.delete(20);
//		SCList.delete(40);
//		SCList.delete(1);
//		SCList.delete(15);
//		SCList.delete(11);
//		SCList.delete(13);
//		SCList.delete(3);
//		SCList.delete(10);
//		SCList.delete(25);
//		System.out.println("Elements in Singly Circular List After Deletion are: ");
//		SCList.print();

		//Deletion All
		SCList.deleteAll(15);
		SCList.deleteAll(5);
		SCList.deleteAll(40);
		SCList.deleteAll(1);
		SCList.deleteAll(20);
		SCList.deleteAll(10);
		System.out.println("Elements in Singly Circular List After Deletion of All Occurances are: ");
		SCList.print();

		
	}

}
