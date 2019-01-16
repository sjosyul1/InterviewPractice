package com.practice.interview;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class DuplicateNumberInList {

	public static void main(String[] args) 
	{
		System.out.println("Enter the minimum value ");
		Scanner sc= new Scanner(System.in);
		int min= sc.nextInt();
		
		System.out.println("Enter the max value");
		int max= sc.nextInt();
		
		ArrayList<Integer> al= new ArrayList<>();
		for(int i=min; i<=max;i++)
		{
			System.out.println(i);
			al.add(i);
		}
		
			al.add(max-1);
		
		System.out.println(" ");
		for(int a:al)
			System.out.println(a);
		int i= duplicate(al);
		System.out.println("Duplicate element is:"+i);
	}
	public static int duplicate(ArrayList<Integer> al)
	{
		int dup=-1;
		Set<Integer> s= new HashSet<>();
		for(int a: al)
		{
		if(s.add(a)== false)
			{
				dup=a;
			}
		}
	return dup;
	}
}
