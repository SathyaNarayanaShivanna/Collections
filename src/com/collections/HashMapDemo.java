package com.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class HashMapDemo {

	public static void main(String[] args) {
		System.out.println("----HashMap------------");	
		Map<Integer,String>mapHttpErrors=new HashMap<>();
		mapHttpErrors.put(200, "OK");
		mapHttpErrors.put(303, "See Other");
		mapHttpErrors.put(404, "Not Found");
		mapHttpErrors.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors);
	System.out.println("----LinkedHashMap------------");	
		Map<Integer,String>mapHttpErrors1=new LinkedHashMap<>();
		mapHttpErrors1.put(200, "OK");
		mapHttpErrors1.put(303, "See Other");
		mapHttpErrors1.put(404, "Not Found");
		mapHttpErrors1.put(500, "Internal Server Error");
		
		System.out.println(mapHttpErrors1);
		
		System.out.println("----TreeMap------------");
		Map<String, String> mapLang = new TreeMap<>();
		 
		mapLang.put(".c", "C");
		mapLang.put(".java", "Java");
		mapLang.put(".pl", "Perl");
		mapLang.put(".cs", "C#");
		mapLang.put(".php", "PHP");
		mapLang.put(".cpp", "C++");
		mapLang.put(".xml", "XML");
		 
		System.out.println(mapLang);
		
		Map<Integer, String> mapHttpErrors2 = new HashMap<>();
		mapHttpErrors2.put(400, "Bad Request");
		mapHttpErrors2.put(304, "Not Modified");
		mapHttpErrors2.put(200, "OK");
		mapHttpErrors2.put(301, "Moved Permanently");
		mapHttpErrors2.put(500, "Internal Server Error");
		
		String status301=mapHttpErrors2.get(301);
		System.out.println("301"+status301);
		
		if(mapHttpErrors2.containsKey(200))
			
			System.out.println("Http status 200");
		{
			
		}
		if(mapHttpErrors2.containsValue("Moved Permanently"))
		{
			System.out.println("Found status Moved Permanently");
		}
		
		String removedValue=mapHttpErrors.remove(500);
				
			if(removedValue!=null)
			{
			System.out.println("Removed Value:"+removedValue);
			}
			
			System.out.println("Map before: " + mapHttpErrors2);
			 
			mapHttpErrors2.replace(304, "No Changes");
			 
			System.out.println("Map after: " + mapHttpErrors2);
			
			
			int size = mapHttpErrors2.size();
				System.out.println(	"Number of HTTP status code:" +size);
				
				
				Map<String, String> mapCountryCodes = new HashMap<>();
				 
				mapCountryCodes.put("1", "USA");
				mapCountryCodes.put("44", "United Kingdom");
				mapCountryCodes.put("33", "France");
				mapCountryCodes.put("81", "Japan");
				 
				Set<String> setCodes = mapCountryCodes.keySet();
				Iterator<String> iterator = setCodes.iterator();
				 
				while (iterator.hasNext()) {
				    String code = iterator.next();
				    String country = mapCountryCodes.get(code);
				 
				    System.out.println(code + " => " + country);
				}
				System.out.println("--------Enhancedfor====-----Key,Value");
				Set<Map.Entry<String,String>>entries=mapCountryCodes.entrySet();
				for(Map.Entry<String, String>entry:entries)
				{
					String code=entry.getKey();
					String Country=entry.getValue();
					System.out.println(code+"==>"+Country);
				}
				System.out.println("--------foreach====-----Key,Value");
				mapCountryCodes.forEach(
					    (code, country) -> System.out.println(code + " => " + country));
				
				
//				mapHttpErrors2.clear();
//				System.out.println("Is Map Empty"+mapHttpErrors2.isEmpty());
				System.out.println("Elements using in PutAll");
				Map<Integer, String> countryCodesEU = new HashMap<>();
				 
				countryCodesEU.put(44, "United Kingdom");
				countryCodesEU.put(33, "France");
				countryCodesEU.put(49, "Germany");
				 
				Map<Integer, String> countryCodesWorld = new HashMap<>();
				 
				countryCodesWorld.put(1, "United States");
				countryCodesWorld.put(86, "China");
				countryCodesWorld.put(82, "South Korea");
				 
				 
				System.out.println("Before: " + countryCodesWorld);
				 
				countryCodesWorld.putAll(countryCodesEU);
				 
				System.out.println("After: " + countryCodesWorld);
	}

}
