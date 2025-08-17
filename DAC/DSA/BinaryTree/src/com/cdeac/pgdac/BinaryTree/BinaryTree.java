package com.cdeac.pgdac.BinaryTree;

public class BinaryTree implements BTImpl {

	private BTNode root;
	
	@Override
	public void insert() {
		
		//root node
		root = new BTNode(8);
		
		//left child node
		root.left = new BTNode(3);
		root.left.left = new BTNode(2);
		root.left.right = new BTNode(1);
		root.left.left.right = new BTNode(7);
		
		//right child node
		root.right = new BTNode(4);
		root.right.left = new BTNode(6);
		root.right.right = new BTNode(5);
		root.right.right.left = new BTNode(9);
		
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


	@Override
	public void CountNodes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CountLeafNodes() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void CountNodesWithValue(int value) {
		// TODO Auto-generated method stub
		
	}
}
