package com.sorting.interview;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) 
	{
		System.out.println("enter the length of the array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter the array elements to be sorted");
		int arr[]= new int[length];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		int res[]= new int[arr.length];
		res= Selection(arr);
		for(int i=0; i<res.length;i++)
		{
			System.out.print(res[i]+" ");
		}
		
	}
	public static int[] Selection(int inp[])
	{
		if(inp.length==1)
		{
			return inp;
		}
		
		for(int i=0; i<inp.length;i++)
		{
			for(int j=i+1;j<inp.length;j++)
			{
				if(inp[i]<inp[j])
				{
					continue;
				}
				else
				{
					int temp= inp[i];
					inp[i]= inp[j];
					inp[j]=temp;
				}
			}
			
		}
		return inp;
	}
	

}
