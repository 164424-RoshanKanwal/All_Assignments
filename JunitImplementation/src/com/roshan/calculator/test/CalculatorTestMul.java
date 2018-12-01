package com.roshan.calculator.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.roshan.calculator.Calculator;

public class CalculatorTestMul {

	Calculator cal = new Calculator();
	
	@Test
	public void testMul_PositiveNumbers() {
		assertEquals(484, cal.multiply(22,22), 0);
	}
	
	@Test
	public void testMul_1Positive1NegativeNumber() {
		assertEquals(-24, cal.multiply(2,-12), 0);
	}
	
	@Test
	public void testMul_NegativeNumbers() {
		assertEquals(144, cal.multiply(-12,-12), 0);
	}
	
}
