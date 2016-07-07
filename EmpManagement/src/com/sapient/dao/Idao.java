package com.sapient.dao;

import java.util.List;

import com.sapient.exceptions.IdExcepetion;
import com.sapient.exceptions.NotFoundException;
import com.sapient.vo.Emp;

public interface Idao {

	int addEmployee(Emp emp) throws IdExcepetion;

	int updateEmployee(int eid, double sal) throws NotFoundException;

	int removeEmployee(int eid) throws NotFoundException;

	List<Emp> viewEmployee() throws NotFoundException;

	Emp viewEmployee(int eid) throws NotFoundException;

	List<Emp> viewEmployee(String dept) throws NotFoundException;
}
