package Assignment;

import java.util.Arrays;
import java.util.Scanner;

public class FindLargestAndSmallesInArrays {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Array size");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the arr [" + i + "]:");
			arr[i] = sc.nextInt();

		}

		int largest = arr[0];
		int smallest = arr[0];

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] > largest) {

				largest = arr[i];
			}

			else if (arr[i] < smallest) {

				smallest = arr[i];
			}
		}

		System.out.println(" given array is: " + Arrays.toString(arr));
		System.out.println("The largest Array is :" + largest);
		System.out.println("The smallest Array is :" + smallest);

	}
}
