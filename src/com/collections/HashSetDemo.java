package com.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> hs=new HashSet<String>();
		//adding element
		System.out.println("-----------------Adding Elements--------------------------");
		hs.add("Ramesh");
		hs.add("Suresh");
		hs.add("Josheph");
		hs.add("Ramesh");
		hs.add("Harish");
		System.out.println(hs);
		//null
		System.out.println("-----------------Null Elements--------------------------");
		hs.add(null);
		System.out.println(hs);
		//Remove an Element
		System.out.println("-----------------Remove an Elements--------------------------");
				hs.remove("Ramesh");
		
		//Check if a Set is empty
				System.out.println("-----------------Elements is Empty--------------------------");
		if(hs.isEmpty())
				{
					System.out.println("The set is Empty");
				}
		else
				{
					System.out.println("The set is not Empty");
				}
			
		//Remove All
		System.out.println("----------------Remove all the elements-----------------------");
//		hs.clear();
//		 System.out.println(hs);
		if (hs.isEmpty()) {
		    System.out.println("The set is empty");
		}
		//Searching for an element in a Set
		System.out.println("----------------Searching for an element in a Set-----------------------");
		if(hs.contains("Ramesh"))
		{
			System.out.println("Ramesh Found");
		}
		
		
		System.out.println("Ramesh is Removed from set");
		
		//Iterating over elements in a Set
		System.out.println("----------------Iterating over elements in a Set-----------------------");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
		{
		System.out.println(itr.next());
		}
		
		HashSet<Integer>hs1=new HashSet<Integer>();
		//adding operation
		hs1.add(10);
		hs1.add(20);
		hs1.add(30);
		hs1.add(40);
		hs1.add(50);
		
		HashSet<Integer>hs3=new HashSet<Integer>();
		
		hs3.add(20);
		hs3.add(40);
		//Union operation
		System.out.println("----------------Union operation----------------------");
		hs1.addAll(hs3);
		
		System.out.println(hs1);
		//Performing Bulk Operations between two Sets
		System.out.println("----------------Performing Bulk Operations between two Sets-----------------------");
		if (hs1.containsAll(hs3)) {
		    System.out.println("s2 is a subset of s1");
		}
		System.out.println("------------------------------");
		
		
		
	}

//	private static Object iterator() {
//		// TODO Auto-generated method stub
//		return null;
//	}

}
