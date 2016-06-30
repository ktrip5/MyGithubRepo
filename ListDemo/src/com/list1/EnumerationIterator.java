package com.list1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;

public class EnumerationIterator {

	public static void main(String[] args) {
		// generics <generic type>
		List<String> lst = new ArrayList<String>();
		lst.add("sajal");
		lst.add("deepak");
		lst.add("jyoti");
		lst.add("kartik");
		lst.add("kartik");
		Enumeration<String> enm = Collections.enumeration(lst);

		while (enm.hasMoreElements()) {
			String str = enm.nextElement();
			System.out.println(str);

		}
	}

}
