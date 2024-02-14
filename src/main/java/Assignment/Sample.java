package Assignment;

import java.util.Arrays;

public class Sample {

	public static void main(String[] args) {

		String name[] = { "java", "selenium", "java", "python", "oracal" };

		for (int i = 0; i < name.length; i++) {

			for (int j = i + 1; j < name.length; j++) {

				if (name[i] == name[j]) {

					System.out.println("Duplicate element is found :" + name[i]);
				}
			}
		}

	}

}
