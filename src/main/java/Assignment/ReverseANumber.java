package Assignment;

public class ReverseANumber {

	public static void main(String[] args) {

		int num = 12345;
		int rev = 0;
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}
		System.out.println(rev);
		
		System.out.println("*****2-Approch****************");
		long nu = 123456;

		StringBuffer sb = new StringBuffer(String.valueOf(nu));
		System.out.println(sb.reverse());

		// System.out.println(new StringBuffer(String.valueOf(nu)).reverse());
	}

}
