package com.practice.interview;

import java.util.Scanner;
import java.util.*;

public class LeaderArray {

	public static void main(String[] args) {
		System.out.println("enter the length of the array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter the array elements");
		int inp[]= new int[length];
		for(int i=0;i<inp.length;i++)
		{
			inp[i]=sc.nextInt();
		}
		Stack <Integer> res= Leader(inp);
		for(int c: res)
		{
			System.out.print(c+" ");
		}
	}
	public static Stack<Integer> Leader(int inp[])
	{
		Stack<Integer> s= new Stack<>();
		
		for(int i=0;i<inp.length;i++)
		{
			for(int j=i+1;j<inp.length;j++)
			{
				if(inp[i]>inp[j])
				{
					if(j==inp.length)
						{
						s.push(inp[i]);
						}
					
					continue; 
				}
			}	
		}
		
		return s;
	}
}
