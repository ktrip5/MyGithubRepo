package com.pack3;

import java.io.Serializable;

public class Student implements Serializable {
	private int studId;
	//for deserialization use transient modifier
	//private  transient String stuName
	private String stuName;
	private int marks;

	public Student(int studId, String stuName, int marks) {
		super();
		this.studId = studId;
		this.stuName = stuName;
		this.marks = marks;
	}

	@Override
	public String toString() {

		return studId + " " + stuName + " " + marks;
	}

}
