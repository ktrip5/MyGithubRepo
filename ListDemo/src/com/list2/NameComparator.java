package com.list2;

import java.util.Comparator;

public class NameComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp e1, Emp e2) {
		String s1 = e1.getEname();
		String s2 = e2.getEname();
		return 0;
	}

}
