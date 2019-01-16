package com.practice.interview;

import java.util.Scanner;

public class DecimalToHexaDecimal {

	public static void main(String[] args) 
	{
		System.out.println("enter a decimal number to be converted");
		Scanner sc= new Scanner(System.in);
		int inp= sc.nextInt();
		sc.close();
		String res= HexaDecimal(inp);
		System.out.println("hexa decimal value for the input is:"+ res);

	}
	public static String HexaDecimal(int inp)
	{
		int rem=0;
		String res="";
		char hexaDecimals[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(inp>0)
		{
			rem= inp % 16;
			res= hexaDecimals[rem]+ res;
			inp= inp / 16;
		}
		
		return res;
	}
}
