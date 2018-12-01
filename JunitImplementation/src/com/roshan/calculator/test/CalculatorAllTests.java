package com.roshan.calculator.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;



@RunWith(Suite.class)
@SuiteClasses({CalculatorTestAdd.class, 
				CalculatorTestSub.class, 
				CalculatorTestMul.class, 
				CalculatorTestDiv.class})
public class CalculatorAllTests {

}
