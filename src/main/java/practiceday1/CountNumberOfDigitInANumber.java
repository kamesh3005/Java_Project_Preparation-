package practiceday1;

import java.util.Scanner;

public class CountNumberOfDigitInANumber {
	public static String convertToWords(int number) {
		String result;
		switch (number) {
		case 1:
			result = "One";
			break;
		case 2:
			result = "Two";
			break;
		case 3:
			result = "Three";
			break;
		case 4:
			result = "Four";
			break;
		case 5:
			result = "Five";
			break;
		case 6:
			result = "Six";
			break;
		case 7:
			result = "Seven";
			break;
		case 8:
			result = "Eight";
			break;
		case 9:
			result = "Nine";
			break;
		default:
			result = "Zero";
		}
		return result;
	}

	// Function to count the number of digits in a number
	public static int countDigits(long number) {
		int count = 0;
		while (number != 0) {
			number /= 10;
			count++;
		}
		return count;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a number: ");
		long number = scanner.nextLong();

		int digitCount = countDigits(number);

		String digitCountInWords = convertToWords(digitCount);

		System.out.println("Number of digits: " + digitCountInWords);

		scanner.close();
	}

}
