package com.roshan.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.roshan.calculator.Calculator;

public class CalculatorTestSub {

	
Calculator cal = new Calculator();
	
	@Test
	public void testSub_PositiveNumbers() {
		assertEquals(0, cal.subtract(22,22), 0);
	}
	
	@Test
	public void testSub_1Positive1NegativeNumber() {
		assertEquals(-34, cal.subtract(22,-12), 0);
	}
	
	@Test
	public void testSub_NegativeNumbers() {
		assertEquals(0, cal.subtract(-12,-12), 0);
	}
	
	@Test
	public void testSub_1Negative1PositiveNumber() {
		assertEquals(34, cal.subtract(-22,12), 0);
	}
	
}
