package com.practice.interview;

import java.util.Arrays;
import java.util.Scanner;

public class SecondLargestNumber {

	public static void main(String[] args) {
		System.out.println("enter the elements in the array");
		Scanner sc= new Scanner(System.in);
		int a[]= new int[10];
		for(int i=0;i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		sc.close();
		System.out.println("second largest is:"+ secondlargest(a));

	}
	public static int secondlargest(int[] num)
	{
		Arrays.sort(num);
		return num[num.length-2];
	}

}
