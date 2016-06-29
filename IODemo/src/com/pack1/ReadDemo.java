package com.pack1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args) {
		String str = null;
		try {
			FileReader fr = new FileReader("sapient\\first.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((str = br.readLine()) != null) {
				System.out.println(str);
			}

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
