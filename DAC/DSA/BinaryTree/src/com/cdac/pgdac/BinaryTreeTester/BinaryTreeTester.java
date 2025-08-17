package com.cdac.pgdac.BinaryTreeTester;

import com.cdeac.pgdac.BinaryTree.BTImpl;
import com.cdeac.pgdac.BinaryTree.BinaryTree;

public class BinaryTreeTester {
	
	public static void BinaryTreeByHardCode() {
		BinaryTree BTree = new BinaryTree();
		BTree.insert();
		System.out.println("Elements in Tree after In-order Traversal are: ");
		BTree.inOrder();
		System.out.println("\nElements in Tree after Pre-order Traversal are: ");
		BTree.preOrder();
		System.out.println("\nElements in Tree after Post-order Traversal are: ");
		BTree.postOrder();
	}
	
	public static void BinaryTreeByInsertion() {
		BTImpl Btree = new BTree();
		Btree.insert();
		System.out.println("Elements in Tree after In-order Traversal are: ");
		Btree.inOrder();
		System.out.println("\nElements in Tree after Pre-order Traversal are: ");
		Btree.preOrder();
		System.out.println("\nElements in Tree after Post-order Traversal are: ");
		Btree.postOrder();
		
		Btree.CountNodes();
		Btree.CountLeafNodes();
		Btree.CountNodesWithValue(7);
		Btree.CountNodesWithValue(3);
	}
	
	public static void main(String[] args) {
		
		BinaryTreeByInsertion();
	}

}
