package com.jenkins.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.jenkins.driver.Calculator;

public class CalculatorTest {
	
	Calculator cl = new Calculator();
	
	@Test
	public void testAddition() {
		assertEquals(cl.add(10, 20), 30);
	}
	
	@Test
	public void testSub() {
		assertEquals(cl.substract(30, 20), 10);
	}
	
	@Test
	public void testMultiplication() {
		assertEquals(cl.multiply(10, 20), 200);
	}
	
	@Test
	public void testDivision() {
		assertEquals(cl.divide(40, 20), 2);
	}
	
}