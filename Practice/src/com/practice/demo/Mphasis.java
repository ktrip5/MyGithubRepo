package com.practice.demo;

import java.util.HashMap;
import java.util.Map;

public class Mphasis {
	public static void main(String[] args) {
		String name = "KartiK";
		Map<String, Integer> hMap = new HashMap<>();

		char[] charArray = name.toCharArray();

		for (char ch : charArray) {
			if (hMap.containsKey(String.valueOf(ch))) {
				hMap.put(String.valueOf(ch), (hMap.get(String.valueOf(ch))) + 1);
			} else
				hMap.put(String.valueOf(String.valueOf(ch)), 1);
		}
		System.out.println(hMap);

	}

}
