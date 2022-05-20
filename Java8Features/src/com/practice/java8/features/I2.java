package com.practice.java8.features;

public interface I2 {

	//public void m1();

	default void printMethod() {
		System.out.println("In default method of I2");
		
	}

}
