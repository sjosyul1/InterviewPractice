package com.practice.interview;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) 
	{
		System.out.println("Enter a number to be factorized");
		Scanner sc= new Scanner(System.in);
		int inp= sc.nextInt();
		int res1= factorialNR(inp);
		int res2= factorialR(inp);
		System.out.println("result of NR:"+res1 + " result if r:"+res2);
		// TODO Auto-generated method stub
		sc.close();
	}
	public static int factorialR(int num)
	{
		if(num==0)
		{
			return 1;
		}
		return num*factorialR(num-1);//tail recursion
	}
	public static int factorialNR(int num)
	{
		int res=1;
		if(num==0)
		{
			return 1;
		}
		while (num!=0)
		{
			res= res*num;
			num--;
		}
		return res;
	}
	

}
