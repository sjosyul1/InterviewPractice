package com.practice.interview;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		System.out.println("Enter the decimal you want to convert");
		Scanner sc= new Scanner(System.in);
		int inp= sc.nextInt();
		sc.close();
		String res= Octal(inp);
		System.out.println("The converted octal is: "+res);
	}
	public static String Octal(int inp)
	{
		int rem=0;
		String res="";
		while(inp>0)
		{
			rem=inp%8;
			res=  rem+ res;
			inp=inp/8;
		}
		return res;
	}
}
