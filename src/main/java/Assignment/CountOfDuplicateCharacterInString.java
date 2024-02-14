package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class CountOfDuplicateCharacterInString {

	public static void dublicateCharacter(String str) {

		if (str == null) {

			System.out.println("NULL string");
		}
		if (str.isEmpty()) {

			System.out.println("Empty String");
		}
		if (str.length() == 1) {
			System.out.println("Single char string");
		}

		char[] word = str.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character words : word) {
			if (charMap.containsKey(words)) {
				charMap.put(words, charMap.get(words) + 1);

			} else {

				charMap.put(words, 1);
			}

		}
		Set<Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println(entry.getKey() + ": " + entry.getValue());
			}

		}

	}

	public static void main(String[] args) {
		dublicateCharacter("javaprogramminglanguages");

	}

}
