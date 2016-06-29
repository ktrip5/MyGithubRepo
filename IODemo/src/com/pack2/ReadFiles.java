package com.pack2;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadFiles {

	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("sapient\\first.txt");
		BufferedInputStream bis=new BufferedInputStream(fis);
		int ch=0;
		while((ch=bis.read())!=-1){
			System.out.print((char)ch);
		}

		bis.close();
		fis.close();
	}

}
