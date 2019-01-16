package com.practice.interview;

import java.util.Scanner;

public class Arraycomparision {

	public static void main(String[] args) {
		
		System.out.println("Please enter the array length");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		int a1[]= new int[length];
		int a2[]= new int[length];
		
		System.out.println("enter array 1 values");
		for(int i=0;i<a1.length; i++)
		{
			a1[i]= sc.nextInt();
		}
		System.out.println("enter array 2 values");
		for(int i=0;i<a2.length; i++)
		{
			a2[i]= sc.nextInt();
		}
		sc.close();
		boolean res1=equal1(a1, a2);
		boolean res2=equal2(a1, a2);
		System.out.println(res1);
		System.out.println(res2);
	}
		public static boolean equal1(int a1[], int a2[])
		{
			return a1.equals(a2);
		}
		public static boolean equal2(int a1[], int a2[])
		{
			if(a1.length!=a2.length)
			{
				return false;
			}
			for(int i=0; i<a1.length;i++)
			{
				if(a1[i]==a2[i])
				{
					return true;
				}
			}
			return false;
			
		}
}
