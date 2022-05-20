package com.practice.java8.features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;

class Numbers1 {

	public static boolean isMoreThanFifty(int n1, int n2) {
		return (n1 + n2) > 50;
	}

	public static List<Integer> findNumbers(List<Integer> l, BiPredicate<Integer, Integer> p) {
		List<Integer> newList = new ArrayList<>();
		for (Integer i : l) {
			if (p.test(i, i + 10)) {
				newList.add(i);
			}
		}
		return newList;
	}

}

public class MethodReference {

	public static void main(String[] args) {
		List<Integer> listIntegers = Arrays.asList(10, 20, 30, 40, 50, 25, 35, 15);
		List<String> listNames = Arrays.asList("Tripathi", "Kartik");
		listNames.stream().forEach(s -> System.out.println("names in the list-> " + s));
		listNames.stream().forEach(System.out::println);
		listIntegers.stream().forEach(System.out::println);

		System.out.println(Numbers1.findNumbers(listIntegers, Numbers1::isMoreThanFifty));

	}

}
