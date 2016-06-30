package com.list1;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class Demo3 {

	public static void main(String[] args) {
		// List<String> lst = new LinkedList<String>();
		List<String> lst = new ArrayList<String>();
		lst.add("sajal");
		lst.add("deepak");
		lst.add("jyoti");
		lst.add("kartik");
		lst.add("kartik");
		System.out.println(lst);
		lst.add(3, "anjela");
		System.out.println(lst);
		lst.remove(4);
		System.out.println(lst);
		lst.remove("kartik");
		System.out.println(lst);
		System.out.println("size =" + lst.size());
		System.out.println(lst.get(3));
		// List<String> lst2 = new LinkedList<String>();
		List<String> lst2 = new ArrayList<String>();
		lst2.addAll(lst);
		System.out.println(lst2);
	}

}
