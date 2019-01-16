package com.stack.com;

public class MyStack
{
	private int stackSize;
	private int[] stackArr;
	private int top;
	
	public MyStack(int size)
	{
		this.stackSize=size;
		this.stackArr= new int[stackSize];
		this.top=-1;
	}
	
	public boolean isStackFull()
	{
		return (top==stackSize-1);
	}
	
	public boolean isStackEmpty()
	{
		return (top==-1);
	}
	
	public int peek()
	{
        return stackArr[top];
    }
	
	public void push(int entry)
	{
		if(this.isStackFull())
		{
			System.out.println("stack is already full");
		}
		System.out.println("adding the element:"+ entry);
		this.stackArr[++top]=entry;
	}
	public int pop()
	{
		if(this.isStackEmpty())
		{
			System.out.println("stack is empty dude");
		}
		int element= this.stackArr[top--];
		System.out.println("returning top element "+ element);
		return element;
	}

}
