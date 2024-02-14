package practiceday2;

public class ArrayDemo1 {

	public static void main(String[] args) {
		int[] a, b;
		a = new int[5];
		b = new int[10];
		int arr[] = new int[5];
		String namarr[] = new String[5];
		String name[] = { "kamachi", "Raghu", "ramesh", "kondu", "ram" };
		namarr[0] = "kamesh";
		namarr[1] = "charu";
		namarr[2] = "mani";
		namarr[3] = "kumar";
		namarr[4] = "ravi";
		for (int i = 0; i < namarr.length; i++) {

			System.out.println(namarr[i]);
		}
		System.out.println("**********************************");
		for (int j = 0; j < name.length; j++) {

			System.out.println(name[j]);
		}
	}

}
