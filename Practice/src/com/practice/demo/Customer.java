package com.practice.demo;

import java.util.Objects;

public class Customer {

	String str;
	int age;

	public Customer(String str, int age) {
		super();
		this.str = str;
		this.age = age;
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
		return age == other.age && Objects.equals(str, other.str);
	}

	
}
