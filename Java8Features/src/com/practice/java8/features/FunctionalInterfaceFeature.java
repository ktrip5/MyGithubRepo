package com.practice.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Emp {
	private List<Integer> p;
	private int id;

	Emp(int id, List<Integer> p) {
		this.p = p;
		this.id = id;
	}

	public List<Integer> getP() {
		return p;
	}

	public void setP(List<Integer> p) {
		this.p = p;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}

public class FunctionalInterfaceFeature {

	public static void main(String[] args) {

		/*
		 * IFunctionalInterface i = (a, b) -> a + b; System.out.println("Addition " +
		 * i.add(20, 30));
		 */

		List<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(40);
		list.add(57);
		list.add(20);
		list.add(20);
		list.add(10);
		list.add(57);

		List<Emp> lst = new ArrayList<>();
		lst.add(new Emp(1, list));
		lst.add(new Emp(2, list));

		List<Integer> listofInt = lst.stream().flatMap(i -> i.getP().stream()).collect(Collectors.toList());
		System.out.println("FlatMap " + listofInt);
		Map<String, List<String>> people = new HashMap<>();
		people.put("John", Arrays.asList("555-1123", "555-3389"));
		people.put("Mary", Arrays.asList("555-2243", "555-5264"));
		people.put("Steve", Arrays.asList("555-6654", "555-3242"));

		List<String> phones = people.values().stream().flatMap(Collection::stream).collect(Collectors.toList());
		System.out.println("FlatMap " + phones);

		List<String> lisotOfnumber = new ArrayList<String>();
		lisotOfnumber.add("10");
		lisotOfnumber.add("20");
		lisotOfnumber.add("30");
		lisotOfnumber.add("40");
		lisotOfnumber.add("50");
		
		System.out.println("Before removing : " +lisotOfnumber);
		
		Iterator<String> itr=lisotOfnumber.iterator();
		
		while(itr.hasNext()) {
			
			String temp=itr.next();
			
			if(temp=="10") {
				itr.remove();
			}
			System.out.println("After removing : " +temp);
		}
		
		System.out.println("After removing : " +lisotOfnumber);

		List<String> lisotOfnumber1 = new ArrayList<String>();
		lisotOfnumber.add("20");
		lisotOfnumber.add("20");
		lisotOfnumber.add("20");
		lisotOfnumber.add("20");
		lisotOfnumber.add("20");

		Map<String, String> hmap = new HashMap<>();
		hmap.put("13L", "Kartik");
		hmap.put("11L", "Chirag");
		hmap.put("14L", "Nikunj");
		hmap.put("22L", "Aashu");
		hmap.put("18L", "Arpit");
		hmap.put("12L", "Deepak");

		Map<String, List<String>> hmap1 = new HashMap<>();
		hmap1.put("Kartik", lisotOfnumber);
		hmap1.put("Arpit", lisotOfnumber1);

		// ystem.out.println("list of numbet" + hmap1.values().stream().map());

		// List of Salary of Map
		List<String> listSalary = hmap.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
		System.out.println("List of Salaries : " + listSalary);

		// List of Employee of Map
		List<String> listEmployee = hmap.entrySet().stream().map(Map.Entry::getValue).toList();
		System.out.println("List of Employees : " + listEmployee);

		// Find the highest salary
		String highestSalary = listSalary.stream().max((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Highest Salary of Employee :" + highestSalary);

		// Find the Lowest Salary
		String lowestSalary = listSalary.stream().min((i1, i2) -> i1.compareTo(i2)).get();
		System.out.println("Lowest Salary of Employee :" + lowestSalary);

		// Find the Salary of Kartik Employee and Use of Optional Class
		long salaryOfKartik = hmap.entrySet().stream().filter(i -> "Kartik".equals(i.getValue()))
				.map(Map.Entry::getKey).count();

		System.out.println("Salary of Kartik : " + salaryOfKartik);

		/*
		 * if (salaryOfKartik.isEmpty()) { System.out.println("Use of Optional Class");
		 * }
		 */
		
		/* Iterating two collections */
		/*
		 * Set<String> unavailableItems = list2.stream() .map(MyClass::getStr)
		 * .collect(Collectors.toSet());
		 * 
		 * // stream the list and use the set to filter it List<String> unavailable =
		 * list1.stream() .filter(e -> unavailableItems.contains(e))
		 * .collect(Collectors.toList());
		 */

		// create array from collection using stream constructor reference
		Integer[] intArr = list.stream().toArray(Integer[]::new);

		// got the stream from Integer array
		Stream.of(intArr).forEach(System.out::println);
		/*
		 * Comparator<Integer> comp = (s1, s2) -> { if (s1 < s2) return -1; else if (s1
		 * > s2) return +1; else return 0;
		 * 
		 * };
		 */

		System.out.println("Old list " + list);
		


		List<Integer> list1 = list.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("Sorted list " + list1);

		// Sorting using comparator
		// List<Integer> listUsingComparator =
		// list.stream().sorted(comp).collect(Collectors.toList());
		// System.out.println("List Using Comparator" + listUsingComparator);
		// OR
		List<Integer> listUsingComparator1 = list.stream().sorted((s1, s2) -> {
			
			if (s1 < s2)
				return -1;
			else if (s1 > s2)
				return +1;
			else
				return 0;

		}).collect(Collectors.toList());

		System.out.println("List Using Comparator" + listUsingComparator1);

		System.out.println((list.stream().filter((i) -> i % 2 == 0)).collect(Collectors.toList()));

		List<Integer> list2 = list.stream().map((i) -> i + 5).collect(Collectors.toList());
		System.out.println("Graced List " + list2);

		list.stream().forEach(s -> {
			System.out.println("Square of " + s + " will be " + (s * s));
		});

		List<Integer> unique = list.stream().distinct().collect(Collectors.toList());
		System.out.println("List with Unique Numbers" + (unique));

		// Using Lambda Function

		IFunctionalInterface i = (a, b) -> {

			System.out.println("Addition of two numbers using lambda expression " + (a + b));

		};
		i.add(20, 30);

		i.f1();

		IFunctionalInterface.f();

		
		  IFunctionalInterface i1 = new IFunctionalInterface() {
		  
		  @Override public void add(int a, int b) {
		  
		  System.out.println("Using annonymous inner class " + (a + b)); } };
		  i1.add(30, 30);
		 
	}

}
