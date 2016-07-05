package com.sapient.util;
/**
 * 
 * @author v_graju1
 * @version 1.0
 * This class utility methods to round the number to 2 decimal places and given decimal places
 */
public class MyUtil {

	/**
	 * 
	 * @param d - represents double data with decimal places 
	 * @return - returns double data with max 2 decimal places
	 */
	public static double round2dec(double d){
		return Math.round(d * 100 )/100.0;
	}
	/**
	 * 
	 * @param d - represents double data to round
	 * @param n - represent no of decimal places
	 * @return - returns double data with max n decimal places
	 */
	public static double round2dec(double d,int n){
		double p = Math.pow(10, n);
		return Math.round(d * p )/p;
	}
}
