package practiceday5;

public class constructorOverLoadingDemo {
	int x, y, z;
	double d;

	constructorOverLoadingDemo() {

		x = 10;
		y = 16;

	}

	constructorOverLoadingDemo(int a, int b) {
		x = a;
		y = b;

	}

	constructorOverLoadingDemo(int a, double b) {
		z = a;
		d = b;

	}

	constructorOverLoadingDemo(double a, int b) {

		d = a;
		x = b;

	}

	void display() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
		System.out.println(d);

	}

	public static void main(String[] args) {

		constructorOverLoadingDemo ol = new constructorOverLoadingDemo(100, 20.01);
		ol.display();

	}

}
