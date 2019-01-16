package com.practice.interview;

import java.util.Scanner;

public class FirstNonrepaetedChar {
	
	//check the logic-

	public static void main(String[] args) {
		System.out.println("enter a string");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		char res= nonrepeated(inp);
		System.out.println("First non repeated char:"+res);
		sc.close();
	}
	public static char nonrepeated(String inp)
	{
		char temp[]= new char[inp.length()];
		if(inp.length()==1)
		{
		return inp.charAt(0);	
		}
		char c[]=inp.toLowerCase().toCharArray();
		for(int i=0; i<c.length; i++)
		{
			for (int j=i+1; j<c.length; j++)
			{
				if(c[i]==c[j])
				{
					temp[i]=c[i];
				}
				return c[i];
				
			}
		}
		return ' ';
		
	}

}
