package com.cdac.SortedCircularDoublyLList;

public class SortedDoublyCircularLList {

	private DNode head,tail;
	public SortedDoublyCircularLList() {
		head = tail = null;
	}

	// Insert in sorted order
	public void insert(int element) {
		DNode newNode = new DNode(element);

		if (head == null) {
			head = tail = newNode;
			head.next = head.prev = head;
			return;
		}

		// Insert before head
		if (element <= head.data) {
			newNode.next = head;
			newNode.prev = tail;
			head.prev = newNode;
			tail.next = newNode;
			head = newNode;
			return;
		}

		DNode current = head;

		while (current.next != head && current.next.data < element) {
			current = current.next;
		}

		newNode.next = current.next;
		newNode.prev = current;
		current.next.prev = newNode;
		current.next = newNode;

		if (current == tail) {
			tail = newNode;
		}

		tail.next = head;
		head.prev = tail;
	}

	// Delete first occurrence of element
	public void delete(int element) {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		// Only one node
		if (head == tail && head.data == element) {
			head = tail = null;
			return;
		}

		// Delete head
		if (head.data == element) {
			head = head.next;
			head.prev = tail;
			tail.next = head;
			return;
		}

		DNode current = head.next;

		while (current != head) {
			if (current.data == element) {
				current.prev.next = current.next;
				current.next.prev = current.prev;

				if (current == tail) {
					tail = current.prev;
				}

				tail.next = head;
				head.prev = tail;
				return;
			}
			current = current.next;
		}

		System.out.println("Element not found");
	}

	// Delete all occurrences of element
	public void deleteAll(int element) {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		boolean found = false;

		while (head != null && head.data == element) {
			found = true;
			if (head == tail) {
				head = tail = null;
				return;
			} else {
				head = head.next;
				head.prev = tail;
				tail.next = head;
			}
		}

		DNode current = head;

		while (current != null && current.next != head) {
			if (current.next.data == element) {
				found = true;
				DNode toDelete = current.next;
				current.next = toDelete.next;
				toDelete.next.prev = current;

				if (toDelete == tail) {
					tail = current;
				}

				tail.next = head;
				head.prev = tail;
			} else {
				current = current.next;
			}
		}

		if (!found) {
			System.out.println("Element not found");
		}
	}

	// Display list
	public void display() {
		if (head == null) {
			System.out.println("List is Empty");
			return;
		}

		DNode current = head;
		do {
			System.out.print(current.data + " <-> ");
			current = current.next;
		} while (current != head);
		System.out.println("(head)");
	}
}

