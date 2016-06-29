package com.pack3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeSerializeDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// A FileInputStream obtains input bytes from a file in a file system.
		FileInputStream fis = new FileInputStream("student.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student stu = null;
		try {
			while (true) {
				stu = (Student) ois.readObject();
				System.out.println(stu);
			}

		} catch (EOFException ex) {
			System.out.println(ex.getMessage());
		}
		fis.close();
		ois.close();

	}

}
