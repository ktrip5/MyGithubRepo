package com.practice.questions;

public class ExceptionHandling {

	public static void main(String[] args) throws InterruptedException {
		printHello();

	}

	private static void printHello() throws InterruptedException {
		printBye();

	}

	private static void printBye() throws InterruptedException {
		Thread.sleep(1000);
		System.out.println("Bye Bye Checked Excpetion");

	}

}
