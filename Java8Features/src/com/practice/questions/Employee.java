package com.practice.questions;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

	private String name;
	private double salary;
	private String companyName;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public Employee(String name, double salary, String companyName) {
		super();
		this.name = name;
		this.salary = salary;
		this.companyName = companyName;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", companyName=" + companyName + "]";
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(companyName, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(companyName, other.companyName) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public int compareTo(Employee o) {
		if ((this.getSalary()) - (o.getSalary()) > 0)
			return 1;
		else if ((this.getSalary()) - (o.getSalary()) < 0)
			return -1;
		else
			return 0;
	}

}
