package com.practice.interview;

import java.util.Scanner;
import java.util.*;

public class RomanEquilent {

	public static void main(String[] args) {
		System.out.println("enter a string ");
		Scanner sc= new Scanner(System.in);
		int inp= sc.nextInt();
		sc.close();
		String res= Roman(inp);
		System.out.println(res);

	}
	public static String Roman(int num)
	{
		String[] romanSymbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
		int[] decimals = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		
		HashMap<Integer,String> hm= new HashMap<>();
		for(int i=0; i< romanSymbols.length;i++)
		{
			hm.put( decimals[i],romanSymbols[i]);
		}
		String res="";
		
		if(num>=1 && num <=3999)
		{
			for(int i=0; i<13; i++)
			{
				 while(num >= decimals[i])
	                {
	                    num = num - decimals[i];
	                     
	                    res = res + romanSymbols[i];
	                }
			}
		}
		
		
		return res;
	}

}
