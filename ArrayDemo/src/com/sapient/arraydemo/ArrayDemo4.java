package com.sapient.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo4 {

	public static void main(String[] args) {
		String[] arr = { "ram", "rahim", "radha", "ravan", "raghav" };
		System.out.println("\nenter the name you want bto search\n");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		Arrays.sort(arr);
		int index = Arrays.binarySearch(arr, name);
		System.out.println(index);

	}

}
