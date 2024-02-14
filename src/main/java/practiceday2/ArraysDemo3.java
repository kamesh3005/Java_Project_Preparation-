package practiceday2;

import java.util.Arrays;

public class ArraysDemo3 {

	public static void main(String[] args) {
		int[] numarr = { 81, 12, 98, 35, 40, 48, 20, 29, 88 };
		String str = Arrays.toString(numarr);
		System.out.println(str);
		for (int i = 0; i < numarr.length; i++) {
			System.out.print(numarr[i] + "  ");
		}
		System.out.println("--------------------------");
		Arrays.sort(numarr);
		for (int i = 0; i < numarr.length; i++) {
			System.out.print(numarr[i] + "  ");
		}

	}

}
