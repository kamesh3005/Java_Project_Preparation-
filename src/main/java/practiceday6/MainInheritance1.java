package practiceday6;

public class MainInheritance1 {

	public static void main(String[] args) {

		BasicCalculator basic = new BasicCalculator();
		basic.setOprand1(20);
		basic.setOprand2(10);
		System.out.println(basic.add());
		BasicCalculator.staticMethod();
		ScientificCalculator sc = new ScientificCalculator();
		sc.setOprand1(50);
		sc.setOprand2(40);
		sc.setOprand3(10);
		System.out.println(sc.add());
		System.out.println(sc.multiple());
		sc.show();
		System.out.println(sc.sub());
	}

}
