package com.practice.interview;

import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) 
	{
		System.out.println("Enter the array");
		int inp[] = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<inp.length;i++)
		{
			inp[i]= sc.nextInt();
		}
		System.out.println("Enter the number to search");
		int num= sc.nextInt();
		int res=  binarySearch(num, inp);
		System.out.println("The number is:"+ res);
		
		sc.close();
	}
	public static int binarySearch(int num, int inp[])
	{
		int low=0;
		int high=inp.length-1;
		int mid= (low+high)/2;
		while(high>=low)
		{
			if(inp[mid]==num)
			{
				return mid;
			}
			else if(inp[mid]<num)
			{
				low=mid+1;
			}
			else if(inp[mid]>num)
			{
				high=mid-1;
			}
		}
		return -1;
	}

}
