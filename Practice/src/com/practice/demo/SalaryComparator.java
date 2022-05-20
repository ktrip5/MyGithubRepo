package com.practice.demo;

import java.util.Comparator;

public class SalaryComparator implements Comparator<EmplyeeCapegemini> {

	@Override
	public int compare(EmplyeeCapegemini o1, EmplyeeCapegemini o2) {
		if (o1.getSalary() > o2.getSalary())
			return 1;
		else
			return -1;
	}

}
