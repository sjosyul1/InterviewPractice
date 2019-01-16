package com.practice.interview;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		System.out.println("Enter the year");
		Scanner sc= new Scanner(System.in);
		Double year= sc.nextDouble();
		System.out.println("Answer is "+ isLeapYear(year));
		sc.close();
	}
	public static boolean isLeapYear(Double year)
	{
		if(year %4 == 0)
		{
			if(year% 100== 0 )
			{
				if(year% 400==0 )
				{
				return true;
			}}
			return true;
		}
		return false;
		
	}

}
