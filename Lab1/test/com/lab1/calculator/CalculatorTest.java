package com.lab1.calculator;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CalculatorTest {

	private Calculator calculator;
	
	@Before
	public void setUp(){
		calculator = new Calculator();
	}
	
	@Test
	public void addTest(){
		assertEquals(4, calculator.add(2,2));
	}

	@Test
	public void subtractTest(){
		assertEquals(2, calculator.subtract(4, 2));
	}
	
	@Test
	public void multTest(){
		assertEquals(4, calculator.multiply(2, 2));
	}
	
	@Test
	public void divideTest(){
		assertEquals(2, calculator.divide(4, 2));
	}
}
