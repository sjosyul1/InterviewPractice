package com.practice.interview;

import java.util.Scanner;
import java.util.*;

public class CharactersPercentage {

	public static void main(String[] args) {
		System.out.println("Enter a String");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		percentage(inp);
		sc.close();

	}
	public static void percentage(String inp)
	{
		ArrayList<Character> uppercase= new ArrayList<>();
		ArrayList<Character> lowercase= new ArrayList<>();
		ArrayList<Character> digits= new ArrayList<>();
		ArrayList<Character> othercharacter= new ArrayList<>();
		
		
		
		char ch[]= inp.toCharArray();
		
		
		for(char c: ch)
		{
			if(Character.isDigit(c))
			{
				digits.add(c);
			}
			else if(Character.isUpperCase(c))
			{
				uppercase.add(c);
			}
			else if(Character.isLowerCase(c))
			{
				lowercase.add(c);
			}
			else{
				othercharacter.add(c);
			}
		}
		Double uc=percentage(uppercase,inp);
		Double lc=percentage(lowercase,inp);
		Double d= percentage(digits,inp);
		Double oc= percentage(othercharacter,inp);
		System.out.println("percentage of uppercase is: "+ uc);
		System.out.println("percentage of lowercase is: "+ lc);
		System.out.println("percentage of digits is: "+d);
		System.out.println("percentage of othercharacter is: "+oc);
		
	}
	public static Double percentage(ArrayList<Character> ch,String inp)
	{
		double length=(double)(inp.length());
		
		Double percentage= (double) ((ch.size()/length)*100);
		return percentage;
	}

}
