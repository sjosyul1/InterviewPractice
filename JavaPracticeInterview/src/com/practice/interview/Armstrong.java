package com.practice.interview;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		int num= sc.nextInt();
		boolean res= isArmstrong(num);
		System.out.println("the answer is :"+res);
		sc.close();
	}
	public static boolean isArmstrong(int num)
	{
		int res= num;
		
		int r=0;
		int c=0;
		while(num>0)
		{
			r= num%10;
			num=num/10;
			c= c+(r*r*r);
			
		}
		System.out.println(c);
		if( res==c)
		{
			return true;
		}
		return false;
		
	}

}
