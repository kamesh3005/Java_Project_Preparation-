package practiceday4;

public class StudentMain {

	public static void main(String[] args) {

		System.out.println("Approch 1");
		// Student std = new Student();
		/*
		 * .sid = 1001; std.sname = "John"; std.sgrade = 'A';
		 */

		// System.out.println("Approch 2");
		// std.setVale(1001, "Magesh", 'C');
		Student std = new Student(1001, "GuruRam", 'A');//using constructor 

		std.show();

	}

}
