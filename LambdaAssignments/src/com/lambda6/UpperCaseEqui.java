package com.lambda6;

import java.util.ArrayList;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class UpperCaseEqui {

	public static void main(String[] args) {
		
		
		Stream.of("Roshan", "Sneha", "Chaya", "Urvi", "Parthi").map(s-> s.toUpperCase()).forEach(System.out::println);

		
		
		ArrayList<String> list = new ArrayList<>();
		list.add("hello");
		list.add("hello there!");
		list.add("Can you help?");
		list.add("hell");
		list.add("bye");
		
		//Iterator itr = list.iterator();
		
		UnaryOperator<ArrayList<String>> makeUpperCase = (s)-> {	//unary operator return the same type of 
																	//data type which was taken as an input 
			int listlen = s.size();
			ArrayList<String> list1 = new ArrayList<String>() ;
			for(int index=0; index< listlen; index++){
				list1.add(list.get(index).toUpperCase());
			}
			return list1;
			
		};										//continued...	//taking input as arraylist and so the output is also a arraylist 
				
		replaceAll(list, makeUpperCase);
		
	}
	
	public static void replaceAll(ArrayList<String> list, UnaryOperator<ArrayList<String>> makeUpperCase){
		
		System.out.println(makeUpperCase.apply(list));
		
	}
	
}
