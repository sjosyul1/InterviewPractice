package com.practice.interview;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SortingTextFile {

	public static void main(String[] args) {
		System.out.println("enter the path for text file");
		Scanner sc= new Scanner(System.in);
		String path=sc.nextLine();
		sc.close();
		sortFile(path);
	}
	public static void sortFile(String path)
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		ArrayList<String> line= new ArrayList<>();
		try
		{
			br= new BufferedReader(new FileReader(path));
			String cline= br.readLine();
			while(cline!=null)
			{
				line.add(cline);
				//System.out.println(line);
				cline= br.readLine();
			}
			Collections.sort(line);
			
			bw= new BufferedWriter(new FileWriter("E:\\out.txt"));
			for(String lines: line )
			{
				bw.write(lines);
				System.out.println(lines);
				bw.newLine();
			}
			
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		} catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
