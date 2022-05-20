package com.practice.java8.features;

@FunctionalInterface
public interface IFunctionalInterface {

	public void add(int a, int b);

	static void f() {
		System.out.println("kakakka");
	}

	default void f1() {
		System.out.println("kakakka");
	}
}
