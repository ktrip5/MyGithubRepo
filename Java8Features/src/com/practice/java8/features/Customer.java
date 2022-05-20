package com.practice.java8.features;

import java.util.HashSet;
import java.util.Objects;

public class Customer {

	String name;
	int age;

	Customer(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public static void main(String[] args) {
		Customer c1 = new Customer("John", 20);
		Customer c2 = new Customer("John", 20);
		Customer c3 = new Customer("Kartik", 35);
		Customer c4 = new Customer("Kartik", 35);
		HashSet<Customer> customerSet = new HashSet<>();
		customerSet.add(c1);
		customerSet.add(c2);
		customerSet.add(c3);
		customerSet.add(c4);
		System.out.println(customerSet.size());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((this.name == null) ? 0 : this.name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return age == other.age && Objects.equals(name, other.name);
	}

}
