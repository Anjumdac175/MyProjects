package com.cdac.levelOrder;

public class LevelOrderTester {

	public static void main(String[] args) {
		int arr[] = {20,10,40,5,15,35,50,8,19,38,60,78};

		LevelOrder BStree = new LevelOrder();
		BStree.insertFromArray(arr);

		System.out.println("Elements in Binary Search Tree By Level Order Taversal are: ");
		BStree.LevelOrderTraverse();

	}

}
