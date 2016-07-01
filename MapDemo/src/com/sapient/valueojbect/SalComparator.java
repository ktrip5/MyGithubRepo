package com.sapient.valueojbect;

import java.util.Comparator;

public class SalComparator implements Comparator<Emp> {

	@Override
	public int compare(Emp o1, Emp o2) {
		if (o1.getBal() > o2.getBal())
			return 1;
		else if (o1.getBal() < o2.getBal())
			return -1;
		else
			return 0;
	}

}
