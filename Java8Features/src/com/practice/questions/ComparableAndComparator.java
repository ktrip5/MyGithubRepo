package com.practice.questions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableAndComparator {

	public static void main(String[] args) {
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Kartik", 10000, "WTC"));
		list.add(new Employee("Arpit", 30000, "Naggaro"));
		list.add(new Employee("Ashutosh", 20000, "Sapient"));
		System.out.println("initial List " + list);
		Collections.sort(list);
		System.out.println("final List " + list);

	}

}
