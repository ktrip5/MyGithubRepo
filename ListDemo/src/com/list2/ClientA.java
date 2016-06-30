package com.list2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClientA {

	public static void main(String[] args) {
		List<Emp> lst = new ArrayList<Emp>();
		lst.add(new Emp(100, "kartik", 2000000));
		lst.add(new Emp(107, "deeepak", 56709));
		lst.add(new Emp(103, "ram", 25678));
		lst.add(new Emp(110, "raheem", 4568976));
		lst.add(new Emp(130, "kartikey", 200000));
		// for eid sorting used comparable Collections.sort(lst);
		// used comparator
		// for namecomparatorCollections.sort(lst, new NameComparator());
		Collections.sort(lst, new SalComparator());
		Collections.reverse(lst);
		for (Emp emp : lst) {
			System.out.println(emp);
		}

	}
}