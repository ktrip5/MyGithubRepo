package com.practice.questions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CalculateAverageSalaryByCompany {

	public static void main(String[] args) {
		Map<String, Double> hMap = new HashMap<String, Double>();
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("Kartik", 10000, "WTC"));
		list.add(new Employee("Arpit", 30000, "Naggaro"));
		list.add(new Employee("Ashutosh", 20000, "Sapient"));
		list.add(new Employee("Priyanka", 20000, "WTC"));
		list.add(new Employee("Hemant", 30000, "Naggaro"));
		list.add(new Employee("Aakriti", 20000, "Sapient"));
		list.add(new Employee("Lisa", 25005, "Sapient"));

		for (Employee e : list) {
			double salary = 0.0;
			double avgSalary = 0.0;
			int count = 0;
			String compName = e.getCompanyName();
			if (!hMap.containsKey(compName)) {
				for (int i = 0; i < list.size(); i++) {

					if (compName.equals(list.get(i).getCompanyName())) {
						salary = salary + list.get(i).getSalary();
						count++;
					}
				}
				avgSalary = salary / count;
				hMap.put(compName, avgSalary);
			}

		}
		System.out.println(hMap);

		System.out.println(list.stream().mapToDouble(Employee::getSalary).average().getAsDouble());
	}
}
