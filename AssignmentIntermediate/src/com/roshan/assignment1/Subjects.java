package com.roshan.assignment1;

public class Subjects {

	private int physics;
	private int chemistry;
	private int maths;
	
	public Subjects(int phy, int chem, int maths) {
		this.chemistry= chem;
		this.maths = maths;
		this.physics= phy;
	}
	
	public void totalAndAverage(){
		System.out.println(chemistry + physics + maths);
		System.out.println((chemistry + physics + maths)/3);
		
	}
	
	
	
}
