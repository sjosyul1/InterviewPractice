package com.patters.java;

public class SingletonPattern 
{
	private static SingletonPattern sp;
	
	static
	{
		sp= new SingletonPattern();
	}
	private SingletonPattern()
	{
		
	}
	public static SingletonPattern getInstance()
	{
		return sp;
	}
	public void testMe()
	{
		System.out.println("success");
	}
	public static void main(String[] args)
	{
		SingletonPattern sp= getInstance();
		sp.testMe();
		
	

	}

}
