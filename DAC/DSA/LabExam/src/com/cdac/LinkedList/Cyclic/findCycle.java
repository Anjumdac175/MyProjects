package com.cdac.LinkedList.Cyclic;

import com.cdac.LinkedList.SNode;

public class findCycle {
	
	private SNode head;
	
	public void insert(int element) {
		SNode newNode = new SNode(element);
		newNode.next = head;
		head = newNode;
	}
	
	public void createCycle(int index) {
		
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		SNode cycleCreate = null;
		SNode cur = head;
		int idxcount = 0;
		
		while(cur != null) {
			
			if(idxcount == index) {
				cycleCreate = cur;
			}
			cur = cur.next;
			idxcount++;
		}
		
		if(cycleCreate != null) {
			SNode LastNode = head;
			
			while(LastNode.next != null) {
				LastNode = LastNode.next;
			}
			LastNode.next = cycleCreate;
		}else {
			System.out.println("Element not found to create a cycle");
		}
	}
	
	public boolean isCycle() {
		
		SNode slow = head;
		SNode fast = head;
		
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
			
			if(slow == fast)
			{
				return true;
			}
		} 
		
		return false;
	}
	
	public void removeCycle() {
		if(head == null) {
			System.out.println("empty");
			return;
		}

		SNode slow = head;
		SNode fast = head;

		boolean found = false;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if(slow == fast)
			{
				found = true;
				break;
			}
		} 

		if(found) {

			SNode prev = null;
			slow = head;

			while(slow != fast) {
				prev = fast;
				slow = slow.next;
				fast = fast.next;
			}

			prev.next = null;
			System.out.println("Cycle Removed");
		}else {
			System.out.println("No cycle is there to Remove");
		}
	}


	public void traverse() {
		if(head == null) {
			System.out.println("List is Empty");
			return;
		}
		
		SNode cur = head;
		while(cur != null) {
			System.out.print(cur.data + " -> ");
			cur = cur.next;
		}
		System.out.print("null");
	}
}
