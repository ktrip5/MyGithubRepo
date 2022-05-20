package altemetrik;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Practice {

	public static void main(String[] args) {
		String str = "kartiikk"; // O/P= kkkiiart
		Map<String, Integer> hMap = new HashMap<>();

		calculateFrequency(str, hMap);
	}

	private static void calculateFrequency(String str, Map<String, Integer> hMap) {

		char[] charArray = str.toCharArray();

		for (char c : charArray) {
			if (hMap.containsKey(String.valueOf(c))) {
				hMap.put(String.valueOf(c), (hMap.get(String.valueOf(c)) + 1));
			} else
				hMap.put(String.valueOf(c), 1);
		}
		System.out.println("Unsortded " + hMap);

		Comparator<Map.Entry<String, Integer>> comp = new Comparator<Map.Entry<String, Integer>>() {

			@Override
			public int compare(Entry<String, Integer> o1, Entry<String, Integer> o2) {

				return o2.getValue() - o1.getValue();

			}
		};
		List<Map.Entry<String, Integer>> list = new ArrayList<Map.Entry<String, Integer>>(hMap.entrySet());

		Collections.sort(list, comp);

		System.out.println("Sorted " + list);

		StringBuilder sb = new StringBuilder();

		for (Map.Entry<String, Integer> entry : list) {

			for (int i = 0; i < entry.getValue(); i++) {
				sb.append(entry.getKey());
			}
		}

		System.out.println("Final String : " + sb.toString());
	}

}
