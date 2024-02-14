package practiceday4;

public class Student {

	int sid;
	String sname;
	char sgrade;

	void show() {

		System.out.println(sid + " " + sname + " " + sgrade);
	}

	void setVale(int id, String name, char grade) {
		sid = id;
		sname = name;
		sgrade = grade;

	}
	Student(int id, String name, char grade) {
		sid = id;
		sname = name;
		sgrade = grade;

	}

}
