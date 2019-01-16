package com.practice.interview;

import java.util.Scanner;

public class StringDuplicate {

	public static void main(String[] args) {
		
		System.out.println("Please enter a string");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		int noOfChar= Duplicates(inp);
		System.out.println("Total chars:"+ noOfChar);
	}
	public static int Duplicates(String inp)
	{
		int count=0;
		for(int i=0; i<inp.length(); i++) {
			for(int j=i+1; j<inp.length(); j++)
			{
				if(inp.charAt(i)== inp.charAt(j))
				{
					count++;
				System.out.println("duplicated characters are "+inp.charAt(i) );
				}
			}
		}
		return count;
	}

}
