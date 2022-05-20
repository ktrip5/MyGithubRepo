package practice.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MapProblem {

	public static void main(String[] args) {
		// [“key1”=70, “key2”=30, “key3”=40]

		Map<String, Integer> map1 = new HashMap<>();
		Map<String, Integer> map2 = new HashMap<>();
		map1.put("key1", 20);
		map1.put("key2", 30);
		map2.put("key3", 40);
		map2.put("key1", 50);
		mapMerger(map1, map2);

	}

	private static void mapMerger(Map<String, Integer> map1, Map<String, Integer> map2) {
		Map<String, Integer> hMap = new HashMap<String, Integer>();

		for (Map.Entry<String, Integer> entry : map1.entrySet()) {
			int temp = 0;

			if (map2.containsKey(entry.getKey())) {

				temp = entry.getValue() + map2.get(entry.getKey());
				hMap.put(entry.getKey(), temp);
			}
			else
			hMap.put(entry.getKey(), map1.get(entry.getKey()));

		}

		for (Map.Entry<String, Integer> entry1 : map2.entrySet()) {
			if (!hMap.containsKey(entry1.getKey())) {
				hMap.put(entry1.getKey(), entry1.getValue());
			}
		}
		System.out.println(hMap);

	}

}
