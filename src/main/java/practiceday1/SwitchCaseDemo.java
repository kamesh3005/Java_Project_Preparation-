package practiceday1;

public class SwitchCaseDemo {

	public static void main(String[] args) {
		int choice = 4;
		// boolean res = true;//Cannot switch on a value of type boolean.
		// Only convertible int values, strings or enum variables are permitted

		switch (choice) {
		case 1:
			System.out.println("One");
			break;

		case 2:
			System.out.println("Two");
			break;
		default:
			System.out.println("Invalid Choice");
			break;
		case 3:
			System.out.println("Three");
			break;

		}

	}

}
