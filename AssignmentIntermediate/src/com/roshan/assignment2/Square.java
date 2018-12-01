package com.roshan.assignment2;

public class Square extends Shape{

	@Override
	public void draw(int sideLength) {
		
		System.out.println("Area of square " + sideLength * sideLength);
		System.out.println("Perimeter of square " + 4 * sideLength);
		
	}

}
