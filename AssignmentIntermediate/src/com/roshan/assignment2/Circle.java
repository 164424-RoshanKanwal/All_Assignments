package com.roshan.assignment2;

public class Circle  extends Shape{

	@Override
	public void draw(int radius) {
		
		System.out.println("Area of circle " + Math.PI * radius * radius);
		System.out.println("Circumference of circle " + Math.PI * 2 * radius);
		
	}

}
