package com.cdac.pgdac.DeletionOfBST;

import com.cdac.pgdac.BSTNode;

public class DeletionInBST {
	
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
		
		public void Delete(int element) {
			root = deleteNodesofBST(root,element);
			System.out.println("\nElement deleted... ");
		}

		private BSTNode deleteNodesofBST(BSTNode root, int element) {

			if(root == null) {
				return null;
			}
			BSTNode cur = root;
			BSTNode parent = null;
			
			while(cur != null) {
				
				if(element == cur.data) {
					break;
				}
				parent = cur;
				if(element < cur.data) {
					cur =  cur.left;
				}else {
					cur = cur.right;
				}
			}
			
			if(cur == null) {
				System.out.println("Element not Found....");
				return root;
			}
			
			// Delete Leaf Node....
			if(cur.left == null && cur.right == null) {
				
				// only One Node
				if(cur == root) {
					return null;
				}
				
				if(parent.left == cur) {
					parent.left = null;
				}else {
					parent.right = null;
				}
				
				return root;
			}
			
			//Delete Node having both children using inorder predecessor
		/*	if(cur.left != null && cur.right != null) {
				BSTNode inOderPredecessorParent = cur;
				BSTNode inOderPredecessor = cur.left;

				while(inOderPredecessor.right != null) {
					inOderPredecessorParent = inOderPredecessor;
					inOderPredecessor = inOderPredecessor.right;
				}

				cur.data = inOderPredecessor.data;

				if(inOderPredecessorParent == cur) {
					inOderPredecessorParent.left = inOderPredecessor.left;	
				}else {
					inOderPredecessorParent.right = inOderPredecessor.left;
				}
				return root;
			}*/
			
			
			//Delete Node having both children using inorder predecessor
			if(cur.left != null && cur.right != null) {
				BSTNode inOderSuccessorParent = cur;
				BSTNode inOderSuccessor = cur.right;

				while(inOderSuccessor.left != null) {
					inOderSuccessorParent = inOderSuccessor;
					inOderSuccessor = inOderSuccessor.left;
				}

				cur.data = inOderSuccessor.data;

				if(inOderSuccessorParent == cur) {
					inOderSuccessorParent.right = inOderSuccessor.right;	
				}else {
					inOderSuccessorParent.left = inOderSuccessor.right;
				}
				return root;
			}
			
			// Delete Node having one child either left or child
			BSTNode childOfCur = (cur.left != null) ? cur.left : cur.right;

			// root Node has Only one child
			if(cur == root) {
				return childOfCur;
			}

			if(parent.left == cur) {
				parent.left = childOfCur;
			}else {
				parent.right = childOfCur;
			}

			return root;
		}
}
