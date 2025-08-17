package com.cdac.InvertBinary;

public class BinaryTree {
	private BTNode root;
	
	public void insert() {
		
		root = new BTNode(2);
		root.left = new BTNode(1);
		root.right = new BTNode(3);
	}
	
	public void preOrder() {
		System.out.println("Original PreOder of Binary Tree:");
		preOrder(root);
		
		Invert(root);
		System.out.println("\nInverted PreOder of Binary Tree:");
		preOrder(root);
	}

	private void preOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.left != null) {
			preOrder(root.left);
		}
		
		if(root.right != null) {
			preOrder(root.right);
		}
	}
	

	private void Invert(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		BTNode temp = root.left;
		root.left = root.right;
		root.right = temp;
		
		Invert(root.left);
		Invert(root.right);
		
	}
}
