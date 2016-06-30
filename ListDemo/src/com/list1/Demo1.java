package com.list1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo1 {

	/**
	 * issues if the collection contains different objects
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		List lst = new ArrayList();
		int a = 56;
		double d = 5.2;
		lst.add(a);
		lst.add(d);
		lst.add("ram");

		// Collections.sort(lst);// collection cannot be sorted

		// iterating becomes complicated
		// typecasting is required
		for (Object obj : lst) {
			if (obj instanceof Integer) {
				int res1 = (Integer) obj;
				System.out.println(res1 + 10);
			} else if (obj instanceof Double) {
				double res2 = (Double) obj;
				System.out.println(res2 * 2);
			} else if (obj instanceof String) {
				String str = (String) obj;
				System.out.println(str.toUpperCase());
			}

		}

	}

}
