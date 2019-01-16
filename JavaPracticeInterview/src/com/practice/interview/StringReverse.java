package com.practice.interview;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse");
		Scanner sc = new Scanner(System.in);
		String inp= sc.nextLine();
		sc.close();
		String res1= reverse1(inp);
		String res2= reverse2(inp);
		System.out.println("result of 1:"+ res1);
		System.out.println("result of 1:"+ res2);

	}
	public static String reverse1(String s)
	{
		StringBuilder sb= new StringBuilder();
		return	sb.append(s).reverse().toString();
		
	}
	public static String reverse2(String s)
	{
		String rev="";
		for(int i = s.length()-1; i>=0; i--)
		{
			rev= rev+ s.charAt(i);
		}
		return rev;
	}

}
