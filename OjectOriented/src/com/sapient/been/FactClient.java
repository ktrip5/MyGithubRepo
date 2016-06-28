package com.sapient.been;

import java.util.Scanner;

public class FactClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Factorial fact = new Factorial();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		fact.num = sc.nextInt();
		System.err.println("factorial of given number is=" + fact.findFact());
	}

}
