package altemetrik;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterOfString {

	public static void main(String[] args) {

		String str = "kartarik";
		char[] arr = str.toCharArray();
		Map<String, Integer> hMap = new LinkedHashMap<>();
		for (char ch : arr) {
			if (hMap.containsKey(String.valueOf(ch))) {
				hMap.put(String.valueOf(ch), hMap.get(String.valueOf(ch)) + 1);
			} else
				hMap.put(String.valueOf(ch), 1);
		}
		for (Map.Entry<String, Integer> entry : hMap.entrySet()) {
			if (!(entry.getValue() > 1)) {
				System.out.print(entry.getKey());
				break;
			}
		}

	}

}
