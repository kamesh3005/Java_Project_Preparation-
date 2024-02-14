package practiceday3;

public class StringComparation {

	public static void main(String[] args) {
		// String s1 = "kamesh";
		// String s2 = "kamesh";
		// System.out.println(s1 == s2);//true
		// System.out.println(s1.equals(s2));//true
		String s1 = new String("charu");
		String s2 = new String("charu");
		System.out.println(s1 == s2);// false compare the object
		System.out.println(s1.equals(s2));// true compare the value of the object

		String s = "charu";
		String str1 = new String("charu");
		String str = str1;

		System.out.println(s == str1);// false
		System.out.println(s.equals(str1));// true
		System.out.println(str1 == str);// true
		System.out.println(str1.equals(str));// true

		System.out.println("********case3*****************");
		s = "kamesh";
		s2 = new String("kamesh");
		String s3 = s2;
		System.out.println(s == s1);// false
		System.out.println(s.equals(s2));// true
		System.out.println(s2.equals(s3));// true

	}

}
