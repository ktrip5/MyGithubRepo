package com.sapient.beans;

public class Emp {
	private byte age;
	private String name;
	private String company = "Sapient Nitro";

	// getting getter setter method
	public int getAge() {

		return age;
	}

	public void setAge(int age) throws Exception {
		if (age >= 21 && age < 60)
			this.age =(byte) age;
		else
			throw new Exception("age must be in the given limit");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) throws Exception {
		if (name.matches("[A-Z a-z]{3,15}"))
			this.name = name;
		else
			throw new Exception("name must be hav 3 alphabets");
	}

	public String getCompany() {
		return company;
	}

}
