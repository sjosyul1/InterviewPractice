package com.practice.interview;

import java.util.Scanner;
import java.util.*;

public class Intersection {

	public static void main(String[] args)
	{
		System.out.println("enter the length of the string arrays");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter the string array values");
		String str1[] = new String [length];
		for(int i=0; i<str1.length; i++)
		{
			str1[i]=sc.next();
		}
		
		System.out.println("enter the string2 array values");
		String str2[] = new String [length];
		for(int i=0; i<str2.length; i++)
		{
			str2[i]=sc.next();
		}
	Set<String> out= new HashSet<>();
	out= Intersection1(str1, str2);
	for(String s: out)
	{
		System.out.println(s);
	}
	
		
	}
	public static Set<String> Intersection1(String str1[], String str2[])
	{
		Set<String> res= new HashSet<>();
		for(int i=0; i<str1.length;i++)
		{
			for(int j=i; i<str2.length;j++)
			{
				if(str1[i].equals(str2[j]))
				{
					res.add(str1[i]);
				}
			}
		}
		return res;
	}

}
