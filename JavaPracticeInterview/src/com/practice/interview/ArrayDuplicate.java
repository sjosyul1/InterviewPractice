package com.practice.interview;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args)
	{
		int inp[]= new int[10];
		System.out.println("Enter array of elements of int datatype");
		Scanner sc= new Scanner(System.in);
		sc.close();
		for(int i=0; i<inp.length; i++)
		{
			inp[i]=sc.nextInt();
		}
		

	}
	public static HashSet<Integer> removeDuplicates(int inp[])
	{
		
		HashSet<Integer> hs= new HashSet<>(inp.length);
		for(int k : inp)
		{
			hs.add(k);
		}
			return hs;
		
	}

}
