package com.roshan.calculator.test;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

import com.roshan.calculator.Calculator;

public class CalculatorTestDiv {
	
	
	Calculator cal = new Calculator();
	
	
	@Test
	public void testDiv_PositiveNumbers() {
		assertEquals(1, cal.divide(22,22), 0);
	}

	@Test
	public void testDiv_1Positive1NegativeNumber() {
		assertEquals(-3, cal.divide(36,-12), 0);
	}

	@Test
	public void testDiv_NegativeNumbers() {
		assertEquals(4, cal.divide(-48,-12), 0);
	}
}
