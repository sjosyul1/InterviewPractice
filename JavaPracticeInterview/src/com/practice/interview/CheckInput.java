package com.practice.interview;
import java.util.Scanner;
public class CheckInput {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter a String");
		String str=sc.next();
		boolean res= Check(str);
		System.out.println(res);
		sc.close();
		
		
	}
	public static boolean Check(String str)
	{
		try
		{
			Integer.parseInt(str);
		}
		catch(NumberFormatException e)
		{
			return false;
		}
		return true;
		
	}
	

}
