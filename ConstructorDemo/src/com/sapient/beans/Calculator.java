package com.sapient.beans;

public class Calculator {
	private double d;

	
	public double getD() {
		return d;
	}
	public Calculator(double d) throws Exception {
		super();
		if (d <= 0)
			throw new Exception("value must be graeter than zero");
		this.d = d;
	}
// constructor overloading 
	public Calculator(int  d) throws Exception {
		//super();
		//if (d <= 0)
			//throw new Exception("value must be graeter than zero");
		//this.d = d;
		//here if we dont want to copy the above code we have to typecast  the integer value
	}

	public double round2decimal() {
		return Math.round(d * 100) / 100;
	}

	public double round2decimal(int n) {
		double p = Math.pow(10, n);
		return Math.round(d * p) / p;
	}

	public int convert2Int() {
		return (int) d;
	}
	 public String convertTobinary()
	 {
		 int val= convert2Int();
		 return Integer.toBinaryString(val);
	 }
	 public String convert2Octal()
	 {
		 int val=convert2Int();
		 
		 return Integer.toOctalString(val);
	 }
	 public String convert2Hexa()
	 {
		 int val=convert2Int();
		 
		 return Integer.toHexString(val);
	 }
}
