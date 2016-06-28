package com.sapient.beans;

public class Car {

	private int carId;
	private String carName;
	private double price;
	// using constructor to write something in bean package without providing setter methods
	// constructor overloading
	// constructor chaining
	public Car(int carId) {
		// super can be written manually or compiler assigns it
		super();
		this.carId = carId;
		System.out.println("one argument const is called");
	}

	public Car(int carId, String carName) {
		// this(arg 1,arg 2) used to invoke construtor with in class
		//
		this(carId);
		this.carName = carName;
		System.out.println("two argument const is called");
	}

	public Car(int carId, String carName, double price) {
		//calling 2 argument constructor
		this(carId, carName);
		this.price = price;
		System.out.println("three argument const is called");
	}

	public void display()
	{
		System.out.println(carId +" "+ carName + " " + price);
	}
}
