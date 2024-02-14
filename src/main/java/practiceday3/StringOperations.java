package practiceday3;

public class StringOperations {

	public static void main(String[] args) {

		String str = "Welcome";
		// String str1 = new String("Welcome to java programming language");
		System.out.println(str);
		// Length of the string
		System.out.println(str.length());
		String s = "welcome to";
		String s2 = " java programming";
		String s3 = "automation";

		// concat of two string join two string
		System.out.println(s + s2 + " " + s3);
		String con = s.concat(s2);
		System.out.println(con);
		System.out.println(con.concat(s3));

		// trim this will remove unwanted spaces in the string
		str = "       automation           ";
		System.out.println(str.length());// 28
		System.out.println(str.trim().length());// 10

		// charAt return on single character base on index
		// index count start from 0
		str = "Charumathi";
		System.out.println(str.charAt(9));// i
		System.out.println(str.charAt(5));// m

		// contains()-return boolean true/false
		System.out.println(str.contains("Cha"));// true
		System.out.println(str.contains("mathi"));// true
		System.out.println(str.contains("charumathi"));// false

		// equal(), equalIgnoreCase---to compare two strings it will return boolean
		// value
		s = "welcome";
		s2 = "WELCOME";
		System.out.println(s.equals(s2));// false
		System.out.println(s.equalsIgnoreCase(s2));// true

		// replace()---replace single multiple character in a string
		s = "welcome to the java selenium automation trainning in selenium";
		System.out.println(s.replace('n', 'X'));
		System.out.println(s.replace("selenium", "java"));

		// substring --------to extract substring from main string
		s = "madurai";
		System.out.println(s.substring(0, 4));// madu
		System.out.println(s.substring(3, 5));// ur

		// split-----divide the string into multiple parts using delimeter

		String a = "kameshkam3094@gmail.com";
		String arr[] = a.split("@");

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		// System.out.println(arr[2]);//ArrayIndexOutOfBoundsException

		// upper case and lowercase character
		s = "WelCoMe";
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());

		String st = "welcom to the world of joy";

		System.out.println(st.toUpperCase());

	}

}
