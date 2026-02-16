package com.capg.java.test;

import com.capg.java.Calculator;
import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	Calculator calculator;
	
	protected void setUp() {
		calculator=new Calculator();
	}
	
	public void testAdd() {
		assertEquals(5,calculator.addition(2, 3));
	}
	
	protected void tearDown() {
		calculator=null;
	}
}
