package com.pratice.impl;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

import com.practice.demo.Customer;



public class EqualsAndHashCode  implements AutoCloseable{

	public static void main(String[] args) {

		Customer c1 = new Customer("Kartik", 27);
		Customer c2 = new Customer("Kartik", 27);
		Customer c3 = new Customer("Deepak", 28);

		System.out.println(c1.equals(c2));
		HashSet<Customer> hSet = new HashSet<>();
		System.out.println(c1.hashCode());
		System.out.println(c2.hashCode());
		System.out.println(c3.hashCode());

		hSet.add(c1);
		hSet.add(c2);
		hSet.add(c3);
		System.out.println("Size of HashSet " + hSet.size());
		Map<Customer, Integer> hMap = new HashMap<>();
		hMap.put(c1, 10000);
		hMap.put(c2, 20000);
		hMap.put(c3, 30000);

		System.out.println("Size of hashMap " + hMap.size());
		System.out.println(hMap.get(c1));
		System.out.println(hMap.get(c2));
		

	}

	@Override
	public void close() throws Exception {
		System.out.println("Closed");
		
	}

}
