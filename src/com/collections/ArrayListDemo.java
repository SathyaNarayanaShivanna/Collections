package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

interface Ifruit
{
	
}
class Orange implements Ifruit
{
	
}
 class Student
{
	int rollno;
	String name;
	int age;
	
	Student(int rollno,String name,int age)
	{
		this.rollno=rollno;
		this.name=name;
		this.age=age;
	}
}
public class ArrayListDemo {

	public static void main(String[] args) {
		
		Student s1=new Student(101,"Sono",23);
		Student s2=new Student(101,"Sathya",33);
		Student s3=new Student(101,"Shankar",35);
		
		ArrayList<Student>al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator ir1=al.iterator();
		while(ir1.hasNext())
		{
			Student st=(Student)ir1.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
		}
		
		System.out.println("-----------==================----------------");
		ArrayList<String> lst=new ArrayList<String>();
		
		lst.add("Ravi");
		
		lst.add("Vijay");
		lst.add("Ravi");
		lst.add("Ajay");
		ArrayList<String> al2=new ArrayList<String>();
		al2.add("Soma");
		al2.add("Hanuma");
		lst.addAll(al2);
		  System.out.println("iterating the elements after retaining the elements of al2...");  
//		System.out.print(lst.size());
		System.out.println(lst.contains("Vijay"));
		System.out.println(lst.contains(new Orange()));
		
//		if(lst.get(2)instanceof String)
//		{
//			System.out.println(lst.get(2).length());
//		}
		
		
		System.out.println("-----------------------");
		for(int i=0;i<lst.size();i++)
		{
			System.out.println(lst.get(i));
		}
		
		System.out.println("============================");
		for(Object o:lst)
		{
			System.out.println(o);
		}
		System.out.println("-==========--------==========");
		Iterator itr=lst.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
		
		
		ListIterator litr=lst.listIterator();
		
		
		while(litr.hasNext())
		{
			System.out.println(litr.next());
		}
		System.out.println("------------Going  Reverse-------------");
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
				
//		lst.add(10);
//		lst.add(true);
//		lst.add("Hello");
//		lst.add(new String("Bangalore"));
//		lst.add(10);
//		Orange o1=new Orange();
//		lst.add(o1);

	}

	

}
