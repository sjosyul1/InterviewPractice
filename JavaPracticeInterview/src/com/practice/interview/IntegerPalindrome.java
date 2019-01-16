package com.practice.interview;

import java.util.Scanner;

public class IntegerPalindrome {

	public static void main(String[] args) {
		System.out.println("Enter a integer to check for palindrome");
		Scanner sc= new Scanner(System.in);
		int integ= sc.nextInt();
	boolean ans=isPalindromeR(integ);
	System.out.println(ans);
	}
	public static boolean isPalindromeR(int num)
	{
		System.out.println("entered");
		int palindrom= num;
		int reverse=0;
		int rem=0;
		 while(palindrom>0)
		 {
			 //System.out.println("entered");
			 rem= num%10;
			 reverse = reverse*10+ rem;
			 palindrom= palindrom/10;
		 }
		 if(num==reverse)
		 {
			 return true;
		 }
		 return false;
	}

}
