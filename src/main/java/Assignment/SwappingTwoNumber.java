package Assignment;

public class SwappingTwoNumber {

	public static void main(String[] args) {
		System.out.println("Swapping using thired variable");
		int a = 10;
		int b = 20;
		System.out.println("Before Swapping: " + a + " " + b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping: " + a + " " + b);
		System.out.println("swapping without using third variable");

		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println(a + " " + b);

		System.out.println("****thired approch**********");
		a = a * b;
		b = a / b;
		a = a / b;
		System.out.println(a + " " + b);

	}

}
