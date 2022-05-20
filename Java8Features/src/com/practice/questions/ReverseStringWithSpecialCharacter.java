package com.practice.questions;

public class ReverseStringWithSpecialCharacter {

	public static void reverse(char str[]) {
		int end = str.length - 1, start = 0;

		while (start < end) {
			if (!Character.isAlphabetic(str[start]))
				start++;
			else if (!Character.isAlphabetic(str[end]))
				end--;

			else {
				char tmp = str[start];
				str[start] = str[end];
				str[end] = tmp;
				start++;
				end--;
			}
		}
	}

	public static void main(String[] args) {
		String str = "Hi!@Kartik,!Tripathi07";
		char[] charArray = str.toCharArray();

		System.out.println("Input string: " + str);
		reverse(charArray);
		String revStr = new String(charArray);

		System.out.println("Output string: " + revStr);

	}

}
