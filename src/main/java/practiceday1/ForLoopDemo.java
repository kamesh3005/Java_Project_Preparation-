package practiceday1;

public class ForLoopDemo {

	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			int sum = 100;
		}
		{
			int j = 100;
		}
		// i and j,sum are declared in side the block - the scope and visibility of the
		// variable is inside the block only
		// System.out.println(i);
		// System.out.println(j);
		// System.out.println(sum);
		// block level variable
		System.out.println("********************************************");

		int count;
		for (count = 10; count <= 15; count++) {

			System.out.println(count);
		}
		System.out.println(count);

		System.out.println("*************************");
		int cout = 1;
		for (; cout < 5; cout++) {
			System.out.println(cout);

		}
		System.out.println(cout);

		System.out.println("-----------------");
		int val = 1;
		for (; val <= 5;) {
			System.out.println(val++);
		}
		System.out.println("-----------------------------------------");
		int counter = 1;
		for (counter = 10; counter <= 14; counter++)
			;
		{
			System.out.println(counter);
		}

		System.out.println("*********print Number in descending order*************");

		for (int i = 10; i >= 0; i--) {
			if (i % 2 != 0) {

				System.out.println(i);
			}
		}

	}

}
