package com.sapient.been;

import java.util.Scanner;

// making SIMPLE and COMPOUND as constants using enum class
enum calcOptions {
	SIMPLE, COMPOUND;
}

public class InterestClientenum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.err.println("enter the amount");
		double amnt = sc.nextDouble();
		System.err.println("enter the no of years");
		int years = sc.nextInt();
		System.err.println("enter the amount of rate");
		float rate = sc.nextFloat();
		System.out.println("simple interes/compound interest");
		// creation object of ENUM
		String str = sc.next();
		calcOptions option = calcOptions.valueOf(str.toUpperCase());
		Interest obj = new Interest();
		obj.amount = amnt;
		obj.rate = rate;
		obj.year = years;
		switch (option) {
		case SIMPLE:
			System.out.println("simple interest is =" + obj.calSimpleI());
			break;
		case COMPOUND:
			System.out.println("compound interest is =" + obj.calCompndI());
			break;
		default:
			System.out.println("invalid option");

		}

	}

}
