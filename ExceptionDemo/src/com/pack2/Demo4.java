package com.pack2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo4 {

	public static void main(String[] args) {
		System.out.println(readData());

	}

	public static int readData() {
		BufferedReader br = null;
		FileReader fr = null;
		try {
			fr = new FileReader("abc.txt");
			br = new BufferedReader(fr);
			System.out.println(br.readLine());
			// exception matching is defined like filenoutfound is a sub class
			// of Ioexception class
		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		} finally {
			closeStream(br);
			closeStream(fr);

		}
		return 0;
	}

	public static void closeStream(Reader r) {
		if (r != null)
			try {
				r.close();
			} catch (IOException e) {

				System.out.println(e.getMessage());
			}
	}
}
