package com.practice.interview;

import java.util.Scanner;

public class ReverseandCheckPalindrome {

	public static void main(String[] args) {
		System.out.println("enter a number");
		Scanner sc= new Scanner(System.in);
		long num= sc.nextLong();
		//System.out.println("reverse number is:"+ reverse(num));
		while(!palindrome(num))
		{
			num= num+ reverse(num);
		}
		System.out.println("palindrom number is "+ num);
		sc.close();
	}
	public static long reverse(long inp)
	{
		if(inp>=0 && inp<=9)
		{
			return inp;
		}
		long rem=0;
		long res=0;
		while(inp>0)
		{
			rem= inp%10;
			res= res*10+ rem;
			inp= inp / 10;
		}
		return res;
	}
	public static boolean palindrome(long num)
	{
		if(reverse(num)== num)
		{
			return true;
		}
		return false;
	}

}
