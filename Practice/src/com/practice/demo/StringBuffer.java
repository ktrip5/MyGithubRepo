package com.practice.demo;

import java.util.HashMap;

public class StringBuffer {
	public static void main(String[] args) {
		Customer c1 = new Customer("John", 20);
		Customer c2 = new Customer("Kartik", 20);
		HashMap<String, Customer> hMap = new HashMap<>();
		hMap.put("WTC", c1);
		hMap.put("UKG", c2);
		System.out.println("Size = " + hMap.size());
		System.out.println(hMap.get("WTC"));
	}

}