package com.roshan.assignment1;

public class IncomeTax {
	
	
	private String name;
	private int salary;
	
	public String getName() {
		return name;
	}
	
	
	public IncomeTax(String name, int salary) {
		this.salary = salary;
		this.name = name;
	}
	
	
	public void tax(){  
		int taxableAmt = salary - 180000;
		if (taxableAmt <= 0){
			System.out.println("You are waived of taxation.");
		}
		else if (taxableAmt > 0 && taxableAmt <= 300000){
			System.out.println("The income tax of " + name + " is " + 0.1*salary);
		}
		else if (taxableAmt > 300000 && taxableAmt <= 500000){
			System.out.println("The income tax of " + name + " is " + (30000 + 0.2*(taxableAmt-300000)));
		}
		else if (taxableAmt > 500000){
			System.out.println("The income tax of " + name + " is " + (70000 + 0.3*(taxableAmt-500000)));
		}
	}
}
