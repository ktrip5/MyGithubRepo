package com.sapient.beans;

import java.util.Arrays;

public class NewSearcher extends Searcher {

	private int[] nos;

	public NewSearcher(String[] names) {
		super(names);

	}

	public NewSearcher(int[] nos) {
		super();

	}

	public NewSearcher(String[] names, int[] nos) {
		super(names);
		this.nos = nos;
	}

	public void doSearch(String key) {
		
		

	}

	public void doSearch(int key) {

	}

	public void doOldSearch(String key) {

	}

}
