package com.roshan.myPackage;

public class Cidco {
	
	int rm = 9;
	int tt = 99;
static int ground = 500;
	public static void main(String[] args) {
		Cidco cidco1 = new Cidco();
		Cidco cidco2 = new Cidco();
		Cidco cidco3 = new Cidco();
		Cidco cidco4 = new Cidco();
		cidco4.rm = 54;
		cidco4.tt =45;
		
		//every object will have same non static members unless I change it
		//every home is an object of cidco where the toilet and bathrooms are of same length
		//unless the home owner changes it.
		
		
		
		//the ground of cidco is a static variable it is changed for every one as soon as an object make
		//any changes in it
		//if any changes are not made then it remains the same for every one
		//the static variable ground can be accessed by a particular object
		//but is not allowed a particular object to make changes to the static variable
		//the changes can be made to the static variable without any use of object reference.
	System.out.println(cidco1.rm);
	System.out.println(cidco1.tt);
	System.out.println(cidco1.ground);
	System.out.println(cidco2.rm);
	System.out.println(cidco2.tt);
	System.out.println(cidco2.ground);
	System.out.println(cidco3.rm);
	System.out.println(cidco3.tt);
	cidco4.ground = 300;
	System.out.println(cidco4.rm);
	System.out.println(cidco4.tt);
	System.out.println(cidco1.ground);
	System.out.println(cidco4.ground);

	}
	
}
