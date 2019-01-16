package com.practice.interview;

import java.util.Scanner;

public class fibonocci {

	public static void main(String[] args) 
	{
		System.out.println("enter the number");
		Scanner sc= new Scanner(System.in);
		int fib= sc.nextInt();
		int result1=fibonacciR(fib);
		int result2= fibonacciNR(fib);
		System.out.println("number is :"+result1+" other function:"+ result2 );

	}
public static int fibonacciR(int number)
{
	if(number==0 || number== 1)
	{
		return 1;
	}
	return fibonacciR(number-1)+ fibonacciR(number-2);
}
public static int fibonacciNR(int number)
{
	if(number==0 || number ==1)
	{
		return 1;
	}
	int fib1=1, fib2= 1, fibonacci=1;
	for(int i=3; i<=number; i++)
	{
		fibonacci= fib1+ fib2;
		fib1= fib2;
		fib2= fibonacci;
	}
	return fibonacci;
}
}
