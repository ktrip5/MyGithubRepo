package com.sapient.beans;

public class Computer extends Product {

	private String mboard;

	public Computer(int id, String pname, double price, String mboard) {
		super(id, pname, price);
		this.mboard = mboard;
	}

	@Override
	public String isExpensive() {

		if (getPrice() > 40000)
			return "costier";
		else
			return "average";
	}

	@Override
	public String display() {
		// here super.display will give the value of all three field described
		// in abstract class along with mboard of this class
		return super.display() + " " + mboard;
	}

}
