package com.practice.questions;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Java8Examples {

	public static void main(String[] args) {

		Employee emp1 = new Employee("kartik", 10000, "WTC");
		Employee emp2 = new Employee("Subhadra", 12000, "OneStop");
		Employee emp3 = new Employee("kishore", 15000, "WTC");

		final List<Employee> listEmployee = new ArrayList<>();
		listEmployee.add(emp3);

		/*
		 * listEmployee.add(emp1); //listEmployee.add(emp2); listEmployee.add(emp3);
		 * listEmployee.add(emp2); System.out.println(listEmployee);
		 */

		/*
		 * find the employees whose name starts with k and salary is greater than or
		 * equal to 10k
		 */

		List<String> filteredListEmployee = listEmployee.stream()
				.filter(e -> e.getName().startsWith("k") && e.getSalary() >= 10000).map(i -> i.getName())
				.collect(Collectors.toList());

		filteredListEmployee.stream().forEach(e -> {
			System.out.println(e);
		});
	}

}
