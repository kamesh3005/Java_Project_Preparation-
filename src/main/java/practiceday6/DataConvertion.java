package practiceday6;

public class DataConvertion {

	public static void main(String[] args) {

		String s1 = "10";
		String s2 = "20";

		System.out.println(Integer.parseInt(s1) + Integer.parseInt(s2));

		System.out.println(s1 + s2);

		String s3 = "10.23";
		String s4 = "20.90";
		System.out.println(s3 + s4);
		System.out.println(Double.parseDouble(s3) + Double.parseDouble(s4));

	}

}
