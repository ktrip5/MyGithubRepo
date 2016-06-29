package com.sapient.beans;

import java.util.Scanner;

public class Searcher {

	private String[] names = { "kartik", "sajal", "deepak", "raghav", "gaurav" };

	public Searcher(String[] names) {
		super();
		if (names.length > 4)
			this.names = names;
	}

	public void doSearch(String key) {
		for (String str : names) {
			if (key.equals(names))
				System.out.println("name found");
		}

	}

}
