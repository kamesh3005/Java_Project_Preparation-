package Assignment;

public class ReverseAString {

	public static void main(String[] args) {

		String name = "Selenium";
		String rev = " ";
		int len = name.length();
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + name.charAt(i);

		}
		System.out.println(rev);
		System.out.println("***2-Approch*************");

		StringBuffer sb = new StringBuffer(name);
		StringBuffer reverse = sb.reverse();
		System.out.println(reverse);

	}

}
