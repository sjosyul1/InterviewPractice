package com.practice.interview;
import java.util.*;

public class SwappingStrings {

	public static void main(String[] args)
	{
		System.out.println("Enter string 1");
		Scanner sc= new Scanner(System.in);
		String str1= sc.next();
		
		System.out.println("enter string 2");
		String str2= sc.next();
	
		swap(str1,str2);
		

	}
	public static void swap(String str1, String str2)
	{
		
	 str1= str1+str2;
	 str2= str1.substring(0,(str1.length()-str2.length()));
	 str1= str1.substring(str2.length());
	 System.out.println("String one now " + str1);
	 System.out.println("String 2 now " + str2);
	
	}

}
