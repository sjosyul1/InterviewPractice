package com.practice.interview;

import java.util.Random;

public class RandonNumbers {

	public static void main(String[] args) {
		Random rd= new Random();
		
		for(int i=0;i<5; i++)
		{
			System.out.print(rd.nextInt()+" ");
		}

	}

}
