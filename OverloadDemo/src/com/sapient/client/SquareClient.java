package com.sapient.client;

public class SquareClient {

	public static int calArea(int side) {
		return side * side;
	}

	public static double calArea(double side) {
		return side * side;
	}

	public static void main(String[] args) {
		System.out.println(calArea(7.4));

	}

}
