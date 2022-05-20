package com.practice.demo;

import java.util.Comparator;

public class NameComparator implements Comparator<EmplyeeCapegemini> {

	@Override
	public int compare(EmplyeeCapegemini o1, EmplyeeCapegemini o2) {
		if (o1.getName().compareTo(o2.getName()) > 0) {
			return 1;
		}
		return -1;
	}

}
