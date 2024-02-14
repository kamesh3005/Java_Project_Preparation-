package practiceday2;

public class TestingLoop {

	public static void main(String[] args) {
		for (int i = 0; i <= 10; i++) {
			if (i != 1 && i != 5 && i != 9) {

				System.out.println(i);

			}

		}

		System.out.println("********************************");
		boolean flage = true;
		if (flage) {

			for (int i = 1; i <= 5; i++) {
				System.out.println(i);

			}
		} else {

			for (int i = 10; i > 5; i--) {
				System.out.println(i);

			}
		}

	}

}
