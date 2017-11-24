package com.collections;

import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		
		SortedMap<String, String> mapDomains = new TreeMap<>();
		 
		mapDomains.put(".com", "International");
		mapDomains.put(".us", "United States");
		mapDomains.put(".uk", "United Kingdom");
		mapDomains.put(".jp", "Japan");
		mapDomains.put(".au", "Australia");
		 
		System.out.println(mapDomains);

	}

}
