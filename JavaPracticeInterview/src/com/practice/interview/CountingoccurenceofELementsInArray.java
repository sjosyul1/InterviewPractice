package com.practice.interview;

import java.util.HashMap;
import java.util.Scanner;

public class CountingoccurenceofELementsInArray {

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of an array");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		int arr[]= new int[length];
		System.out.println("Enter the elements in array");
		for (int i = 0; i < arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		HashMap<Integer, Integer> res= new HashMap<>();
		res=occurence(arr);
		res.forEach((key,value)->System.out.println(key+" "+value));;

	}
	public static HashMap<Integer,Integer> occurence(int arr[])
	{
		HashMap<Integer, Integer> hm= new HashMap<>();
		for(int a: arr)
		{
			if(hm.containsKey(a))
			{
				hm.put(a, 1+hm.get(a));
			}
			else
			{
				hm.put(a,1);
			}
		}
		return hm;
	}

}
