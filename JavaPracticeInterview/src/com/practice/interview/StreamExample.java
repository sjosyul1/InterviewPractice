package com.practice.interview;
import java.util.*;
import java.util.stream.Collectors;

public class StreamExample {

	public static void main(String[] args)
	{
		Map<Integer, String> HOSTING= new HashMap<>();
		
		 	HOSTING.put(1, "linode.com");
	        HOSTING.put(2, "heroku.com");
	        HOSTING.put(3, "digitalocean.com");
	        HOSTING.put(4, "aws.amazon.com");
	        
	        String result="";
	        for(Map.Entry<Integer, String> entry: HOSTING.entrySet())
	        {
	        	if(entry.getValue().equals("aws.amazon.com"))
	        	{
	        		result= entry.getValue();
	        	}
	        }
	        System.out.println("The filtered value is: "+ result);
		// now using java 8 features
	         HOSTING.entrySet().stream().filter(x->x.getValue().equals("aws.amazon.com")).forEach((x-> System.out.println(x.getValue())));
	         
	         result=HOSTING.entrySet().stream().filter(x->{
	        	 if(x.getValue()!="aws.amazon.com")
	        	 {
	        		 return true;
	        	 }
	        	 return false;
	         }).map(map-> map.getValue()).collect(Collectors.joining(","));
	         System.out.println("The final result"+ result);
	         
	         Map<Integer, String> collect= HOSTING.entrySet().stream().filter(map->map.getKey()<=3)
	        		 .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
	         System.out.println(collect);
	         
	}

}
