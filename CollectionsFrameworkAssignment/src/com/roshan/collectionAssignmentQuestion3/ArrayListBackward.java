package com.roshan.collectionAssignmentQuestion3;

import java.util.ArrayList;

import java.util.ListIterator;

public class ArrayListBackward {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		list.add("roshan");
		list.add("kanwal");
		list.add("hello");
		list.add("ross");
		list.add("yoyo");
		list.add("heLLo");
		
		
		ListIterator<String> li=list.listIterator();

		while(li.hasNext()){
			li.next();
		}
		
		while(li.hasPrevious()){
			
			System.out.println(li.previous());
			
		}
		
	}
}
