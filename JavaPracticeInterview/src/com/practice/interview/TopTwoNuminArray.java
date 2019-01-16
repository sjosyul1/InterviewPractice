package com.practice.interview;

import java.util.Scanner;

public class TopTwoNuminArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the size of the array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter array elements");
		int inp[]= new int[length];
		for(int i=0;i<inp.length;i++)
		{
			inp[i]=sc.nextInt();
		}
		sc.close();
		maxNumbers(inp);

	}
	public static void maxNumbers(int inp[])
	{
		int max=0;
		int secMax=0;
		for(int a: inp)
		{
			if(max<a)
			{
				secMax=max;
				max=a;
				
			}
			else if(secMax<a)
			{
				secMax=a;
			}
			
		}
		System.out.println("max number is :"+ max);
		System.out.println("Second max number is :"+ secMax);
	}

}
