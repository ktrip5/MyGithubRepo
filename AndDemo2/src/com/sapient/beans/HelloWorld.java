package com.sapient.beans;

import com.sapient.util.MyUtil;

/**
 * Demonstrates Ant Demo
 * 
 * @author kartik_tripathi
 * @version 1.0
 *
 */
public class HelloWorld {

	/**
	 * 
	 * @param args
	 *            - Command line argument accessed in static way and returns no
	 *            value
	 */

	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println(MyUtil.round2dec(10.37934));
		System.out.println(MyUtil.round2dec(10.3793456, 3));

	}

}
