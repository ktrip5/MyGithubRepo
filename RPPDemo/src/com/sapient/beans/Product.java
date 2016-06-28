package com.sapient.beans;

public abstract class Product {
	private int id;
	private String pname;
	private double price;

	public Product(int id, String pname, double price) {
		super();
		this.id = id;
		this.pname = pname;
		this.price = price;
	}

	public int getId() {
		return id;
	}

	public String getPname() {
		return pname;
	}

	public double getPrice() {
		return price;
	}

	public String display() {
		return id + " " + pname + " " + price;
	}

	public abstract String isExpensive();
}
