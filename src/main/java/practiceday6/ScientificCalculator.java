package practiceday6;

public class ScientificCalculator extends BasicCalculator {

	private int oprand3;

	public ScientificCalculator() {

		System.out.println("Default-constructor from scientific Calculator");
	}

	public ScientificCalculator(int oprand1, int oprand2, int oprand3) {

		super(oprand1, oprand2);
		this.oprand3 = oprand3;

		System.out.println("Parameterized-Constructor from sub-class");
	}

	public int getOprand3() {
		return oprand3;
	}

	public void setOprand3(int oprand3) {
		this.oprand3 = oprand3;
	}

	public int multiple() {

		return getOprand1() * getOprand2() * oprand3;
	}

	public int add() {
		return getOprand1() + getOprand2() + oprand3;
	}

	public void show() {
		printMessage();

	}

	public void printMessage() {

		System.out.println("Message from the Scientfic Calculator");

	}

}
