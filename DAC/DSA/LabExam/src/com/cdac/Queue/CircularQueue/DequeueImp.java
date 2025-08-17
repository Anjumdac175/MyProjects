package com.cdac.Queue.CircularQueue;

public interface DequeueImp {

	public boolean isEmpty();
	public boolean isFull();
	public void insertFront(int element);
	public void insertRear(int element);
	public void deleteFront();
	public void deleteRear();
	public void display();
}
