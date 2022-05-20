package com.practice.questions;

public class SortTheIntegerArrayWithSpecialCharacters {

	public static void main(String[] args) {

		char[] arr = { '4', '#', '2', '$', '5', '1', '3', '|' };
		char temp;
		for (int i = 0; i < arr.length; i++) {
			if ((Character.isDigit(arr[i]))) {

				for (int j = i + 1; j < arr.length - 1; j++) {
					if ((Character.isDigit(arr[j]))) {
						if (arr[i] > arr[j]) {
							temp = arr[i];
							arr[i] = arr[j];
							arr[j] = temp;
						}

					}

				}
			}
		}
		for (char c : arr) {
			System.out.print(c);
		}
	}
}
