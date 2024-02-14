package Assignment;

public class LargestOfThreeNumberUsingTernaryOpperator {

	public static void main(String[] args) {

		int a = 20;
		int b = 141;
		int c = 31;
		int largest1 = a > b ? a : b;
		int largest2 = largest1 > c ? largest1 : c;

		System.out.println(largest2);

	}

}
