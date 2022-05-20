package com.UKG;

public class DriverClass extends AbstractClassExpl {

	public String str = "Kartik";

	public int j;

	public DriverClass(int j) {
		super(j);
		this.j = j;
	}

	public DriverClass() {
		super();
	}

	@Override
	public void m1() {
		System.out.println("overriden m1()");
	}

	@Override
	public void m2() {

	}

	public static void main(String[] args) {
		DriverClass ob = new DriverClass(10);
		
	}
}
