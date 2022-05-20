package com.practice.questions;

import java.util.Objects;

public class ReverseStringWordsOnlyStringBuilder {

	public static void main(String[] args) {
		String str = "the sky is blue";
		System.out.println("Original String " + str);
		reveseStringWordsOnly(str);

	}

	private static void reveseStringWordsOnly(String str) {
		StringBuilder sb = new StringBuilder();
		String[] strArray = str.split(" ");
		if (Objects.nonNull(str)) {

			for (int i = strArray.length - 1; i >= 0; i--) {
				sb.append(strArray[i] + " ");
			}

		}
		System.out.println("Revereted String  " + (sb.length() == 0 ? "" : sb.substring(0, sb.length() - 1)));

	}

}
