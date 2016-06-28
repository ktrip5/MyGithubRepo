package com.sapient.client;

import java.util.Scanner;

import com.sapient.beans.ConstructorDemo;;

public class ConstructorClient {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.err.println("enter the amount");
		double amnt = sc.nextDouble();
		System.err.println("enter the no of years");
		int years = sc.nextInt();
		System.err.println("enter the amount of rate");
		float rate = sc.nextFloat();
		ConstructorDemo obj=null;

		// option = sc.next();
		try {
			obj = new ConstructorDemo(amnt, years, rate);
			System.out.println("simple interest is =" + obj.calSimpleI());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}

		
	}

}
