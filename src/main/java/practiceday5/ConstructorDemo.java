package practiceday5;

public class ConstructorDemo {

	int x, y;
	String s;

	ConstructorDemo() {// Default constructor

		x = 100;
		y = 120;
		s = "Welcome";

	}

	ConstructorDemo(int a, int b, String str) {// Parameterized constructor
		x = a;
		y = b;
		s = str;

	}

	void show() {
		System.out.println("X= " + x);
		System.out.println("Y= " + y);
		System.out.println("S= " + s);

	}

	public static void main(String[] args)

	{
		// ConstructorDemo demo = new ConstructorDemo(); invoking default constructor
		ConstructorDemo demo = new ConstructorDemo(120, 901, "Java Application");// invoking parameterized constructor

		demo.show();

	}

}
