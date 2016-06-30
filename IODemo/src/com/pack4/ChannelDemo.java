package com.pack4;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class ChannelDemo {

	public static void main(String[] args) throws IOException {
		FileInputStream infile = new FileInputStream("sapient\\first1.txt");
		FileChannel inchannel = infile.getChannel();
		//creating buffer programitacally
		ByteBuffer buf = ByteBuffer.allocate(1024);
		while (inchannel.read(buf) != -1) {
			buf.flip();
			while (buf.hasRemaining()) {
				System.out.println((char) buf.get());
			}
			buf.clear();

		}
		infile.close();
	}

}
