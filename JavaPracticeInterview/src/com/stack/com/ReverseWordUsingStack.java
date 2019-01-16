package com.stack.com;

import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class ReverseWordUsingStack {

	public static void main(String[] args)
	{
		System.out.println("enter the word to reverse");
		Scanner sc= new Scanner(System.in);
		
		String inp= sc.nextLine();
		sc.close();
		System.out.println(reverse(inp));
		

	}
	public static String reverse(String inp)
	{
		Stack<Character> s= new Stack<>();
		StringBuilder sb= new StringBuilder();
		char ch[]= inp.toCharArray();
		for(char c: ch)
		{
			s.push(c);
		}
		while(!s.isEmpty())
		{
			sb.append(s.pop());
		}
		return sb.toString();
	}

}
