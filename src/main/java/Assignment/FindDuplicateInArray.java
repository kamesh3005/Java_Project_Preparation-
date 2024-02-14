package Assignment;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class FindDuplicateInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] str = { "java", "selenium", "java", "python", "oracal", "selenium", "mangoDb" };
		for (int i = 0; i < str.length; i++) {
			for (int j = i + 1; j < str.length; j++) {

				if (str[i].equals(str[j])) {
					System.out.println("Duplicate element is :: " + str[i]);

				}
			}

		}

		System.out.println("*******Using HashSet to find Duplicate*********************");
		// Set store unique value only
		Set<String> store = new HashSet<>();
		for (String a : str) {
			if (store.add(a) == false) {

				System.out.println("Duplicate element is ::" + a);
			}
		}

		System.out.println("***********Using Hash Map*****************");

		Map<String, Integer> hp = new HashMap<String, Integer>();
		for (String s : str) {
			Integer count = hp.get(s);

			if (count == null) {
				hp.put(s, 1);
			} else {

				hp.put(s, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = hp.entrySet();
		for (Entry<String, Integer> e : entrySet) {

			if (e.getValue() > 1) {

				System.out.println("duplicate element is :: " + e.getKey());
			}
		}

	}

}
