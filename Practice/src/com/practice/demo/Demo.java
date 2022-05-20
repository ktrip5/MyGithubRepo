package com.practice.demo;

public class Demo {

	public static void main(String[] args) {

		EmplyeeCapegemini e1 = new EmplyeeCapegemini("final", 10, 10);
		String str = "Kartik Tripathi";
		int length = str.length();
		System.out.println("Sub-Set of given String ");

		for (int start = 0; start < length; start++) {
			for (int end = start + 1; end <= length; end++) {
				System.out.println(str.substring(start, end));
			}
		}

	}
}
