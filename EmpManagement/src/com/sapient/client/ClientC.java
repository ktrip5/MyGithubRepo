package com.sapient.client;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sapient.dao.Idao;
import com.sapient.exceptions.IdExcepetion;
import com.sapient.exceptions.NotFoundException;
import com.sapient.util.EmpUtil;
import com.sapient.vo.Emp;

public class ClientC {

	public static void main(String[] args) throws ParseException {
		Emp emp = new Emp();
		emp.setEmpID(1100);
		emp.setEmpName("karna");
		emp.setEmpsal(45000);
		emp.setDept("developer");
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-YYY");
		Date dt = sdf.parse("11-MAR-2016");
		emp.setDoj(dt);
		Idao dao = EmpUtil.getDaoInstance();
		try {
			dao.addEmployee(emp);
			EmpUtil.viewLogger().info("row added");
		} catch (IdExcepetion e) {
			EmpUtil.viewLogger().info(e.getMessage());
			
		}
	}

}
