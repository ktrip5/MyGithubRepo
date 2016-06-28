//checking for string literal in switch case
package com.sapient.been;

import java.util.Scanner;

public class InterestClientCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		Scanner sc = new Scanner(System.in);
		System.err.println("enter the amount");
		double amnt = sc.nextDouble();
		System.err.println("enter the no of years");
		int years = sc.nextInt();
		System.err.println("enter the amount of rate");
		float rate = sc.nextFloat();
		String option = "";
		System.out.println("1 for simple interes/2 for compound interest");
		option = sc.next();
		Interest obj = new Interest();
		obj.amount = amnt;
		obj.rate = rate;
		obj.year = years;

		switch (option) {
		case "simple":
			System.out.println("simple interest is =" + obj.calSimpleI());
			break;
		case "compound":
			System.out.println("compound interest is =" + obj.calCompndI());
			break;
		default:
			System.out.println("invalid option");

		}

	}

}
