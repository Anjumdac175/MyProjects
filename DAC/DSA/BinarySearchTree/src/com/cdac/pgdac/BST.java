package com.cdac.pgdac;

public class BST{
	
	private BSTNode root;
	
// call from outside the class for elements
	public void insertFromArray(int[] arr) {
		for(int elements: arr) {
			insert(elements);
		}
		
	}
	
	// to insert elements and by using data wrapping using Data Wrapper Function
	public void insert(int value) {
		
		root = insertNode(root,value);
	}
	
	private BSTNode insertNode(BSTNode root, int value) {
		if(root == null) {
			return new BSTNode(value);
		}
		
		if(value < root.data) {
				root.left = insertNode(root.left, value);
			}else {
				root.right = insertNode(root.right, value);
			}
			

		return root;
	}

	// For the Traversal of BST and using inOrder traversal BST will print in a sorted Array
	public void inOrder() {
		inOrder(this.root);
	}

	private void inOrder(BSTNode root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			inOrder(root.left);
		}
		
		System.out.print(root.data + " ");
		
		if(root.right != null) {
			inOrder(root.right);
		}
	}

	
	//Height of a BST............
	public void HeightofBST() {
		int height = HeightofBST(root);
		System.out.println(height);
	}

	private int HeightofBST(BSTNode root) {

		if(root == null) {
			return -1;
		}
		
		int leftHeight = 1 + HeightofBST(root.left);
		int rightHeight = 1 + HeightofBST(root.right);
		
		int heightofBST = Max(leftHeight,rightHeight);
		return heightofBST;
	}

	private int Max(int leftHeight, int rightHeight) {
		if(leftHeight > rightHeight)
			return leftHeight;
		return rightHeight;
	}
	
	
	// Find Smallest of All Node in BST...
	public void findSmallest() {
		int smallest = findSmallest(root);
		System.out.println(smallest);
	}

	private int findSmallest(BSTNode root) {
		
		if(root == null) {
			return 0;
		}
		BSTNode cur = root;
		while(cur.left != null) {
			cur = cur.left;
		}
		
		return cur.data;
	}
	
	// Find Largest of All Node in BST...
	public void findLargest() {
		int large = findLargest(root);
		System.out.println(large);
	}

	private int findLargest(BSTNode root) {
		
		if(root == null) {
			return 0;
		}
		BSTNode cur = root;
		while(cur.right != null) {
			cur = cur.right;
		}
		
		return cur.data;
	}
	
}
