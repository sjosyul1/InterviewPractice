package com.interview.leetcode;

import java.util.Scanner;

public class SingleNumber {

	public static void main(String[] args)
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the array size");
		int size= sc.nextInt();
		System.out.println("enter array elements");
		int inp[]= new int[size];
		for(int i=0;i<size; i++)
		{
		 inp[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("element is :"+ singleNum(inp));
		

	}
	public static int singleNum(int[] inp)
	{
		int x=0;
		for(int y:inp)
		{
			x=x^y;
		}
		return x;
	}

}
