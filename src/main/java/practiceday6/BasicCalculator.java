package practiceday6;

public class BasicCalculator {

	private int oprand1;
	private int oprand2;

	public BasicCalculator() {

		System.out.println("Default-Constructor from Basic Calculator class");
	}

	public BasicCalculator(int oprand1, int oprand2) {
		System.out.println("Parameterized-Constructor from Basic Calculator class");
		this.oprand1 = oprand1;
		this.oprand2 = oprand2;

	}

	public int getOprand1() {
		return oprand1;
	}

	public void setOprand1(int oprand1) {
		this.oprand1 = oprand1;
	}

	public int getOprand2() {
		return oprand2;
	}

	public void setOprand2(int oprand2) {
		this.oprand2 = oprand2;
	}

	public static void staticMethod() {
		System.out.println("It is static method");
	}

	public int add() {
		return oprand1 + oprand2;

	}

	public int sub() {

		return oprand1 - oprand2;
	}

	public int div() {

		return oprand1 / oprand2;
	}

	public void printMessage() {

		System.out.println("Hai from the Basic Calculator class");
	}

}
