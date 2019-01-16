package com.practice.interview;

import java.util.Scanner;

public class SumOfAllDigits {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc= new Scanner(System.in);
		long num= sc.nextLong();
		long res= sum(num);
		System.out.println("sum is:"+res);
		sc.close();
	}
public static long sum(long num)
{
	long res=0;
	if(num>=0 && num<=9)
	{
		return num;
	}
	long rem=0;
	while(num>0)
	{
		rem= num%10;
		res= res+rem;
		num=num/10;
		
	}
	return res;
}
}
