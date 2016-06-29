package com.pack2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ConsoleDemo {

	public static void main(String[] args) throws IOException {
		//converting byte stream to char stream (console input stream)
		InputStreamReader isr=new InputStreamReader(System.in);
		BufferedReader br =new BufferedReader(isr);
		System.out.println("enter a new line");
		String str=br.readLine();
		System.out.println(str.toUpperCase());
		

	}

}
