package com.practice.java8.features;

public class InterfaceImplementedClass implements I1,I2 {

	public static void main(String[] args) {
		InterfaceImplementedClass impl = new InterfaceImplementedClass();
		impl.printMethod();

	}

	@Override
	public void helloWrold() {
		// TODO Auto-generated method stub

	}

	@Override
	public void printMethod() {
		I1.super.printMethod();
	}
}
