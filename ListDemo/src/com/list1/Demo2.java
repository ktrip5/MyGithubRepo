package com.list1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Demo2 {

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
		Collections.sort(lst);
		for (String str : lst)
			System.out.println(str);
	}

}
