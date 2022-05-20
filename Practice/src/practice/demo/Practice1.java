package practice.demo;

import java.util.HashMap;
import java.util.Map;

public class Practice1 {

	public static void main(String[] args) {

		String str = "Hi Hi Hello Hello There";
		String[] str1 = str.split(" ");
		Map<String, Integer> hMap = new HashMap<>();

		for (String obj : str1) {
			if (hMap.containsKey(obj)) {
				hMap.put(obj, (hMap.get(obj)) + 1);
			} else
				hMap.put(obj, 1);
		}
		System.out.println(hMap);

	}

}