package com.set1;

import java.util.HashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {
		//if we use LinkedHashSet then it will show in inserted order
		//Set<String> set = new LinkedHashSet<String>();
		//if we use HashSet then it will generate in random order avoiding repetition
		Set<String> set = new HashSet<String>();
		//Set<String> set = new TreeSet<String>();
		//sort in ordered way(ascending)
		set.add("ram");
		set.add("kala");
		set.add("bala");
		set.add("tala");
		set.add("aala");
		set.add("ram");
		//set.add(null); it cant not be sorted
		for (String str : set) {
			System.out.println(str);
		}

	}

}
