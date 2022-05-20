package com.practice.multithreading;

public class PrintSequenceClass implements Runnable {

	public int PRINT_NUMBERS_UPTO = 10;
	static int number = 1;
	int remainder;
	static Object lock = new Object();
	//ReentrantLock lock1=new ReentrantLock();

	PrintSequenceClass(int remainder) {
		this.remainder = remainder;
	}

	@Override
	public void run() {
		while (number < PRINT_NUMBERS_UPTO - 2) {
			synchronized (lock) {
				while (number % 4 != remainder) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
				System.out.println(Thread.currentThread().getName() + " " + number);
				number++;
				lock.notifyAll();
			}
		}
	}

}
