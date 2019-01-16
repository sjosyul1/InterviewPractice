package com.practice.interview;

import java.util.Scanner;
import java.util.*;

public class MatchingBraces 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter the length of string");
		Scanner sc= new Scanner(System.in);
		int length= sc.nextInt();
		
		System.out.println("Enter the elemets in string array");
		String inp[]= new String[length];
		
		for(int i=0;i<inp.length;i++)
		{
			inp[i]= sc.nextLine();
		}
		String out[]= new String[length];
		out= isMatching(inp);
		System.out.println(" \n");
		for(String s : out)
		{
			System.out.println(s);
		}
		// TODO Auto-generated method stub

	}
	public static String[] isMatching(String inp[])
	{
		String[] res= new String[inp.length];
		Stack<Character> st= new Stack<>();
		for(int i=0; i< res.length;i++)
		{
			int count1=0,  count2=0,count3=0, count4=0, count5=0,count6=0;
			char c[]= inp[i].toCharArray();
			for(int j=0; j<c.length;j++)
			{
				if( c[j]=='{')
				{
					count1++;
					st.push(c[j]);
					
				}
				if( c[j]=='(')
				{
					count2++;
					st.push(c[j]);
					
				}
				if( c[j]=='[')
				{
					count3++;
					st.push(c[j]);
					
				}
			}
			
			
			
			for(int j=0; j<c.length;j++)
			{
				if( c[j]=='}')
				{
					if(!st.isEmpty())
					{
					count4++;
					st.pop();
					}
					
				}
				if( c[j]==')')
				{
					if(!st.isEmpty())
					{
					count5++;
					st.pop();
					}
					
				}
				if( c[j]==']')
				{
					if(!st.isEmpty())
					{
					count6++;
					st.pop();
					}
				}
			}
			
			
			
			/*for(int j=0; j<c.length;j++)
			{
			if( c[j]=='{' || c[j]=='(' || c[j]=='[')	
					{
				//System.out.println(c[j]);
						count1++;
						st.push(c[j]);
						
					}
				
			}
			System.out.println("opening braces are:"+ count1);
			for(int j=0; j<c.length;j++)
			{
			if(c[j]==')' || c[j]=='}' || c[j]==']' )	
					{
						count2++;
						if(!st.isEmpty())
						{
							//System.out.println(st.pop());
						st.pop();
						}
					}
				
			}*/
			System.out.println(" { count is"+ count1);
			System.out.println(" ( count is"+ count2);
			System.out.println(" { count is"+ count3);
			System.out.println(" } count is"+ count4);
			System.out.println(" ) count is"+ count5);
			System.out.println(" ] count is"+ count6);
			//System.out.println("closing braces are:"+ count2);
			if(count1==count4 && count2==count5 && count3==count6  && st.isEmpty() )
			{
				res[i]="YES";
			}
			else
			{
				res[i]="NO";
			}
			
		}
		return res;
	}

}
