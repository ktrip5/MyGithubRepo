package com.sapient.dao;

public interface Queries {
	String viewAll = "select *from Employees";
	String viewbydept = "select *from Employees where emp_dept=?";
	String viewbyid = "select *from employees where emp_id=?";
	String addemp="insert into Employees values(?,?,?,?,?)";

}
