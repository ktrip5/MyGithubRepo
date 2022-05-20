package com.practice.questions;

import java.util.Set;
import java.util.TreeSet;

public class FindNextLargestNotPresentinArray {

	public static void main(String[] args) {
		int[] intArray = { 1, 2, 1, 3, 4, 6, 3, 2 };

		Set<Integer> treeSet = new TreeSet<>();

		for (int i : intArray) {
			treeSet.add(i);
		}
		System.out.println(treeSet);
		findMissingNumber(treeSet);
	}

	private static void findMissingNumber(Set<Integer> treeSet) {
		int temp = 1;
		for (int i : treeSet) {
			if (i == temp)
				temp++;
			else
				System.out.println("Missing Number " + temp);
		}

	}

}
