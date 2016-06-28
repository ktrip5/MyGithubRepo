package com.sapient.arraydemo;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {
	// primitive array
	public static void main(String[] args) {

		// declaration of an array

		int[] arr = new int[5];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Enter the number");
			arr[i] = sc.nextInt();
		}
		// enhnaced for loop
		Arrays.sort(arr);
		for (int val : arr)
			System.out.println(val);
	}

}
