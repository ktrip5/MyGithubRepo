package com.pack1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AppendDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw = new FileWriter("sapient\\first.txt", true);
		BufferedWriter bw = new BufferedWriter(fw, 10 * 1024);
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the text");
		String str = sc.next();
		bw.write("\n" + str + "\n");
		bw.close();
		fw.close();
		System.out.println("text added to existing file ");
	}

}
