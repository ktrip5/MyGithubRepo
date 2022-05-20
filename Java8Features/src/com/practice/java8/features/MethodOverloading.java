package com.practice.java8.features;

public class MethodOverloading {

	public void print() {
		System.out.println("Hello");
	}

	public void print(String s, int i) {
		System.out.println("Hello A " + s +" " + i);
	}

	public String print(String s, double q) {
		System.out.println("Hello B " + s +" "+ q);
		return "Kartik";
	}

	public static void main(String[] args) {
		MethodOverloading m = new MethodOverloading();
		m.print("Kartik", 1.0);

	}

}
