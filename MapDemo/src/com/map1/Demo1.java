package com.map1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Demo1 {

	private static Map<Integer, String> emap;

	static {
		emap = new HashMap<Integer, String>();
		emap.put(1007, "kartik");
		emap.put(1003, "deepak");
		emap.put(1006, "jt");
		emap.put(1009, "kt");
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter id");
		int eid = sc.nextInt();
		String str = emap.get(eid);
		if (str != null)
			System.out.println(str);
		else
			System.out.println("not found");

	}

}
