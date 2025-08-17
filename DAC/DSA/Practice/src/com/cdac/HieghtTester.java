package com.cdac;

import com.cdac.HeightOfBInaryTree.HieghtOfTree;

public class HieghtTester {

	public static void findHeightOfTree() {
		int arr[] = {20,10,40,5,15,35,50,8,19,38,60,78};
		
		HieghtOfTree BStree = new HieghtOfTree();
		BStree.insertFromArray(arr);
		
		System.out.println("Elements in Binary Search Tree are: ");
		BStree.inOrder();
		
		System.out.println("\nHeight of Binary Search Tree is: ");
		BStree.HeightofBST();
		
		System.out.println("\nIs 19 present in Binary Search Tree? " + BStree.search(19));
		System.out.println("\nIs 13 present in Binary Search Tree? " + BStree.search(13));
		
	
		
	}
	public static void main(String[] args) {
		findHeightOfTree();

	}

}
