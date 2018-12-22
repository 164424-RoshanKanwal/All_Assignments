package com.roshan.demo;

public class Demo1 {

	private int id;
	private String name;
	
	public Demo1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	
	public Demo1() {
		super();
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
		Demo1 d = new Demo1(3, "Roshan");
		Demo1 d2 = new Demo1();
		d2.setId(4);
		d2.setName("Kanwal");
		System.out.println(d2.getName());
	}
	
}
