package com.practice.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public final class ImmutableClass {

	private final int id;

	private final String name;

	private final HashMap<String, String> testMap;

	private final List<String> testList;

	

	public List<String> getTestList() {
		return testList;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	/* Accessor function for mutable objects */

	@SuppressWarnings("unchecked")
	public HashMap<String, String> getTestMap() {
		// return testMap;
		return (HashMap<String, String>) testMap.clone();
	}

	/**
	 * Constructor performing Deep
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	public ImmutableClass(int i, String n, HashMap<String, String> hm, List<String> list) {
		System.out.println("Performing Deep  for Object initialization");
		this.id = i;
		this.name = n;
		HashMap<String, String> tempMap = new HashMap<String, String>();
		List<String> testList=new ArrayList<String>();
		
		String key;
		Iterator<String> it = hm.keySet().iterator();
		while (it.hasNext()) {
			key = it.next();
			tempMap.put(key, hm.get(key));
		}
		this.testMap = tempMap;
		
		Iterator<String> it1= list.iterator();
		while (it1.hasNext()) {
			testList.add(it1.next());
		}
		this.testList=list;

	}

	/**
	 * Constructor performing Shallow
	 * 
	 * @param i
	 * @param n
	 * @param hm
	 */

	/*
	 * public ImmutableClass(int i, String n, HashMap<String, String> hm) {
	 * System.out.println("Performing Shallow for Object initialization"); this.id =
	 * i; this.name = n; this.testMap = hm; }
	 */
	/**
	 * To test the consequences of Shallow and how to avoid it with Deep for
	 * creating immutable classes
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> sList = new ArrayList<String>();
		sList.add("a");
		sList.add("b");
		HashMap<String, String> h1 = new HashMap<String, String>();
		h1.put("1", "first");
		h1.put("2", "second");

		String s = "original";

		int i = 10;

		ImmutableClass immutable = new ImmutableClass(i, s, h1, sList);

		// Lets see whether its copy by field or reference
		System.out.println(s == immutable.getName());
		System.out.println(h1 == immutable.getTestMap());
		// print the ce values
		System.out.println("ce id:" + immutable.getId());
		System.out.println("ce name:" + immutable.getName());
		System.out.println("ce testMap:" + immutable.getTestMap());
		// change the local variable values
		i = 20;
		s = "modified";
		sList.add("K");

		h1.put("3", "third");
		// print the values again
		System.out.println("ce id after local variable change:" + immutable.getId());
		System.out.println("ce name after local variable change:" + immutable.getName());
		System.out.println("ce testMap after local variable change:" + immutable.getTestMap());
		System.out.println("ce testList after local variable change:" + immutable.getTestList());

		HashMap<String, String> hmTest = immutable.getTestMap();
		hmTest.put("4", "new");

		System.out.println("ce testMap after changing variable from accessor methods:" + immutable.getTestMap());

		System.out.println("Map afetr last operation " + hmTest);

	}

}
