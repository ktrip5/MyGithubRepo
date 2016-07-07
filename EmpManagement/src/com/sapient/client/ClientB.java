package com.sapient.client;

import com.sapient.dao.Idao;
import com.sapient.exceptions.NotFoundException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class ClientB {

	public static void main(String[] args) {
		Idao dao = EmpUtil.getDaoInstance();
		try {
			Emp emp = dao.viewEmployee(1003);
			System.out.println(emp);

		} catch (NotFoundException e) {
			EmpUtil.viewLogger().info(e.getMessage());
		}
	}
}
