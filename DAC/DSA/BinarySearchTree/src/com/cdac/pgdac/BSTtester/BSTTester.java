package com.cdac.pgdac.BSTtester;

import com.cdac.pgdac.BST;
import com.cdac.pgdac.DeletionOfBST.DeletionInBST;


public class BSTTester {

	public static void BSTforDeletion() {
		int arr[] = {20,10,40,5,15,35,50,8,13,38,60,78};
		
		DeletionInBST BStree = new DeletionInBST();
		BStree.insertFromArray(arr);
		
		System.out.println("Elements in Binary Search Tree are: ");
		BStree.inOrder();
		
		BStree.Delete(78); // Leaf Node
		System.out.println("Elements in Binary Search Tree After LeafNode Deletion are: ");
		BStree.inOrder();
		
		BStree.Delete(13); // Node with one left child
		System.out.println("Elements in Binary Search Tree After node with only one left child Deletion are: ");
		BStree.inOrder();
		
		BStree.Delete(35); // Node with one right child
		System.out.println("Elements in Binary Search Tree After node with only one right child Deletion are: ");
		BStree.inOrder();
		
		BStree.Delete(10); // Node with both children
		System.out.println("Elements in Binary Search Tree After node with both child Deletion are: ");
		BStree.inOrder();
		
	}
	public static void BSTMain() {
		int arr[] = {20,10,40,5,15,35,50,8,19,38,60,78};
		
		BST BStree = new BST();
		BStree.insertFromArray(arr);
		
		System.out.println("Elements in Binary Search Tree are: ");
		BStree.inOrder();
		
		System.out.println("\nHeight of Binary Search Tree is: ");
		BStree.HeightofBST();
		
		System.out.println("Smallest Element of Binary Search Tree is: ");
		BStree.findSmallest();
		
		System.out.println("Largest Element of Binary Search Tree is: ");
		BStree.findLargest();
		
	}
	public static void main(String[] args) {

		//BSTMain();
		BSTforDeletion();

	}

}
