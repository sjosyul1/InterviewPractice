package com.practice.interview;

import java.util.Scanner;

public class DoubleMatrixCreation {

	public static void main(String[] args) {
		System.out.println("enter the row length");
		Scanner sc= new Scanner(System.in);
		int row= sc.nextInt();
		System.out.println("enter the column length");
		int col= sc.nextInt();
		
		int [][] matrix= new int[row][col];
		System.out.println("enter double matrix values");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				matrix[i][j]=sc.nextInt();
			}
		}
		sc.close();
		System.out.println(" double matrix values are");
		for(int i=0; i<row; i++)
		{
			for(int j=0; j<col; j++)
			{
				System.out.println(matrix[i][j]);
			}
	}
	
	}

}
