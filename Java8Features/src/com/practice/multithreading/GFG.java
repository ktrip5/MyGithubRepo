package com.practice.multithreading;

//Java program for the above approach

public class GFG {
	static int counter = 1;
	static int N=10;

	public void printOddNumber() {
		synchronized (this) {
			while (counter < N) {

				while (counter % 2 == 0) {
					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " " + counter + " ");
				counter++;
				notify();
			}
		}
	}

	public void printEvenNumber() {
		synchronized (this) {
			while (counter < N) {
				while (counter % 2 == 1) {

					try {
						wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				System.out.println(Thread.currentThread().getName() + " " + counter + " ");

				counter++;
				notify();
			}
		}
	}

	public synchronized void printNumbers() {
		
		

	}

	public static void main(String[] args) {

		GFG mt = new GFG();

		Thread t1 = new Thread(new Runnable() {
			public void run() {
				mt.printOddNumber();
			}
		});
		Thread t2 = new Thread(new Runnable() {
			public void run() {
				mt.printEvenNumber();
			}
		});

		t1.start();
		t2.start();
	}
}
