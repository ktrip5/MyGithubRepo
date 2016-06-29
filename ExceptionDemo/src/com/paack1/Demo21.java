package com.paack1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Demo21 {

	public static void main(String[] args) {
		System.out.println(display());
		show();

	}

	@SuppressWarnings("resource")
	public static int display() {
		Scanner sc = null;
		try {
			sc = new Scanner(new File("abc.txt"));
			int a = sc.nextInt();
			int b = sc.nextInt();
			int res = a + b;
			return res;

		} catch (InputMismatchException ix) {
			ix.printStackTrace();
			return 0;

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			return 0;
		}

		finally {
			System.out.println("i am in finally block");
			// closing the file stream instead of closing scanner stream
			// if null then it wouldn't close the file input stream
			if (sc != null)
				sc.close();
		}

	}

	public static void show() {
		System.out.println("show method get executed ");

	}
}
