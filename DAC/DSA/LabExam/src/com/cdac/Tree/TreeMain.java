package com.cdac.Tree;

public class TreeMain {

	public static void main(String[] args) {
		int[] arr = {15,25,10,5,18,20};
		Tree btree = new BTree();
		Tree bstree = new BSTree();
		btree.insertIntoArray(arr);
		
		System.out.println("Element in tree Inorder are: ");
		btree.inorder();
		
		System.out.println("\nElement in tree PreOrder are: ");
		btree.preorder();
		
		System.out.println("\nElement in tree PostOrder are: ");
		btree.postorder();
		System.out.println("\n****************************************\n");
		bstree.insertIntoArray(arr);
		
		System.out.println("Element in BStree Inorder are: ");
		bstree.inorder();
		
		System.out.println("\nElement in BSttree PreOrder are: ");
		bstree.preorder();
		
		System.out.println("\nElement in BSttree PostOrder are: ");
		bstree.postorder();
	}

}
