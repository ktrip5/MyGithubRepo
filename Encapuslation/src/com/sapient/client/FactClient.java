package com.sapient.client;

import java.util.Scanner;

import com.sapient.beans.Factorial;

public class FactClient {

	public static void main(String[] args) {
		
		
		Factorial fact = new Factorial();
		System.out.println("enter the number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		try { 
			
			fact.setNum(num);
			System.out.println("factorial of given number is=" + fact.findFact());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
