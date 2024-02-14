package practiceday6;

interface shape {

	int length = 10;// default it is final and static no need to mention
	int width = 12;

	void circule();

	default void square() {// it will allow default method

		System.out.println("this is default square method");

	}

	static void rectangle() {// it will allow static method

		System.out.println("This is static rectangle Method");
	}

}

public class InterfaceDemo implements shape {

	@Override
	public void circule() {
		System.out.println("This is circle method");
	}

	
	public static void main(String[] args) {
		InterfaceDemo inf = new InterfaceDemo();
		inf.circule();
		inf.square();
		shape.rectangle();
		System.out.println(shape.length);
		shape sh = new InterfaceDemo();// An interface variable can hold the object of child calss
									// not all the class which eve class can implemented by the interface
										// only the particular class can hold the variable

	}

}
