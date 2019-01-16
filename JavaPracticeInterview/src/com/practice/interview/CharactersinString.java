package com.practice.interview;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class CharactersinString {

	public static void main(String[] args) {
		System.out.println("Enter the string");
		Scanner sc= new Scanner(System.in);
		String inp= sc.nextLine();
		sc.close();
		print(inp);
	}
public static void print(String inp)
{
	HashMap<Character, Integer> count= new HashMap<>();
	char ch[]= inp.toLowerCase().toCharArray();
	 for(char b: ch)
	 {
		 if(count.containsKey(b))
		 {
			 count.put(b, count.get(b)+1);
		 }
		 else
		 {
			 count.put(b, 1);
		 }
	 }
	 count.forEach((key, value) -> System.out.println(key + ":" + value));
	 
}
}
