package com.capg.java;

import junit.framework.TestCase;

public class CalculationTest extends TestCase{
	
	public void testAdd() {
		
		Calculator c1=new Calculator();
		int result = c1.addition(2, 3);
	
		
		assertEquals(5,result);
		
		//assertEquals(10,new Calculation().multiplication(2,5));
		
		
	}
	
	public void testMultiply() {
		assertEquals(6,new Calculator().multiplication(2,3));
	}
	
	public void testDivision() {
		assertEquals(2,new Calculator().division(9, 3));
	}
}
