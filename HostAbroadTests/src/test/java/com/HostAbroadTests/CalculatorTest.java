package com.HostAbroadTests;

import static org.junit.Assert.assertEquals;

import static org.junit.Assert.assertTrue;
 
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest
{
	private static Calculator calculator;
	
	@BeforeClass
    public static void initCalculator() {
        calculator = new Calculator(4, 2);
    }
	
	@Before
	public void initMessage() {
		System.out.println("Running tests");
	}
	
	@After
	public void finishMessage() {
		System.out.println("Test finished");
	}
	
	@Test
	public void testAdd() {
		calculator.setOperator1(4);
		calculator.setOperator2(2);
		assertEquals(6, calculator.suma());
	}
	
	@Test
	public void testSubstract() {
		calculator.setOperator1(6);
		calculator.setOperator2(1);
		assertEquals(5, calculator.resta());
	}
	
	@Test
	public void testMultiply() {
		calculator.setOperator1(3);
		calculator.setOperator2(3);
		assertEquals(9, calculator.multiplica());
	}
	
	@Test
	public void testDivide() {
		calculator.setOperator1(3);
		calculator.setOperator2(3);
		assertEquals(1, calculator.divide());
	}
	
	@Test (expected = ArithmeticException.class)
	public void testException() {
		// Divide por cero
		calculator.setOperator1(3);
		calculator.setOperator2(0);
		calculator.divide();
	}	
}
