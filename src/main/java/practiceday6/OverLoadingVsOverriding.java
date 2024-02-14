package practiceday6;

class Abc {
	void m1(int a) {

		System.out.println(a);
	}

	void m2(int b) {

		System.out.println(b);
	}
}

	class XYZ extends Abc {
		@Override
		void m1(int a) {

			System.out.println(a * a);
		}

		void m2(int a, int b) {
			System.out.println(a + b);

		}
	}



public class OverLoadingVsOverriding {

	public static void main(String[] args)

	{
		XYZ x=new XYZ();
		x.m1(12);
		x.m2(7);
		x.m2(8, 5);
	}

}
