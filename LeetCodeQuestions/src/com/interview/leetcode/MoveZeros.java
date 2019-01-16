package com.interview.leetcode;

import java.util.Scanner;

public class MoveZeros {

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
		move(inp);
	}
	public static void move(int[] inp)
	{
		int count=0;
		for(int i=0; i<inp.length;i++)
		{
			if(inp[i]!=0)
			{
				inp[count]= inp[i];
				count++;
			}
			
			
		}
		while(count<inp.length)
		{
			inp[count]=0;
			count++;
		}
		System.out.println("elements after pushing zeros");
		for(int i: inp)
		{
			System.out.print(i+" ");
		}
		
	}

}
