package com.cdac.levelOrder;

import java.util.LinkedList;
import java.util.Queue;

import com.cdac.BSTNode;

public class LevelOrder {
	private BSTNode root;

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

	public void LevelOrderTraverse() {
		LevelOrderTraverse(root);
	}

	private void LevelOrderTraverse(BSTNode root) {
		
		if(root == null) {
			return;
		}
		
		Queue<BSTNode> levelOrder = new LinkedList<>();
		
		levelOrder.add(root);
		
		while(!levelOrder.isEmpty()) {
			
			BSTNode cur = levelOrder.remove();
			System.out.print(cur.data + " ");
			
			if(cur.left != null) {
				levelOrder.add(cur.left);
			}
			if(cur.right != null)
				levelOrder.add(cur.right);
		}
	
	}
}
