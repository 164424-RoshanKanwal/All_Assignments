package com.lambda3;
import java8.Person;

import java.util.ArrayList;
import java.util.function.Supplier;

public class LambdaQ3 {

	public static void main(String[] args) {
		
		
		Supplier<String> supply = () -> {
			ArrayList<Person> list = new ArrayList<Person>();
			list.add(new Person("Roshan", "Kanwal", 23));
			list.add(new Person("Roshanq", "Kanwalq", 231));
			list.add(new Person("Roshanw", "Kanwalw", 232));
			list.add(new Person("Roshane", "Kanwale", 233));
			return list.get(0) +"\n" + list.get(1) +"\n" + list.get(2)+ "\n" + list.get(3);
		};
				
			System.out.println(supply.get());	
		
	}
	
	
	
}
