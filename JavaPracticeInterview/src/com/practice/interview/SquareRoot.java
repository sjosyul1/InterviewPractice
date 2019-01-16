package com.practice.interview;

import java.util.Scanner;

public class SquareRoot {

	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		System.out.println("Square root of number :"+ SquareRo(num));
		// TODO Auto-generated method stub

	}
	public static double SquareRo(int n)
	{
		if(n==0)
		{
			return 0;
		}
		double res=0;
		res= Math.sqrt(n);
		return res;
	}

}
