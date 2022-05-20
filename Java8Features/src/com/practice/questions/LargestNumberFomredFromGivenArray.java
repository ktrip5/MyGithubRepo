package com.practice.questions;

public class LargestNumberFomredFromGivenArray {

	public static void main(String[] args) {
		int[] intArray = { 4, 12, 9, 8 };
		/* output=98421 */

		largetNumberFormed(intArray);
	}

	private static void largetNumberFormed(int[] intArray) 
	{
		String[] strArrayOfNumbers = new String[intArray.length];
		char temp = 0;

		for (int i = 0; i < intArray.length; i++) {
			strArrayOfNumbers[i] = String.valueOf(intArray[i]);
		}

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < strArrayOfNumbers.length; j++) 
		{
			sb.append(strArrayOfNumbers[j]);
		}
		char[] charArrayOfNumberString = sb.toString().toCharArray();

		for (int k = 0; k < charArrayOfNumberString.length; k++) 
		{
			for (int l = k + 1; l <=charArrayOfNumberString.length - 1; l++) {
				if (charArrayOfNumberString[k] < charArrayOfNumberString[l]) {
					temp = charArrayOfNumberString[k];
					charArrayOfNumberString[k] = charArrayOfNumberString[l];
					charArrayOfNumberString[l] = temp;
				}

			}
		}
		System.out.println("Largest Number from given Integer Array is " + new String(charArrayOfNumberString));

	}

}
