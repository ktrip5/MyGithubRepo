package com.practice.questions;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

public class FindFrequencyOfNumbers {

	public static void main(String[] args) {
		List<Integer> listInteger = Arrays.asList(1, 2, 2,2, 3, 4, 3, 4, 5, 6, 7, 8, 9, 10, 10, 1, 2, 2);

		Map<Integer, Integer> hmap = new HashMap<>();
		for (Integer intElement : listInteger) {
			if (hmap.containsKey(intElement)) {
				hmap.put(intElement, hmap.get(intElement) + 1);
			} else
				hmap.put(intElement, 1);
		}

		/* find the largest frequency of repeated element */
		Optional<Integer> highestFrequency = hmap.entrySet().stream().map(Map.Entry::getValue)
				.max((i1, i2) -> i1.compareTo(i2));
		System.out.println(highestFrequency);
		if (highestFrequency.isPresent())
			System.out.println("The highest frequency of key will be " + hmap.entrySet().stream()
					.filter(i -> i.getValue().equals(highestFrequency.get())).findFirst().get());
	}

}
