package practiceday5;

public class MethodOverLoading {

	int x, y, z;
	double a;

	void sum() {
		x = 10;
		y = 12;
		System.out.println(x + y);

	}

	void sum(int p, int q) {
		System.out.println(p * q);

	}

	void sum(int p, double q) {
		System.out.println(p - q);

	}

	void sum(double p, int q) {
		System.out.println(p + q);

	}

	public static void main(String[] args) {

		MethodOverLoading mov = new MethodOverLoading();
		mov.sum();
		mov.sum(10, 7);
		mov.sum(10, 8.4);
		mov.sum(23.0, 190);

	}

}
