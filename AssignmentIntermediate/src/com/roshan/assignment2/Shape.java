package com.roshan.assignment2;

public abstract class Shape {

	public abstract void draw(int length);
	
	public static void main(String[] args) {
		Square sq = new Square();
		sq.draw(3);
		
		Circle circle = new Circle();
		circle.draw(3);
		
		Cube cube = new Cube();
		cube.draw(3);
		
		
	}
}
