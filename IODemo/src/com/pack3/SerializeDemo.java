package com.pack3;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializeDemo implements Serializable {

	public static void main(String[] args) throws IOException {
		// A file output stream is an output stream for writing data to a File
		// or to a FileDescriptor
		FileOutputStream fos = new FileOutputStream("student.txt");
		// An ObjectInputStream deserializes primitive data and objects
		// previously written using an ObjectOutputStream
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		Student stu = new Student(100, "kartik", 100);
		Student stu1 = new Student(101, "deepak", 90);
		Student stu2 = new Student(102, "sajal", 95);
		oos.writeObject(stu);
		oos.writeObject(stu1);
		oos.writeObject(stu2);
		oos.close();
		fos.close();
		System.out.println("Serialized");
	}

}
