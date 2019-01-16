package com.practice.interview;

import java.util.Scanner;

public class StringReverseRecursively {

	public static void main(String[] args) {
		System.out.println("Enter a string to reverse");
		Scanner sc= new Scanner(System.in);
		String s= sc.nextLine();
		String res= reverse(s);
		System.out.println(res);
		sc.close();
	}
	public static String reverse(String str)
	{
		String res="";
		if(str.length()==1)
		{
			return str;
		}
		else
		{
			res= res+ str.charAt(str.length()-1)+
					reverse(str.substring(0, str.length()-1));
		}
		return res;
	}

}
