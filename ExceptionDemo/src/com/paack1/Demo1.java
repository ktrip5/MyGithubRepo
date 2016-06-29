package com.paack1;

public class Demo1 {

	public static void main(String[] args) {
		System.out.println("line1");

		System.out.println("line2");
		System.out.println("line3");
		try{
			int d=9/0;
			System.out.println("line4");
			System.out.println("line5");

		}catch(ArithmeticException ex){
			System.out.println(ex.getMessage());
		}
		
		System.out.println("line7");
		System.out.println("line8");
	}

}
