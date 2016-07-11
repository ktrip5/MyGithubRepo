package com.sapient.test;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.sapient.junit.Calculator;

public class RoundTest {

	private static Calculator calc;

	@BeforeClass
	public static void mybeforeClass() {
		calc = new Calculator();
		System.out.println("before class");
	}

	@AfterClass
	public static void myafterClass() {
		calc = null;
		System.out.println("after class");
	}

	@Before // these are instance methods and we can initialoze instance
			// variables
	public void myBefore() {
		System.out.println("before");
	}

	
	@After// these are instance methods and we can initialoze instance
	// variables
	public void myAfter()
	{
		System.out.println("after");
		
	}
	@Test
	public void calTest() {
		System.out.println("test1");
		double expected = 10.57;

		double actual = calc.roud2Decimal(10.567835);
		/**
		 * assertion methods to check test cases pass or fail
		 */

		Assert.assertEquals(expected, actual, 0);

	}

	@Test
	public void calTest2() {
		System.out.println("test2");
		double expected = 10.53;

		double actual = calc.roud2Decimal(10.534835);
		/**
		 * assertion methods to check test cases pass or fail
		 */

		Assert.assertEquals(expected, actual, 0);

	}

	@Test
	public void calTest3() {
		System.out.println("test3");
		double expected = 10.56;

		double actual = calc.roud2Decimal(10.555835);
		/**
		 * assertion methods to check test cases pass or fail
		 */

		Assert.assertEquals(expected, actual, 0);

	}

	//@Ignore
	@Test
	public void calTest4() {
		System.out.println("test4");
		double expected = 28.0;

		double actual = calc.roud2Decimal(28);
		/**
		 * assertion methods to check test cases pass or fail
		 */

		Assert.assertEquals(expected, actual, 0);

	}
}