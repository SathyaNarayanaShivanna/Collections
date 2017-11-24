package com.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class HashSetBook {

	public static void main(String[] args) {
		
		HashSet<String> set=new HashSet<String>();  
	
		//LinkedHashSet<String> set=new LinkedHashSet<String>();  
		  set.add("Sathya");
		  set.add("Ravi");  
		  set.add("Vijay");  
		  set.add("Ravi");  
		  set.add("Ajay");  
		  set.add(null);
		  //Traversing elements  
		  Iterator<String> itr=set.iterator();  
		  while(itr.hasNext()){  
		   System.out.println(itr.next());  

	}

}
}