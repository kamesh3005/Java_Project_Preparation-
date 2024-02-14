package practiceday2;

public class ObjectArray {

	public static void main(String[] args) {

		Object[] ob = new Object[5];
		ob[0] = 12;
		ob[1] = "kamesh";
		ob[2] = 12.901;
		ob[3] = 'A';
		ob[4] = true;
		for (int i = 0; i < ob.length; i++) {

			System.out.println(ob[i]);
		}

	}

}
