package com.sapient.beans;

import com.sapient.util.Myutil;

public class ConstructorDemo {
	// making immutable class by making variables private

	private double amount;
	private int year;
	private float rate;

	public ConstructorDemo(double amount, int year, float rate) throws Exception {
		//if we dont provide super() then compiler will write this line
		super();
		if (amount <= 0 || year <= 0 || rate <= 0)
			throw new Exception("Mnt or years or rate must be greater than zero");
		this.amount = amount;
		this.year = year;
		this.rate = rate;
	}

	public double calSimpleI() {

		return Myutil.roundOffdecimals(amount * year * rate / 100);
	}

	public double calCompndI() {
		return Myutil.roundOffdecimals(amount * Math.pow((1 + rate / 100.0), year) - amount);
	}

}
