package practiceday6;

class A {

	// int a = 100;
	int a;

	void show() {

		System.out.println(a);
	}

}

class B extends A {

	// int b = 150;
	int b;

	void display() {

		System.out.println(b);
	}

}

class C extends B {

	int c;

	void printData() {
		System.out.println(c);
	}
}

public class InheritanceDemo1 {

	public static void main(String[] args)

	{
		B obj = new B();
		obj.a = 100;
		obj.b = 200;

		obj.show();
		obj.display();
		System.out.println("***************************");

		C cobj = new C();
		cobj.a = 51;
		cobj.b = 61;
		cobj.c = 71;
		cobj.show();
		cobj.display();
		cobj.printData();

	}

}
