package com.practice.questions;

public class ReverseStringWordsOnly {

	public static void main(String[] args) {
		String str = "Kartik is looking for job change";
		int hashCode1=str.hashCode();
		
		str=str+" Added";
		int hashCode2=str.hashCode();
		System.out.println("HashCode for str "+hashCode1);
		
		System.out.println("HashCode for str changed  "+hashCode2);
		
		System.out.println("Original String -> "+str);
		char[] charArray = str.toCharArray();
		char temp;

		int start = 0, end = str.length() - 1;
		while (start < end) {
			temp = charArray[start];
			charArray[start] = charArray[end];
			charArray[end] = temp;
			start++;
			end--;
		}
		String[] strArray = new String(charArray).split(" ");
		String reversedString = reverseTheString(strArray);
		System.out.println( str);
		System.out.println(reversedString);
	}

	private static String reverseTheString(String[] strArray) {
		String finalString = " ";
		for (String str1 : strArray) {

			int start1 = 0, end1 = str1.length() - 1;
			char[] charArray1 = str1.toCharArray();
			char temp1;
			while (start1 < end1) {
				temp1 = charArray1[start1];
				charArray1[start1] = charArray1[end1];
				charArray1[end1] = temp1;
				start1++;
				end1--;
			}
			finalString = finalString + new String(charArray1) + " ";

		}
		return finalString.trim();
	}

}
