package com.cdac.validateBST;

import java.util.Stack;

import com.cdac.BSTNode;

public class vaildateBST {
private BSTNode root;
private Integer parent = null;
	
	// call from outside the class for elements
		public void insertFromArray(int[] arr) {
			for(int elements: arr) {
				insert(elements);
			}
			
		}
		
		// To insert elements and by using data wrapping using Data Wrapper Function
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
			boolean isValidBST = isValidInOrder(this.root);
			if(isValidBST) {
				System.out.println("\nyes");
			}else {
			System.out.println("\nNo");
			}
		}

		private boolean isValidInOrder(BSTNode root) {
			
			if(root == null) {
				return true;
			}
			
			if(!isValidInOrder(root.left)) {
				return false;
				
			}
			
			//System.out.print(root.data + " ");
			if(parent != null && root.data <= parent) {
				return false;
			}
			parent = root.data;
		
			return isValidInOrder(root.right);
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
		
		
		public void InorderBSTree() {

			Stack<BSTNode> nodeStack = new Stack<>();
			BSTNode cur = root;
			
			while(cur != null || !nodeStack.isEmpty()) {
				
				while(cur != null) {
					nodeStack.push(cur);
					cur = cur.left; // left subtree
				}
				
				cur = nodeStack.pop();
				System.out.print(cur.data +" ");
				
				cur = cur.right; // right subtree
			}
		}
		public boolean validateBSTree() {

			Stack<BSTNode> nodeStack = new Stack<>();
			BSTNode cur = root;
			Integer parent = null;
			
			while(cur != null && !nodeStack.isEmpty()) {
				
				while(cur != null) {
					nodeStack.push(cur);
					cur = cur.left; // left subtree
				}
				
				cur = nodeStack.pop();
				if(parent != null && cur.data <= parent) {
					return false;
				}
				
				parent = cur.data; // update parent to current to check list
				
				cur = cur.right; // right subtree
			}
			
			return true;
		}
}
