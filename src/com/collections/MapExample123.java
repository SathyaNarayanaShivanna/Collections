package com.collections;

import java.util.HashMap;
import java.util.Map;

 class Demo {    
int id;    
String name,author,publisher;    
int quantity;    
public Demo(int id, String name, String author, String publisher, int quantity) {    
    this.id = id;    
    this.name = name;    
    this.author = author;    
    this.publisher = publisher;    
    this.quantity = quantity;    
}    
}    
public class MapExample123 {

	public static void main(String[] args) {
	Map<Integer,Demo>m=new HashMap<Integer,Demo>();
	
	Demo b1=new Demo(101,"Let us C","Yashwant Kanetkar","BPB",8);    
	Demo b2=new Demo(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
	Demo b3=new Demo(103,"Operating System","Galvin","Wiley",6);  
	m.put(1, b1);
	m.put(2, b2);
	m.put(3, b3);
		
	for(Map.Entry<Integer,Demo> entry:m.entrySet())
	{
		
		int key=entry.getKey();
		Demo b=entry.getValue();
		
		System.out.println(key+"Details:");
		
		System.out.println(b.id+""+b.name+""+b.publisher+""+b.author+""+b.quantity);
	}

	}

}
