package com.UKG;

public abstract class AbstractClassExpl {

	public int i;

	public AbstractClassExpl() {

	}

	public AbstractClassExpl(int i) {
		super();
		this.i = i;
		print();
		m1();
	}

	public abstract void m1();

	public abstract void m2();

	public void print() {
		i = i * i;
		System.out.println("In Abstract class and square of i is " + i);
	}

}
