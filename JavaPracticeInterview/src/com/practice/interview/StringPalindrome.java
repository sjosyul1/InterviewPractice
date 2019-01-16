package com.practice.interview;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		boolean res= isPalindrome(inp);
		System.out.println("answer is :"+ res);
		
	}
	public static boolean isPalindrome(String s)
	{
		String rev="";
		int length= s.length();
		for(int i=length-1; i>0; i--)
		{
			rev=rev+ s.charAt(i);
		}
		if(rev==s)
		{
			return true;
		}
		return false;
	}

}
