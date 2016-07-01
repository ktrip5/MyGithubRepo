package com.sapient.service;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sapient.valueojbect.Emp;

public class EmpService implements InterfaceEmp {
	private static Map<Integer, Emp> emap;
	static {
		emap = new HashMap<Integer, Emp>();
		emap.put(1007, new Emp(1007, "ram", 9000));
		emap.put(1023, new Emp(1023, "pram", 19000));
		emap.put(1029, new Emp(1029, "kram", 96700));
		emap.put(1017, new Emp(1017, "oram", 91000));
	}

	@Override
	public int addEmployee(Emp emp) {
		emap.put(emp.getEid(), emp);

		return 1;
	}

	@Override
	public Emp serach(int eid) {
		Emp emp = emap.get(eid);
		return emp;
	}

	@Override
	public int removeEmp(int eid) {
		if (emap.containsKey(eid)) {
			emap.remove(eid);
			return 1;
		} else
			return 0;
	}

	@Override
	public List<Emp> viewEmployee() {
		List<Emp> lst = getList();
		Collections.sort(lst);
		return lst;
	}

	@Override
	public List<Emp> viewEmployee(Comparator<Emp> c) {

		List<Emp> lst = getList();
		Collections.sort(lst,c);
		return lst;
	}

	public List<Emp> getList() {
		List<Emp> lst = new ArrayList<Emp>();
		Collection<Emp> col = emap.values();
		lst.addAll(col);
		return lst;

	}

}
