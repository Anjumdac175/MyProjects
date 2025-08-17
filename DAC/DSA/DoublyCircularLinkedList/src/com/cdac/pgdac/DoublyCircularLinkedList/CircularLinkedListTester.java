package com.cdac.pgdac.DoublyCircularLinkedList;

public class CircularLinkedListTester {

	public static void main(String[] args) {

		CircularLinkedList DCList = new CircularLinkedList();
		DCList.insert(10);
		DCList.insert(5);
		DCList.insert(3);
		DCList.insert(20);
		DCList.insert(15);
		DCList.insert(1);
		DCList.insert(1);
		DCList.insert(3);
		DCList.insert(20);
		DCList.insert(15);
		System.out.println("Elements in List are: ");
		DCList.print();
		
//		//deletion
//		DCList.delete(10);
//		DCList.delete(5);
//		DCList.delete(3);
//		DCList.delete(20);
//		DCList.delete(15);
//		DCList.delete(1);
//		System.out.println("Elements in List After Deletion are: ");
//		DCList.print();
		
		//deletion All Occurances
		DCList.deleteAll(15);
		DCList.deleteAll(1);
		DCList.deleteAll(20);
		System.out.println("Elements in List After Deletion of All Occurances are: ");
		DCList.print();
	}

}
