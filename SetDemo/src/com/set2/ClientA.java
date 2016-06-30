package com.set2;

import java.util.HashSet;
import java.util.Set;

import com.set1.Emp;

public class ClientA {

	public static void main(String[] args) {
		Set<Emp> set = new HashSet<Emp>();
		Emp e1 = new Emp(1001, "ram", 9000);
		Emp e2 = new Emp(1005, "KAM", 92340);
		Emp e3 = new Emp(1002, "rasm", 7865);
		Emp e4 = new Emp(1007, "shyam", 1234);
		Emp e5 = new Emp(1003, "jaam", 123234);
		Emp e6 = new Emp(1005, "jaam", 123234);

		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e4);
		set.add(e5);
		set.add(e5);// ignored based on ref
		set.add(e6);// ignored basedon overridden hashcode () and equals()
		for (Emp emp : set) {
			System.out.println(emp);
		}

	}

}
