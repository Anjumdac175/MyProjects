package com.cdac.pgdac.BinaryTreeTester;

import java.util.Scanner;

import com.cdeac.pgdac.BinaryTree.BTImpl;
import com.cdeac.pgdac.BinaryTree.BTNode;

public class BTree implements BTImpl{

	BTNode root;
	Scanner sc = new Scanner(System.in);
	
	private BTNode buildTree(String position) {
		System.out.println("Enter Data for " + position +" node or ('n' for skip): ");
		String element = sc.next();
		
		if(element.equalsIgnoreCase("n")) {
			return null;
		}
		
		BTNode node = new BTNode(Integer.parseInt(element));
		node.left = buildTree("Left Child for " + node.data);
		node.right = buildTree("Right Child for " + node.data);
		
		return node;
	}
	
	
	@Override
	public void insert() {
		System.out.println("Build Your Binart Tree: ");
		root = buildTree("Root");
		
	}

	//	inorder TRaversal => Left -> Root -> Right
	@Override
	public void inOrder() {
		Inorder(this.root);

	}

	private void Inorder(BTNode root) {
		
		if(root == null) {
			return;
		}

		if(root.left != null) {
			Inorder(root.left);
		}
		
		System.out.print(root.data+" ");
		
		if(root.right != null) {
			Inorder(root.right);
		}
	}

	// PreOrder => Root -> Left -> Right
	@Override
	public void preOrder() {
		PreOrder(this.root);
		
	}

	private void PreOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		System.out.print(root.data + " ");
		
		if(root.left != null) {
			PreOrder(root.left);
		}
		
		if(root.right != null) {
			PreOrder(root.right);

		}
	}

	// PostOrder => Left -> Right -> Root
	@Override
	public void postOrder() {
		PostOrder(this.root);
		
	}

	private void PostOrder(BTNode root) {
		
		if(root == null) {
			return;
		}
		
		if(root.left != null) {
			PostOrder(root.left);
		}
		
		if(root.right != null) {
			PostOrder(root.right);

		}
		
		System.out.print(root.data + " ");
	}
	
	public int CountNodes(BTNode root) {

		if(root == null) {
			return 0;
		}

		return 1 + CountNodes(root.left) + CountNodes(root.right);
	}


	@Override
	public void CountNodes() {
		int count = CountNodes(root);
		System.out.println("\nNo of Leaf Nodes in tree are: " + count);
		
	}


	@Override
	public void CountLeafNodes() {
		int count = countLeafNodes(root);
		System.out.println("\nNo of Leaf Nodes in tree are: " + count);
	}


	private int countLeafNodes(BTNode root) {
		if(root == null) {
			return 0;
		}
		if(root.left == null && root.right == null) {
			return 1;
		}
		return countLeafNodes(root.left) + countLeafNodes(root.right); 
		
	}


	@Override
	public void CountNodesWithValue(int value) {
		int count = countNodesWithVlaue(root,value);
		System.out.println("\nOccurent of : " + value + " is: " + count);
	}
	
	private int countNodesWithVlaue(BTNode root, int element) {
		if(root == null) {
			return 0;
		}
		int count = 0;
		if(root.data == element) {
			count = 1;
		}
		return count + countNodesWithVlaue(root.left,element) + countNodesWithVlaue(root.right,element); 
	}
}
