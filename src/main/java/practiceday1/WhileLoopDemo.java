package practiceday1;

public class WhileLoopDemo {

	public static void main(String[] args) {
		int i = 1;// Initialization
		System.out.println("*******Print num 1 to 10 ********************");

		while (i <= 10) {// condition

			System.out.println(i);

			i++;// incrementation,decrementation
		}

		System.out.println("***********************print Hellow World for 10 times***********");
		i = 1;
		while (i <= 10) {

			System.out.println("Hello World");
			i += 1;
		}
		System.out.println("********Print Even Number between 1 to 10*************");
		i = 2;
		while (i <= 10) {

			System.out.println(i);
			i += 2;
		}

		System.out.println("******* Print the Odd Number bwt 1 t0 10**************************");

		i = 1;
		while (i <= 10) {

			if (i % 2 != 0) {

				System.out.println(i);
			}
			i++;
		}
		System.out.println("**************print num 10 to 1 ***********************");
		i = 10;
		while (i >= 1) {

			System.out.println(i);
			i--;
		}

	}

}
