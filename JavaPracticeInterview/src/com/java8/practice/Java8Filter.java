package com.java8.practice;

import java.util.*;
import java.util.stream.Collectors;

public class Java8Filter {

	public static void main(String[] args)
	{
		
		Map<Integer, String> map= new HashMap<>();
		map.put(1, "linode.com");
	    map.put(2, "heroku.com");
	    
	    Map<Integer, String> mp= map.entrySet().stream()
	    		.filter(x->x.getKey()==2)
	    		.collect(Collectors.toMap(x->x.getKey(), x->x.getValue()));
	    
	    System.out.println(mp);
	    
	    

	}

}
