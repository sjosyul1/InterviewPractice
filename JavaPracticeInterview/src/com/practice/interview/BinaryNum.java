package com.practice.interview;

import java.util.Scanner;

public class BinaryNum {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		long inp=sc.nextLong();
		System.out.println(Binary(inp));
		sc.close();
	}
	public static boolean Binary(long num)
	{
		boolean isBinary=true;
	String s=Long.toString(num);
	char c[]= s.toCharArray();
	for(char b: c)
	{
		
		System.out.println(b);
		if(b>1 )
		{
			isBinary=false;
		}
		
	}
	System.out.println(isBinary);
		return isBinary;
	}

}
