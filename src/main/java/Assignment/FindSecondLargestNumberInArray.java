package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FindSecondLargestNumberInArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the arr size");
		int n = sc.nextInt();
		int[] val = new int[n];
		for (int i = 0; i < val.length; i++) {

			System.out.println("Enter the arr[" + i + "]: ");
			val[i] = sc.nextInt();
		}

		int larArr = val[0];
		int secLar = 0;

		for (int i = 0; i < val.length; i++) {
			if (val[i] > larArr) {
				secLar = larArr;
				larArr = val[i];

			} else if (val[i] > secLar) {
				secLar = val[i];

			}

		}
		System.out.println(Arrays.toString(val));
		System.out.println("Second Largest Number in arr is :" + secLar);

	}

}
