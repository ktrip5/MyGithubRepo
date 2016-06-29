package com.pack1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDemo {

	public static void main(String[] args) throws IOException {

		File folder = new File("sapient");
		// file instance can not create folder
		if (!folder.exists())
			// this syntax will create folder
			folder.mkdir();
		// for creating file in the above created folder
		FileWriter fw = new FileWriter("sapient\\first.txt");
		// fw.write writes every character one by one
		// so to write data in a chunk way
		// we use bufferedwriter. bufferwriter has it's own buffer and convert character or anything
		// into byte then fw write those data in existing file first.txt
		BufferedWriter bw = new BufferedWriter(fw, 10 * 1024);
		// increasing the size of buffer of bufferedWriter 
		bw.write("kartik is a good guy\n");
		bw.write("he is very intelligent\n");
		bw.close();
		fw.close();
		System.out.println("file created");

	}

}
