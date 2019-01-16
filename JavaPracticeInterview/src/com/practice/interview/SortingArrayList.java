package com.practice.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SortingArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> al= new ArrayList<>();
		Random rd= new Random();
		for(int i=0; i<10;i++)
		{
			al.add(rd.nextInt());
		}
		System.out.println("before sorting ");
		for(int a: al)
		{
			System.out.print(a+ " ");
		}
		
		//sorting
		Collections.sort(al);
		System.out.println("After sorting");
		System.out.println(" ");
		//for(int a: al)
		//{
			System.out.print(al);
		//}
	}

}
