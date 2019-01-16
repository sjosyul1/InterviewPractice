package com.practice.interview;

import java.util.Scanner;

public class CommonElementsInArray {

	public static void main(String[] args)
	{
		System.out.println("Enter length of array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("Enter elements of array");
		int arr1[]= new int[length];
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=sc.nextInt();
		}
		System.out.println("enter elements of array2");
		int arr2[]= new int[length];
		for(int i=0;i<arr2.length;i++)
		{
			arr2[i]=sc.nextInt();
		}
		sc.close();
		
print(arr1,arr2);
	}
	public static void print(int arr1[], int arr2[])
	{
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
				}
			}
		}
	}
}
