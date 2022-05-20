package com.practice.java8.features;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MapClassExamples {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<>();
		map.put(null, "kartik");
		map.put(null, "Arpit");
		map.put(null, "Priyanka");
		System.out.println(map);

		Map<String, String> map2 = new HashMap<>();
		map2.put(null, "kartik");
		map2.put(null, "Arpit");
		map2.put(null, "Priyanka");
		System.out.println(map2);

		List<String> arrList = new ArrayList<>();
		arrList.add("a");
		arrList.add("b");
		arrList.add("c");
		arrList.add("d");
		System.out.println("Modified list " + arrList);

		List<String> linkedList = new LinkedList<>();
		linkedList.add("a");
		linkedList.add("b");
		linkedList.add("c");
		linkedList.add("d");
		linkedList.add("e");
		System.out.println(linkedList);

		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(3);
		hashSet.add(7);
		hashSet.add(5);
		hashSet.add(52);
		hashSet.add(715);

		Set<Integer> hashSet1 = new HashSet<>();
		hashSet1.add(9);
		hashSet1.add(7);
		hashSet1.add(5);
		hashSet1.add(52);
		hashSet1.add(96);

		hashSet.removeAll(hashSet1);

		System.out.println("After Removal " + hashSet);


		Iterator<Integer> itr = hashSet.iterator();

		while (itr.hasNext()) {

			Integer i = itr.next();
			System.out.println(i);
		}

		hashSet.stream().forEach(System.out::println);
		System.err.println("hash set " + hashSet);
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(9);
		treeSet.add(7);
		treeSet.add(94);
		treeSet.add(6);
		treeSet.add(19);
		System.err.println("tree Set" + treeSet);
		treeSet.stream().forEach(System.out::println);

		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(7);
		linkedHashSet.add(13);
		linkedHashSet.add(2);
		linkedHashSet.add(11);
		System.out.println("Linked Set " + linkedHashSet);
	}

}
