package com.cdac.Day1.Add2Number;

public class AddTwoNumber {

	public Node addTwoNumbers(Node l1, Node l2) {
		
		Node head = new Node(0);
		Node cur = head;
		int carry = 0;
		while(l1 != null || l2 != null || carry != 0)
		{
			int val1 = l1.data;
			int val2 = l2.data;
			
			int sum = val1 + val2 + carry;
			carry = sum/10;
			int digit = sum%10;
			
			cur.next = new Node(digit);
			cur = cur.next;
			
			if(l1 != null) {
				l1 = l1.next;
			}
			if(l2 != null) {
				l2 = l2.next;
			}
		}
		
		
		
		return l2;
		
	}

}
