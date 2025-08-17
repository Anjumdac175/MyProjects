package com.cdac.SortedCircularDoublyLList;

public class DNode {

	int data;
	DNode next, prev;

	public DNode(int data) {
		this.data = data;
		this.next = this.prev = null;
	}
}
