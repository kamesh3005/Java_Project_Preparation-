package practiceday2;

import java.util.Scanner;

public class ArrayDemo2 {

	public static void main(String[] args) {

		int num[] = { 12, 51, 14, 31, 40, 76, 55, 10 };
		for (int number : num) {
			System.out.println(number);
		}
		System.out.println("-----------------------------");
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i] + " is the index position of " + i);

		}
		System.out.println("----------------------------------");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value");
		int m = sc.nextInt();
		int mark[] = new int[m];
		for (int i = 0; i < mark.length; i++) {

			System.out.println("Enter the mark[" + i + "]:");
			mark[i] = sc.nextInt();
		}
		System.out.println("-------------");
		for (int i = 0; i < mark.length; i++) {
			System.out.println(mark[i]);
		}

	}

}
