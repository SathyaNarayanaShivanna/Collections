package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListSortDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		list.add(10);
		list.add(25);
		list.add(8);
		list.add(15);
		list.add((int)12.5);
		System.out.println(list);
		System.out.println("--------Before Sort");
		Collections.sort(list);
		System.out.println("After Sort");
		System.out.println(list);
		System.out.println("-----------------");
		
		ArrayList<String>liststr=new ArrayList<String>();
		liststr.add("Rajesh");
		liststr.add("SUresh");
		liststr.add("Anup");
		liststr.add("Harish");
		liststr.add("Krish");
		System.out.println(liststr);
		System.out.println("Before Sort");
		Collections.sort(liststr);
		System.out.println("AfterSort");
		System.out.println(liststr);
		
		Collections.shuffle(liststr);
		System.out.println("--After Shuffling----");
		System.out.println(liststr);
		
		
	}

	
}
