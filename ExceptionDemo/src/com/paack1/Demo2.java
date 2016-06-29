package com.paack1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		System.out.println(display());
		show();
		// closing console input stream
		// making new object of Scanner class and in finally we closed it
		// so further we cant make input from standard input
		Scanner sc1 = new Scanner(System.in);
		String str = sc1.next();

	}

	@SuppressWarnings("resource")
	public static int display() {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("enter the first value");
			int a = sc.nextInt();
			System.out.println("enter the second value");
			int b = sc.nextInt();
			int res = a + b;
			return res;

		} catch (InputMismatchException ix) {
			ix.printStackTrace();
			return 0;

		}

		finally {
			System.out.println("i am in finally block");
			// closing the reference of Scanner class
			// if we don't close the input stream (system.in) it will become
			// memory leak and cant be garbage collected
			// advanced version is Demo21
			sc.close();
		}

	}

	public static void show() {
		System.out.println("show method get executed ");

	}
}
