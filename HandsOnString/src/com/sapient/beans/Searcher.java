package com.sapient.beans;

import java.util.Scanner;

public class Searcher {

	private String[] names;

	public Searcher(String[] names) {
		super();
		if (names.length >= 4)
			this.names = names;
	}

	public void doSearch(String key) {
		for (int i = 0; i < names.length; i++) {
			if (key != null && names.length >= 4)
				System.out.println("name found");
			else
				System.out.println("not found");
		}

	}

}
