package com.cdac.Tree;

public interface Tree {
	
	public void insert(int element);
	public void inorder();
	public void preorder();
	public void postorder();
	public void insertIntoArray(int[] arr);
}
