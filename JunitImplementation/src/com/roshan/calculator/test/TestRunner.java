package com.roshan.calculator.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {

	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(CalculatorTestAdd.class,
											CalculatorTestSub.class,
											CalculatorTestMul.class,
											CalculatorTestDiv.class);
		
		for (Failure failure: result.getFailures()){
			
			System.out.println(failure.toString());
			
		}
		
		System.out.println(result.wasSuccessful());
		
	}

}
