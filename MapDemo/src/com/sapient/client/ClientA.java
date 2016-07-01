package com.sapient.client;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.sapient.service.InterfaceEmp;
import com.sapient.util.EmpUtil;
import com.sapient.valueojbect.Emp;
import com.sapient.valueojbect.SalComparator;

public class ClientA {

	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		String opt = null;
		int menu = 0;
		do {
			System.out.println("1--add\n 2--- search \n 3--- remove\n 4---view \n5 sortbysalary \n");
			menu = sc.nextInt();
			switch (menu) {
			case 1:
				addEmployee();
				break;
			case 2:
				doSearch();
				break;
			case 4:
				InterfaceEmp serv = EmpUtil.getService();
				List<Emp> lst = serv.viewEmployee();
				viewAll(lst);
				break;
			case 5:
				serv = EmpUtil.getService();
				lst = serv.viewEmployee(new SalComparator());
				viewAll(lst);
				break;
			}
			System.out.println("do you want to continue");
			opt = sc.next();
		} while (opt.equals("y"));

	}

	private static void addEmployee() {
		System.out.println("Enter employee id");
		int eid = sc.nextInt();
		System.out.println("enter employee name");
		String name = sc.next();
		System.out.println("enter salary");
		double sal = sc.nextDouble();
		// best way to send the parameters to methods
		Emp emp = new Emp(eid, name, sal);
		InterfaceEmp serv = EmpUtil.getService();
		int res = serv.addEmployee(emp);
		if (res == 1)
			System.out.println("employee added");
		else
			System.out.println("employee not added");

	}

	public static void viewAll(List<Emp> lst) {
		for (Emp emp : lst)
			System.out.println(emp);
	}

	private static void doSearch() {
		System.out.println("enter emp id");
		int eid = sc.nextInt();
		InterfaceEmp serv = EmpUtil.getService();
		Emp emp = serv.serach(eid);
		if (emp != null)
			System.out.println(emp);
		else
			System.out.println("not found");

	}

}
