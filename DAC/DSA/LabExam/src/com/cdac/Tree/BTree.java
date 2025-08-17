package com.cdac.Tree;

import java.util.LinkedList;
import java.util.Queue;

public class BTree implements Tree {
	
	private BTNode root;

	@Override
	public void insert(int element) {
		root = insert(root, element);
		
	}

	private BTNode insert(BTNode root, int element) {
		if(root == null) {
			return new BTNode(element);
		}
		
		Queue<BTNode> queue = new LinkedList<BTNode>();
		queue.add(root);
		
		while(!queue.isEmpty()) {
			BTNode cur = queue.poll();
			
			if(cur.left == null) {
				cur.left =new BTNode(element);
				break;
			}else {
				queue.add(cur.left);
			}
				
			if(cur.right == null) {
				cur.right =new BTNode(element);
				break;
			}else {
				queue.add(cur.right);
			}
			
		}
		
		return root;
	}

	@Override
	public void inorder() {
		inorder(root);
		
	}

	private void inorder(BTNode root) {
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

	private void preorder(BTNode root) {
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

	private void postorder(BTNode root) {
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
