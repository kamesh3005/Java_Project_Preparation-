package practiceday5;

public class Greetings {
	// 1.No parameter no return value
	void greeting1() {

		System.out.println("Hello.....");
	}

	// 2.No parameter return value
	String greeting2() {

		return "Hello welcom all";
	}
	// 3. parameter and no return value

	void greeting3(String name) {

		System.out.println("Hello " + name);
	}

	// 4.Taking the parameter and return the value
	int greeting4(int num1, int num2) {
		return num1 * num2;
	}

}
