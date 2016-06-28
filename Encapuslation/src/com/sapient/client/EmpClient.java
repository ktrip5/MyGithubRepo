package com.sapient.client;

import com.sapient.beans.Emp;

public class EmpClient {

	public static void main(String[] args) {
		Emp emp = new Emp();
		try {
			emp.setAge(21);
			emp.setName("kartik");
			System.out.println(emp.getAge());
			System.out.println(emp.getName());
			System.out.println(emp.getCompany());
		} catch (Exception e) {
			// if condition fails then try code will through exception exception
			// and due to
			// this exception
			// main method will get stop working and catch block will activated
			// and message will be present
			// e.printStackTrace();
			System.out.println(e.getMessage());
		}

	}

}
