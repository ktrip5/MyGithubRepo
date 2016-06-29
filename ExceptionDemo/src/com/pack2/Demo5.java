package com.pack2;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class Demo5 {

	public static void main(String[] args) {

	}

	public static int readData() {

		// no need to bring finally block (jdk 1.7 version provided the opening
		// of
		// bufferreader in parenthesis of try block )
		try (BufferedReader br = new BufferedReader(new FileReader("abc.txt"))) {
			System.out.println(br.readLine());
		} catch (

		FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		/*
		 * finally { closeStream(br); closeStream(fr);
		 * 
		 * }
		 */
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
