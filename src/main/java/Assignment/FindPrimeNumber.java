package Assignment;

public class FindPrimeNumber {

	public static void main(String[] args) {

		int num = 11;
		int i = 2;
		boolean prime = true;
		while (i < num) {

			if (num % i == 0) {
				System.out.println("Not prime Number");
				prime = false;
				i++;
			}

		}
		if (prime == true) {

			System.out.println("Prime Number");
		}

	}

}
