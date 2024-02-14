package practiceday2;

import java.util.Scanner;

public class LinearSearchDemo {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the element");
		int n = scanner.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < arr.length; i++) {

			System.out.println("Enter the arr[" + i + "]:");
			arr[i] = scanner.nextInt();
		}
		System.out.println("Enter the search element");
		int element = scanner.nextInt();
		boolean found = false;
		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == element) {
				System.out.println("Element found at position at :" + i);
				found = true;
				break;

			}
		}
		if (found == false) {

			System.out.println("Element is not found");
		}

	}

}
