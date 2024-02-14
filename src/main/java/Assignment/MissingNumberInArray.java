package Assignment;

public class MissingNumberInArray {

	public static void main(String[] args) {

		int num[] = { 1, 2,3, 4, 5 ,6,8,9};
		int sum = 0;

		for (int i = 0; i < num.length; i++) {

			sum = sum + num[i];
		}
		System.out.println(sum);

		int sum1 = 0;
		for (int i = 0; i <= 10; i++) {

			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println("Missing number::"+(sum1-sum));
	}

}
