package com.pratice.uzio;

import java.util.HashMap;
import java.util.Map;

public class DriverClass {

	public static void main(String[] args) {

		PraticeDemo obj = new PraticeDemo();
		PraticeDemo obj1 = new PraticeDemo();

		obj.setPracticeID(10);
		obj1.setPracticeID(20);
		
		//System.out.println(obj.hashCode());
		//System.out.println(obj1.hashCode());

		Map<PraticeDemo, String> hMap = new HashMap<PraticeDemo, String>();
		hMap.put(obj, "Kartik");
		hMap.put(obj1, "Tripathi");

		System.out.println(hMap.get(obj));
		System.out.println(hMap.get(obj1));

		obj.setPracticeID(20);
		obj1.setPracticeID(10);
		
		
		//System.out.println(obj.hashCode());
		//System.out.println(obj1.hashCode());

		hMap.put(obj, "Kartik");
		hMap.put(obj1, "Tripathi");

		System.out.println(hMap.get(obj.practiceID));

		System.out.println(hMap.size());

		/*
		 * for (Map.Entry<PraticeDemo, String> entry : hMap.entrySet()) {
		 * System.out.println(entry.getKey() + " " + "  " + entry.getValue());
		 * 
		 * }
		 */
	}

}
