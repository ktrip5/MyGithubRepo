package com.practice.multithreading;

public class DriverClass implements Runnable {

	public static void main(String[] args) {
		Thread t = new Thread();
		t.start();
	}

	@Override
	public void run() {
		for (int j = 0; j < 10; j++) {
			System.out.println("Thread Name Running " + Thread.currentThread().getName());
		}

	}

}
