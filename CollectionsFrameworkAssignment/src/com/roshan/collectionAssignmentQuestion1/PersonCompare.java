package com.roshan.collectionAssignmentQuestion1;

import java.util.TreeSet;

public class PersonCompare implements Comparable{
	
	
	
	public static void main(String[] args){
		
		
	TreeSet<Person> t = new TreeSet<Person>(new myComparator());
	Person p1 = new Person(1.73, 80, "Roshan");
	Person p2 = new Person(1.72, 68, "Olive");
	Person p3 = new Person(1.74, 78, "Rakesh");
	Person p4 = new Person(1.73, 81, "Yo");
	Person p5 = new Person(1.73, 68, "Ore");
	Person p6 = new Person(1.74, 78, "Ray");
	
	t.add(p1);
	t.add(p2);
	t.add(p3);
	t.add(p4);
	t.add(p5);
	t.add(p6);
	
	for(Person p : t){
		System.out.println("Name: "+ p.name +" Height: "+ p.height +" Weight: "+ p.weight);
	}
	
	}

	@Override
	public int compareTo(Object arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
