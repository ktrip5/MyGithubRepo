package com.sapient.beans;

public class StdCalculator extends Calculator {

	private double val2;

	public StdCalculator(double d) throws Exception {
		super(d);
	}

	public StdCalculator(int d) throws Exception {
		super(d);
	}

	public StdCalculator(double d, double val2) throws Exception {
		super(d);
		this.val2 = val2;
	}

	public double doAdd() {
		return getD() + val2;
	}

	public double doMultiply() {
		return getD() * val2;
	}

	public double doSubtraction() {
		return getD() - val2;
	}

}
