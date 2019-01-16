package com.practice.interview;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a positive number");
		Scanner sc= new Scanner(System.in);
		int	inp= sc.nextInt();
		Perfect(inp);
		sc.close();
	}
	public static void Perfect(int pos)
	{
		int count=0;
		for(int i=1; i<=pos/2;i++)
		{
			if(pos%i==0)
			{
				count=count+1;
			}
		}
			if(count==pos)
			{
				System.out.println("its a perfect number");
			}
			else
			{
				System.out.println("its not a perfect number");
			}
		
	}

}
