package com.practice.interview;

import java.util.Scanner;

public class IntegerReverse {

	public static void main(String[] args) 
	{
		System.out.println("enter a number to be reversed");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		int res= reverse(num);
		System.out.println("reversed number is:"+res);
		sc.close();
	}
	public static int reverse(int num)
	{
		if(num<=9 && num>=0)
		{
			return num;
		}
		int rev=0;
		int n=0;
		while(num>0)
		{
			n=num%10;
			rev= rev*10+n;
			num=num/10;
			
		}
		return rev;
	}

}
