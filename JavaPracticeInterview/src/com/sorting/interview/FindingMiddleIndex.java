package com.sorting.interview;

import java.util.Scanner;

public class FindingMiddleIndex {

	public static void main(String[] args) {
		System.out.println("Enter array length");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		int arr[]= new int[length];
		System.out.println("enter the values in arrays");
		for(int i=0; i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
	}
	public static int Middle(int arr[])
	{
		int sum=0;
		int start=0;
		int end= arr.length-1;
		for(int i=0; i< arr.length; i++)
		{
			sum=arr[i];
			
			
		}
		return -1;
	}
	public static int sumPrevious(int arr[])
	{
		int sum=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			sum= sum+ arr[i];
		}
		return sum;
	}
	public static int sumFront(int arr[])
	{
		int sum=0;
		for(int i=0; i>arr.length; i++)
		{
			sum= sum+ arr[i];
		}
		return sum;
	}
}
