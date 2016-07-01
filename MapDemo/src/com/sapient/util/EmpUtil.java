package com.sapient.util;

import com.sapient.service.EmpService;
import com.sapient.service.InterfaceEmp;

public class EmpUtil {
	private static InterfaceEmp iemp = new EmpService();

	public static InterfaceEmp getService() {
		return iemp;
	}
}
