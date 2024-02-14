package practiceday1;

public class DoWhileDemo {

	public static void main(String[] args) {
		int i = 1;
		System.out.println("*******Print the Num 1 to 10****************");

		do {
			System.out.println(i);
			i++;
		} while (i <= 10);
		System.out.println("***********Print the Num 10 to 01*****************************");
		i = 10;
		do {
			System.out.println(i);
			i--;
		} while (i >= 1);

	}

}
