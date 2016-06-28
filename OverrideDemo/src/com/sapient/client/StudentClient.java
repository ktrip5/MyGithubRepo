package com.sapient.client;

import com.sapient.beans.Student;

public class StudentClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student(1001, "ram", 89);
		Student stu2 = new Student(1001, "ram", 89);
		// implicitally calling object .toString method
		System.out.println(stu);
		System.out.println(stu2);
		System.out.println(stu.equals(stu2));
		stu = null;
		stu2 = null;
		// system.gc doesnt kill the object and free memory it rquests the jvm
		// to free the memory so jvm decides whether to free or not.
		System.gc();
		System.out.println("line 2");
		System.out.println("line 3");
	}

}
