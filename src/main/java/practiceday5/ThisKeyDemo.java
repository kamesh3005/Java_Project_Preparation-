package practiceday5;

public class ThisKeyDemo {

	int a, b, c;

	ThisKeyDemo(int a, int b, int c) {

		this.a = a;
		this.b = b;
		this.c = c;
	}

	void show() {

		System.out.println(a * (b + c));
	}

	public static void main(String[] args) {

		// ThisKeyDemo th = new ThisKeyDemo();
		ThisKeyDemo th = new ThisKeyDemo(13, 10, 6);
		th.show();

	}

}
