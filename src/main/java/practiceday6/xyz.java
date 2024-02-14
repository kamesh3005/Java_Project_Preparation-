package practiceday6;

public class xyz extends PQR implements ABC, MNO {

	@Override
	public void m2() {
		System.out.println("This is m2 method from MNO");
		System.out.println(b);
	}

	@Override
	public void m1() {
		System.out.println("This is m1 method from ABC");
		System.out.println(a);
	}

	public static void main(String[] args) {
		xyz obj = new xyz();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(obj.c);

	}

}
