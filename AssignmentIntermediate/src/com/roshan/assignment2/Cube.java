package com.roshan.assignment2;

public class Cube  extends Shape{

	@Override
	public void draw(int edgeLength) {
		
		System.out.println("Surface are of cube " + 6 * edgeLength * edgeLength);
		System.out.println("Volume of cube " + edgeLength*edgeLength*edgeLength);
		
	}

}
