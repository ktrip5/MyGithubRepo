package com.sapient.util;

public class Myutil {
	public static double roundOffdecimals(double val) {
		double roundresult =(Math.round(val * 100))/100;
		return roundresult;

	}

}
