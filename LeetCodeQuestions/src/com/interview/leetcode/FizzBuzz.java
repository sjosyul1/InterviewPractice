package com.interview.leetcode;

import java.util.*;


public class FizzBuzz {

	public static void main(String[] args)
	{
		List<String> out= new LinkedList<>();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the upper limit of numbers");
		int inp=0;
		inp=sc.nextInt();
		
		System.out.println(inp);
				out= fizzBuzz(inp);
		out.forEach(x->System.out.println(x));
		//sc.close();
	}
	public static List<String> fizzBuzz(int inp)
	{
		List<String> out= new LinkedList<>();
		System.out.println("entered");
		for(int i=1; i<=inp; i++)
		{
			if(i%3==0 && i%5==0 )
			{
				out.add("FizzBuzz");
			}
			else if(i%3==0 )
			{
				out.add("Fizz");
			}
			else if(i%5==0  )
			{
				out.add("Buzz");
			}
			else
			{
				out.add(Integer.toString(i));
			}
		}
		
		return out;
	}

}
