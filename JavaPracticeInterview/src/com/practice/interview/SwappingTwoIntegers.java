package com.practice.interview;

import java.util.Scanner;

public class SwappingTwoIntegers {

	public static void main(String[] args) {
		System.out.println("Enter number 1");
		Scanner sc= new Scanner(System.in);
		int num1= sc.nextInt();
		
		System.out.println("Enter number 2");
		int num2=sc.nextInt();
		sc.close();
		swap(num1,num2);
	}
	public static void swap(int num1,int num2)
	{
		num1= num1+ num2;
		num2= num1-num2;
		num1= num1-num2;
		System.out.println(num1);
		System.out.println(num2);
	}

}
