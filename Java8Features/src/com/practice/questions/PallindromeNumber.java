package com.practice.questions;

public class PallindromeNumber {

	public static void main(String[] args) {
		int number = 1331;

		boolean isPallindrom1 = pallindromeNumber1(number);
		boolean isPallindrome = pallindromeNumber(number);

		System.out.println(isPallindrome);
		System.out.println(isPallindrom1);
	}

	private static boolean pallindromeNumber1(Integer number) {
		String numberString = number.toString();
		char[] numberCharArray = numberString.toCharArray();
		int start = 0, end = numberCharArray.length - 1;
		boolean flag = false;
		while (start < end) {
			if (numberCharArray[start] == numberCharArray[end]) {
				flag = true;
				start++;
				end--;
			} else

				flag = false;
			break;
		}
		return flag;
	}

	private static boolean pallindromeNumber(int number) {
		if (number < 0)
			return false;
		int div = 1;
		while (number / div >= 10) {
			div = div * 10;
		}
		while (number != 0) {
			int left = number / div;
			int right = number % 10;
			if (left != right)
				return false;
			number = (number % div) / 10;
			div = div / 100;
		}
		return true;
	}

}
