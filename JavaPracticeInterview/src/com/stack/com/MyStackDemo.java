package com.stack.com;

public class MyStackDemo {

	public static void main(String[] args) 
	{
		MyStack ms= new MyStack(5);
		
		ms.push(5);
		ms.push(-6);
		ms.push(8);
		ms.push(88);
		ms.push(0);
		
		ms.pop();
		ms.pop();
		
		// *************************
		DynamicStack DS= new DynamicStack(10);
		for(int i=1;i<10;i++)
		{
			DS.push(i);
		}
		for(int i=1;i<10;i++)
		{
			DS.pop();
		}
		
		

	}

}
