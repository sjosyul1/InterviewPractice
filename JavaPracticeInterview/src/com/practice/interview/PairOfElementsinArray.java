package com.practice.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class PairOfElementsinArray {

	public static void main(String[] args) {
		System.out.println("enter the array length");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		System.out.println("enter the number ");
		int num= sc.nextInt();
		System.out.println("enter the array elements");
		int inp[]= new int[length];
		for(int i=0; i<inp.length;i++)
		{
			inp[i]=sc.nextInt();
		}
		sc.close();
		HashMap<Integer,Integer> out= new HashMap<>();
		out= pair(inp,num);
		out.forEach((key,value)-> System.out.println(key+"--"+value));
		Set<Integer> itr= out.keySet();
		System.out.println("total no of pairs "+itr.size());
		

	}
public static HashMap<Integer, Integer> pair(int inp[],int num)
{
	HashMap<Integer, Integer> res= new HashMap<>();
	for(int i=0; i<inp.length;i++)
	{
		for(int j=i+1; j<inp.length;j++)
		{
			if(inp[i]+inp[j]==num)
			{
				res.put(inp[i], inp[j]);
			}
		}
	}
	return res;
}
}
