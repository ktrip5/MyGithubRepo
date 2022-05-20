package com.practice.java8.features;

public interface I1 {

	public void helloWrold();

	default void printMethod() {
		System.out.println("In default method of I1");
	}
	default void printMethod1() {
		System.out.println("In default method of I1");
	}
}
