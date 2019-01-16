package com.sorting.interview;
import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		System.out.println("enter the length of the array to be sorted");
		Scanner sc = new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter the elements of array");
		int arr[]= new int[length];
		
		for(int i=0; i<arr.length; i++)
		{
			arr[i]= sc.nextInt();
		}
		sc.close();
		sort(arr);
	}
	public static void sort(int arr[])
	{
		int temp;
		for(int i=0;i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[i]> arr[j])
				{
					temp= arr[i];
					arr[i]=arr[j];
					arr[j]= temp;
				}
			}
		}
		for(int i=0; i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	}

}
