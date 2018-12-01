package com.streamAssignments;

import java.util.ArrayList;
import java.util.List;

public class FruitsList {

	private static List<Fruits> fruitsList = new ArrayList<Fruits>();
	
	static{
		fruitsList.add(new Fruits("Apple", 112, 30, "red"));
		fruitsList.add(new Fruits("Orange", 102, 20, "orange"));
		fruitsList.add(new Fruits("Banana", 72, 10, "yellow"));
		fruitsList.add(new Fruits("Chickoo", 52, 30, "brown"));
		fruitsList.add(new Fruits("Pomegranate", 82, 40, "red"));
	}
	
	public List<Fruits> getFruits(){
		return fruitsList;
	}
}
