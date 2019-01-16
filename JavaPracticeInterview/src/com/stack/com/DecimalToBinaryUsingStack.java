package com.stack.com;

import java.util.*;

public class DecimalToBinaryUsingStack {

	public static void main(String[] args) 
	{
		System.out.println("enter the number to be converted to binary");
		Scanner sc= new Scanner(System.in);
		int inp= sc.nextInt();
		sc.close();
		System.out.println(Convert(inp));

	}
	public static String Convert(int inp)
	{
		
		Stack<Integer> s = new Stack();
		StringBuilder sb= new StringBuilder();
		if(inp==0)
		{
			sb.append(0);
		}
		else
		{
			while(inp!=0)
			{
				s.push(inp%2);
				inp=inp/2;
			}
		}
		while(!s.isEmpty())
		{
			sb.append(s.pop());
		}
		return sb.toString();
		
		
		
	}

}
