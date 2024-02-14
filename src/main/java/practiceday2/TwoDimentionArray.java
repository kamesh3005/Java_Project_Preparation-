package practiceday2;

public class TwoDimentionArray {

	public static void main(String[] args) {

		int[][] a = new int[3][3];
		a[0][0] = 12;
		a[0][1] = 10;
		a[0][2] = 15;

		a[1][0] = 30;
		a[1][1] = 32;
		a[1][2] = 90;

		a[2][0] = 41;
		a[2][1] = 71;
		a[2][2] = 31;

		// for (int r = 0; r < a.length; r++) {
		// for (int c = 0; c < a[r].length; c++) {
		// System.out.print(a[r][c] + " ");

		// }
		// System.out.println();
		// }

		for (int x[] : a) {
			for (int v : x) {

				System.out.println(v);
			}
		}

	}

}
