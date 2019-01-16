package com.practice.interview;

import java.util.Arrays;
import java.util.*;
import java.util.Scanner;


public class Anagram {

	public static void main(String[] args) {
		System.out.println("Enter the  first string");
		Scanner sc= new Scanner(System.in);
		String inp= sc.next();
		System.out.println("enter the second string");
		String Anag= sc.next();
		boolean res=stringAnagram(inp,Anag);
		System.out.println("status is:"+res);
		sc.close();
		
		ArrayList<List<Object>> list = new ArrayList();
		
		
	}
	public static boolean stringAnagram(String inp, String anag)
	{
		if(inp.length()!= anag.length())
		{
			return false;
		}
		String s1= inp.replaceAll("\\s ", "");
		String s2= anag.replaceAll("\\s", "");
	char c1[]= 	s1.toLowerCase().toCharArray();
	char c2[]= s2.toLowerCase().toCharArray();
	Arrays.sort(c1);
	Arrays.sort(c2);
	if(c1.equals(c2))
	{
		return true;
	}
	return false;
				
	}

}
