package com.interview.leetcode;
import java.util.*;

public class reverseString
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the string you want to reverse");
		String inp= sc.nextLine();
		System.out.println("Reversed String is:"+ Reverse(inp));
		System.out.println("Reversed String is:"+ Reverse1(inp));
		sc.close();
	}
	public static String Reverse(String inp)
	{
		StringBuilder sb= new StringBuilder();
		String out= sb.append(inp).reverse().toString();
		return out;
	}
	public static String Reverse1(String inp)
	{
		char ch[]= inp.toCharArray();
		String res="";
		for(int i=ch.length-1; i>=0;i--)
		{
			res= res+ch[i];
		}
		
		return res;
	}

}
