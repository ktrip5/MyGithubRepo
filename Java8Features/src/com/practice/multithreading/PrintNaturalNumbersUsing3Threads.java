package com.practice.multithreading;

public class PrintNaturalNumbersUsing3Threads {

	public static void main(String[] args) throws InterruptedException {
		PrintSequenceClass sequence1 = new PrintSequenceClass(1);
		PrintSequenceClass sequence2 = new PrintSequenceClass(2);
		PrintSequenceClass sequence3 = new PrintSequenceClass(3);
		PrintSequenceClass sequence4 = new PrintSequenceClass(0);

		Thread t1 = new Thread(sequence1, "T1");
		Thread t2 = new Thread(sequence2, "T2");
		Thread t3 = new Thread(sequence3, "T3");
		Thread t4 = new Thread(sequence4, "T4");

		t1.start();
		t2.start();
		t3.start();
		t4.start();
	}

}
