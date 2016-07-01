package com.map1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Demo2 {

	private static Map<Integer, String> emap;

	static {
		emap = new HashMap<Integer, String>();// not in a sorted order
		// emap = new TreeMap<Integer, String>();// return values in asorted
		// order
		emap.put(1007, "kartik");
		emap.put(1003, "deepak");
		emap.put(1006, "jt");
		emap.put(1009, "kt");
		emap.put(1009, "tt");
	}

	public static void main(String[] args) {
		System.out.println("--------------------------using keySet----------------------");
		Set<Integer> set = emap.keySet();
		for (int key : set)
			// System.out.println(key + " " + emap.get(key));
			System.out.println(emap.get(key));
		System.out.println("---------------------------------using values method--------");
		// using values
		Collection<String> col = emap.values();
		for (String str : col)
			System.out.println(str);
		System.out.println("------------------------using entrySet method----------------------------------");

		// using entrySet method
		// Entry is a class which returns keys and values
		Set<Entry<Integer, String>> entries = emap.entrySet();
		for (Entry e : entries)
			System.out.println(e.getKey() + " " + e.getValue());

	}

}
