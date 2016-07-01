package com.pack1;

public class ClientA {

	public static void main(String[] args) {
		Icalc add = (int a, int b) -> {
			return a + b;
		};
		Icalc sub = (int a, int b) -> {
			return a - b;
		};
		Icalc mul = (int a, int b) -> {
			return a * b;
		};

		System.out.println(add.calc(12, 20));
		System.out.println(sub.calc(23, 13));
		System.out.println(mul.calc(23, 23));

	}

}
