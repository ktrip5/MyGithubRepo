package com.sapient.arraydemo;

import java.util.Arrays;

public class ArrayDemo2 {

	public static void main(String[] args) {
		// class array 
		String[] arr = { "kartik", "tinkal", "sajal", "deepak" };
		Arrays.sort(arr);
		for (String str : arr)
			System.out.println(str);

	}

}
