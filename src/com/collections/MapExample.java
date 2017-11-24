package com.collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
	public static void main(String[] args) {
		
		Map<Integer,String>map=new HashMap<Integer,String>();
		
		map.put(101, "Amit");
		map.put(102, "Vijay");
		map.put(103, "Rahul");
		
		for(Map.Entry m:map.entrySet())
		{
			
			System.out.println(m.getKey()+""+m.getValue());
		}
		

	}

}
