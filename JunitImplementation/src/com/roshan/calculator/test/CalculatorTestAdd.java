package com.roshan.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.roshan.calculator.Calculator;

public class CalculatorTestAdd {

Calculator cal = new Calculator();
	
	@Test
	public void testAdd_PositiveNumbers() {
		assertEquals(44, cal.add(22,22), 0);
	}
	
	@Test
	public void testAdd_1Positive1NegativeNumber() {
		assertEquals(10, cal.add(22,-12), 0);
	}
	
	@Test
	public void testAdd_NegativeNumbers() {
		assertEquals(-24, cal.add(-12,-12), 0);
	}
}
