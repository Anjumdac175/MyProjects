package com.cdac.validateBST;

public class vaildateBSTTester {

	public static void main(String[] args) {
		int arr[] = {20,10,40,5,15,35,50,8,19,38,60,78};

		vaildateBST vbst = new vaildateBST();
		vbst.insertFromArray(arr);

		
		System.out.println("Elements in Binary Search Tree are: ");
		vbst.inOrder();
		
		System.out.println("\nElements in Binary Search Tree using InOrder Iterative Method are: ");
		vbst.InorderBSTree();

		System.out.println("\nis given Tree is BST? " + vbst.validateBSTree());
	}

}
