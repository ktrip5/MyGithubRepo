package com.sapient.test;

import static org.junit.Assert.*;
import org.junit.Test;

import com.sapient.junit.Calculator;

public class CalcTest {
	/*
	 * declaring test methods
	 */

	@Test
	public void calTest() {
		double expected = 10.0;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 10);
		/**
		 * assertion methods to check test cases pass or fail
		 */

		assertEquals(expected, actual, 0);
	}

	@Test
	public void calTest2() {
		double expected = 7.5;
		Calculator calc = new Calculator();
		double actual = calc.calcSeries(5, 5, 5);
		/**
		 * assertion methods to check test cases pass or fail assertEquals is a
		 * static method in Assert class
		 */

		assertEquals(expected, actual, 0);
	}

}
