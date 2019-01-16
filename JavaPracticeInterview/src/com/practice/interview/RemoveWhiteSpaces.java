package com.practice.interview;
import java.util.Iterator;
import java.util.Scanner;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println("enter a string with white spaces");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		sc.close();
		String res1= removewhite(inp);
		String res2= removewhite(inp);
		System.out.println(res1);
		System.out.println(res2);
}
	public static String removeWhiteSpace(String s)
	{
		return s.replaceAll("\\s", "");
		
	}
	public static String removewhite(String s)
	{
		StringBuilder sb= new StringBuilder();
		char c[]= s.toCharArray();
		for(char b: c)
		{
			if(b!=' '&& b!='\t')
			{
				sb.append(b);
			}
		}
		return sb.toString();
	
	}

}
