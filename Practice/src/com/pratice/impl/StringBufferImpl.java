package com.pratice.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.practice.demo.EmplyeeCapegemini;

public class StringBufferImpl {

	static Map<String, Integer> hMap = new HashMap<>();

	public static void main(String[] args) {
		EmplyeeCapegemini e1 = new EmplyeeCapegemini("Chirag", 10000, 100);
		EmplyeeCapegemini e2 = new EmplyeeCapegemini("Gaba", 20000, 101);
		EmplyeeCapegemini e3 = new EmplyeeCapegemini("WTC", 50000, 102);

		List<EmplyeeCapegemini> list = new ArrayList<EmplyeeCapegemini>();
		list.add(e3);
		list.add(e2);
		list.add(e1);
		
		System.out.println(list);
	}
}
