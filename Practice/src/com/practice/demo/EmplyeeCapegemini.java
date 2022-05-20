package com.practice.demo;


public final class EmplyeeCapegemini{

	private String name;
	private double salary;
	private int id;

	public EmplyeeCapegemini(String name, double salary, int id) {
		super();
		this.name = name;
		this.salary = salary;
		this.id = id;
	}

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "EmplyeeCapegemini [name=" + name + ", salary=" + salary + ", id=" + id + "]";
	}

}
