package com.cdac.Tree;

public class BSTree implements Tree{
	
	private BSTNode root;

	@Override
	public void insert(int element) {
		root = insert(root,element);
		
	}

	private BSTNode insert(BSTNode root, int element) {
		if(root == null) {
			return new BSTNode(element);
		}
		
		if(element < root.data) {
			root.left = insert(root.left,element);
		}else {
			root.right = insert(root.right, element);
		}
		return root;
	}

	@Override
	public void inorder() {
		inorder(root);
		
	}

	private void inorder(BSTNode root) {
		if(root == null) {
			//System.out.println("List is Empty");
			return;
		}
		inorder(root.left);
		System.out.print(root.data +" ");
		inorder(root.right);
		
	}

	@Override
	public void preorder() {
		preorder(root);
		
	}

	private void preorder(BSTNode root) {
		if(root == null) {
			//System.out.println("List is Empty");
			return;
		}
		System.out.print(root.data +" ");
		preorder(root.left);
		preorder(root.right);
		
	}

	@Override
	public void postorder() {
		postorder(root);
		
	}

	private void postorder(BSTNode root) {
		if(root == null) {
			//System.out.println("List is Empty");
			return;
		}
		
		postorder(root.left);
		postorder(root.right);
		System.out.print(root.data +" ");
		
	}

	@Override
	public void insertIntoArray(int[] arr) {
		for(int val : arr) {
			insert(val);
		}
	}
}
