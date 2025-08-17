package com.cdac.Queue.QueueUsingArray;

public interface Queue {

	public void enqueue(int element);
	public int dequeue();
	public boolean isEmpty();
	public boolean isFull();
	public void display();
}
