package com.sapient.vo;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * this class is vo object binds a row from employee table
 * 
 * @author k_tripathi
 * @version 1.0
 */

public class Emp implements Comparable<Emp> {
	public static SimpleDateFormat sdf = new SimpleDateFormat("dd-MMM-yyyy");
	private int empID;
	private String empName;
	private double empsal;
	private String dept;
	private Date doj;

	/* good practice by doing no argument constructor */
	public Emp() {

	}

	public Emp(int empID, String empName, double empsal, String dept, Date doj) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empsal = empsal;
		this.dept = dept;
		this.doj = doj;
	}

	/**
	 * returns empID
	 * 
	 * @return
	 */

	public int getEmpID() {
		return empID;
	}

	/**
	 * this method sets empID
	 * 
	 * @param empID
	 */

	public void setEmpID(int empID) {
		this.empID = empID;
	}

	/**
	 * returns Employee name
	 * 
	 * @return
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * sets employee name
	 * 
	 * @param empName
	 */

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	/**
	 * returns employee salary
	 * 
	 * @return
	 */

	public double getEmpsal() {
		return empsal;
	}

	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	/**
	 * return get the java.util.Date
	 * 
	 * @return
	 */
	public Date getDoj() {
		return doj;
	}

	/**
	 * this method sets java.util.method
	 * 
	 * @param doj
	 */
	public void setDoj(Date doj) {
		this.doj = doj;
	}

	/**
	 * overridden and diplays employee fields
	 */
	@Override
	public String toString() {

		return empID + " " + empName + " " + empsal + " " + dept + " " + sdf.format(doj);
	}

	/*
	 * it is overridden to check the object based on values in the project and
	 * eliminates the duplicate for HashCollection so included these equals and
	 * hasCode methods
	 */
	@Override
	public boolean equals(Object obj) {
		Emp emp = (Emp) obj;
		if (this.empID == emp.empID && this.empName.equals(emp.empName) && this.empsal == emp.empsal
				&& this.dept.equals(emp.dept) && this.doj.compareTo(emp.doj) == 0)
			return true;
		else
			return false;
	}

	/**
	 * overridden to eliminate duplicate for HashCollection, employee empID is
	 * hash code
	 */
	@Override
	public int hashCode() {

		return empID;
	}

	/*
	 * if the project includes some sorting application then we use comparable
	 */

	/**
	 * this method is implemented to sort based on empID
	 */
	@Override
	public int compareTo(Emp emp) {
		if (this.empID > emp.empID)
			return 1;
		else if (this.empID < emp.empID)
			return -1;
		else
			return 0;

	}

}
