package com.sapient.beans;

public class Student {
	private int sid;
	private String name;
	private int marks;

	public Student(int sid, String name, int marks) {
		super();
		this.sid = sid;
		this.name = name;
		this.marks = marks;
	}

	@Override
	// override the toString method of object class
	public String toString() {
		return sid + " " + name + " " + marks;

	}

	@Override
	public boolean equals(Object obj) {
		Student stud = (Student) obj;
		if (this.sid == stud.sid && this.name.equals(stud.name))
			return true;
		else
			return false;
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println(sid + "garbage collected...");
		super.finalize();
	}

}
