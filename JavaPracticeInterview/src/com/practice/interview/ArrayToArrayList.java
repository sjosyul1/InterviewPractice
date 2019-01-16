package com.practice.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ArrayToArrayList {

	public static void main(String[] args) {
		System.out.println("Enter the array length");
		Scanner sc= new Scanner(System.in);
		
		int length= sc.nextInt();
		
		System.out.println("enter the elements of array");
		String array[]= new String[length];
		for(int i=0; i<array.length;i++)
		{
			array[i]=sc.next();
		}
		ArrayList<String> res= new ArrayList<>();
		res= toArrayLi(array);
		for(String s: res)
			System.out.print(s+" ");

	}
	public static ArrayList<String> toArrayLi(String arr[])
	{
		
	        ArrayList<String> list = new ArrayList<String>();
	        
	        ArrayList<String> list1= (ArrayList<String>) Arrays.asList(arr);
	         
	        Collections.addAll(list, arr);
	        System.out.println(list1);
	         
	       // System.out.println(list);
	        return list;
	}

}
