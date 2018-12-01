package com.stream.assignments.Utils;

public class CheckIfICanAddMyFunctionalInterface {

	int id;
	String name;
	
	
	
	public CheckIfICanAddMyFunctionalInterface(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static void main(String[] args) {
		
		CheckIfICanAddMyFunctionalInterface c1 = new CheckIfICanAddMyFunctionalInterface(10,"Roshan");
		CheckIfICanAddMyFunctionalInterface c2 = new CheckIfICanAddMyFunctionalInterface(11,"Sneha");
		CheckIfICanAddMyFunctionalInterface c3 = new CheckIfICanAddMyFunctionalInterface(12,"Roshaen");
		CheckIfICanAddMyFunctionalInterface c4 = new CheckIfICanAddMyFunctionalInterface(13,"Roshanf");
		
		
		
		
		
	}
	
	public void myMethod(MyInterface my){
		
	}
}
 

@FunctionalInterface
interface MyInterface{
	void myNew();
}