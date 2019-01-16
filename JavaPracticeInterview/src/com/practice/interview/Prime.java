package com.practice.interview;

import java.util.Scanner;

public class Prime {

	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num=sc.nextInt();
		boolean result= prime(num);
		System.out.println("Answer is :"+ result);
		
	}
	public static boolean prime(int num)
	{
		if(num==2 || num ==3)
		{
			return true;
		}
		if(num % 2== 0)
		{
		return false;
		}
		if( num <0)
		{
			return false;
		}
		return true;
	}

}
