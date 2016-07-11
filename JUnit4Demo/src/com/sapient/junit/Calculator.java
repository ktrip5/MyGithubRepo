package com.sapient.junit;

public class Calculator {
	public double calcSeries(int a, int b, int c) {
		
		double sum = (a + b + c) / 2.0;

		return sum;

	}
	public double roud2Decimal(double val)
	{
		//math .round returns long
		double res=Math.round((val*100))/100.0;
		return res;
	}
}
