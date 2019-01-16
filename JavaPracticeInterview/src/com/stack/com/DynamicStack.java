package com.stack.com;

public class DynamicStack
{
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public DynamicStack(int size)
	{
		this.stackSize=size;
		this.stackArr= new int[stackSize];
		this.top=-1;
	}
	
	public long peek()
	{
		return stackArr[top];
	}
	public boolean isStackEmpty()
	{
		return (top==-1);
	}
	public boolean isStackFull()
	{
		return (top==stackSize-1);
	}
	
	public void push(int element)
	{
		if(this.isStackFull())
		{
			System.out.println("Stack is full and i cannot add");
		}
		System.out.println("adding element: "+element);
		this.stackArr[++top]=element;
		
	}
	public int pop()
	{
		if(this.isStackEmpty())
		{
			System.out.println("Stack is empty and i cannot add for now");
		}
		int entry= this.stackArr[top--];
		System.out.println("element popped is "+ entry);
		return entry;
	}
	
	private void increaseStackCapacity()
	{
		int[] newStack= new int[this.stackSize*2];
		for(int i=0; i<stackSize;i++)
		{
			newStack[i]= this.stackArr[i];
		}
		this.stackArr= newStack;
		this.stackSize= this.stackSize*2;
		
	}
	
	

}
