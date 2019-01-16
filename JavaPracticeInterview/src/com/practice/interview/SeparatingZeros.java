package com.practice.interview;

import java.util.Scanner;
import java.util.Stack;

import java.util.*;

public class SeparatingZeros {

	public static void main(String[] args) 
	{
		System.out.println("enter array length");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("enter array values");
		int inp[]= new int[length];
		for(int i=0; i<inp.length; i++)
		{
			inp[i]=sc.nextInt();
		}
		sc.close();
		Stack<Integer> out= Seperate(inp);
		System.out.println(" ");
		for(int k: out)
			System.out.print(k+" ");

	}
	public static Stack<Integer> Seperate(int inp[])
	{
		Stack<Integer> res= new Stack<>();
		LinkedList<Integer> li = new LinkedList<Integer>();
		for(int a: inp)
		{
			if(a==0)
			{
				res.push(a);
			}
			else
			{
				li.add(a);
			}
			
		}
		
		for(int c: li)
		{
			res.push(c);
		}
		return res;
	}

}
