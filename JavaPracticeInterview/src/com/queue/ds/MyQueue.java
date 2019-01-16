package com.queue.ds;

public class MyQueue
{
private int queueArray[];
int front=0;
int rear=-1;
int currentSize=0;
private int capacity;

public MyQueue(int size)
{
	this.capacity= size;
	queueArray= new int[this.capacity];
}

public boolean isQueueEmpty()
{
	if(currentSize==0)
	{
		
		return true;
		
	}
	return false;
}

public boolean isQueueFull()
{
	if(currentSize==capacity)
	{
		
		return true;
		
	}
	return false;
}
public void enqueue(int element)
{
	if(isQueueFull())
	{
		System.out.println("Queue is full and cannot be added");
	}
	else
	{
		rear++;
		if(rear==capacity-1)
		{
			rear=0;
		}
		queueArray[rear]=element;
		currentSize++;
		System.out.println("Element "+element +"is pushed to Queue");
	}
}
public void dequeue()
{
	if(isQueueEmpty())
	{
		System.out.println("no element to return");
	}
	else
	{
		front++;
		if(front==capacity-1) 
		{
			System.out.println("pop operation done! removed :"+ queueArray[front-1]);
			front=0;
		}
		else
		{
			System.out.println("pop operation done:"+ queueArray[front-1]);
		}
		currentSize=-1;
	}
}

}
