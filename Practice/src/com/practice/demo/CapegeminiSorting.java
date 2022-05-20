package com.practice.demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CapegeminiSorting {
	public static void main(String[] args) {
		List<EmplyeeCapegemini> list = new ArrayList<>();
		list.add(new EmplyeeCapegemini("Kartik", 10000, 100));
		list.add(new EmplyeeCapegemini("Priyank", 5000, 102));
		list.add(new EmplyeeCapegemini("Deepak", 20000, 101));
		System.out.println("Previous list " + list);
		// Sorting By Name
		// Collections.sort(list, new NameComparator());
		// Sorting By Salary
		Collections.sort(list, new SalaryComparator());
		System.out.println("Sorted List " + list);
	}

}
