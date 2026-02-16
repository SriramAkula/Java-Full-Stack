
package com.capg.java;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase{
	
	Calculator calculator;
	
	protected void setUp() {
		calculator=new Calculator();
	}
	
	public void testAll() {
//		assertEquals(5,calculator.addition(2, 3));
		assertEquals(6,calculator.multiplication(2, 3));
		assertEquals(-1,calculator.subtraction(2, 3));
		assertEquals(2,calculator.division(6, 3));

	}
	public void testAdd() {
		assertEquals(5,calculator.addition(2, 3));
	}
	
	protected void tearDown() {
		calculator=null;
	}
}
