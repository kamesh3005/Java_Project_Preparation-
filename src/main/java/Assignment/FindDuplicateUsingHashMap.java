package Assignment;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindDuplicateUsingHashMap {

	public static void main(String[] args) {

		String name[] = { "kamesh", "charu", "ravi", "kameshp", "kannan", "kumar", "ravi" };
		Map<String, Integer> hashMap = new HashMap<String, Integer>();
		for (String data : name) {
			Integer count = hashMap.get(data);
			if (count == null) {
				hashMap.put(data, 1);
			} else {

				hashMap.put(data, ++count);
			}
		}
		Set<Entry<String, Integer>> entrySet = hashMap.entrySet();
		for (Entry<String, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {

				System.out.println("duplicate element is ::" + entry.getKey());
			}
		}

	}

}
