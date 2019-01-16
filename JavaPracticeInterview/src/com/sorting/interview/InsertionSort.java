package com.sorting.interview;

import java.util.Scanner;

public class InsertionSort {

	public static void main(String[] args) {
	System.out.println("enter the array length");
	Scanner sc = new Scanner(System.in);
	int length= sc.nextInt();
	
	System.out.println("enter the array values");
	int arr[]= new int[length];
	for(int i=0;i< arr.length; i++)
	{
		arr[i]=sc.nextInt();
	}
	sc.close();
Insertion(arr);
	}
	public static void Insertion(int arr[])
	{
		for(int i=1; i<arr.length;i++)
		{
			int key= arr[i];
			int j=i-1;
			while((j> -1) &&(arr[j]>key))
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
			print(arr);
		}
	}
	public static void print(int []arr)
	{
		for(int i=0; i<arr.length;i++)
			System.out.print(arr[i]+" ");
		
		System.out.println(" ");
	}


}
