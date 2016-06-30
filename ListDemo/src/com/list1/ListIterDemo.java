package com.list1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.List;

public class ListIterDemo {

	public static void main(String[] args) {
		// generics <generic type>
		List<String> lst = new ArrayList<String>();
		lst.add("sajal");
		lst.add("deepak");
		lst.add("jyoti");
		lst.add("kartik");
		lst.add("kartik");
		// allows duplicates value

		// lst.add(56); cant add int coz generics will throw compile time
		// error(as it is defined as string).

		ListIterator<String> it = lst.listIterator();
		while (it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		System.out.println("-----------------reverse direction------------");

		while (it.hasPrevious()) {
			String str = it.previous();
			System.out.println(str);

		}

	}

}
