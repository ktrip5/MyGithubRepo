package com.sapient.service;

import java.util.Comparator;
import java.util.List;

import com.sapient.valueojbect.Emp;

public interface InterfaceEmp {

	int addEmployee(Emp emp);

	Emp serach(int eid);

	int removeEmp(int eid);

	List<Emp> viewEmployee();

	List<Emp> viewEmployee(Comparator<Emp> c);
}
