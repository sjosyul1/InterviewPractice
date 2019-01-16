package com.practice.interview;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class MostReapeatdWordInTextFile {

	public static void main(String[] args) throws IOException {
		
		System.out.println("Enter the path name of the file");
		Scanner sc= new Scanner(System.in);
		String path=sc.nextLine();
		sc.close();
		HashMap<String, Integer> res= new HashMap<>();
		res=Count(path); 
		
		//Set itr= res.entrySet();
	
	}
	public static HashMap<String,Integer> Count(String path) throws IOException
	{
		HashMap<String, Integer> hm= new HashMap<>();
		//ArrayList<String> al= new ArrayList<>();
		
		
		BufferedReader br= null;
		try
		{
			br= new BufferedReader(new FileReader(path));
			String currentLine= br.readLine();
			while(currentLine!= null)
			{
		//	al.add(currentLine);	
			String str[]= currentLine.toLowerCase().split(" ");
			for(String a: str)
				if(hm.containsKey(a))
				{
					hm.put(a, hm.get(a)+1);
				}
				else
				{
					hm.put(a, 1);
				}
			currentLine= br.readLine();
			}
			
			hm.forEach((key,value)->System.out.println(key+"--"+value));
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally
		{
			br.close();
		}
		return hm;
	}

}
