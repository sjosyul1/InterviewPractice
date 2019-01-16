package com.practice.interview;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) 
	{
		System.out.println("Enter a decimal number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		
		sc.close();
		String res= Binary(num);
		System.out.println("Binary value of your input is "+ res);
	}
public static String Binary(int inp)
{
	String bin="";
	if(inp==0 || inp==1)
	{
		bin=bin +inp;
		return bin;
	}
	int rem=0;
	
	while(inp>0)
	{
		rem= inp%2;
		bin= rem+ bin;
		inp=inp/2;
	}
	System.out.println(bin);
	return bin;
}
}
