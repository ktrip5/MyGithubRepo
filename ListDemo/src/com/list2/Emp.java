package com.list2;

public class Emp implements Comparable<Emp> {
	private int eid;
	private String ename;
	private double bal;

	public Emp(int eid, String ename, double bal) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.bal = bal;
	}

	public int getEid() {
		return eid;
	}

	public String getEname() {
		return ename;
	}

	public double getBal() {
		return bal;
	}

	@Override
	public String toString() {

		return eid + " " + ename + " " + bal;
	}

	@Override
	//doing sorting here 
	public int compareTo(Emp emp) {
		if (this.eid > emp.eid)
			return 1;
		else if (this.eid < emp.eid)
			return -1;
		else
			return 0;

	}

}
