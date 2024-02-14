package practiceday4;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee emp = new Employee();
		emp.empId = 1001;
		emp.empName = "kamesh";
		emp.empDept = "Engineer";
		emp.empSal = 50000;
		emp.empGender = 'M';
		emp.display();

		System.out.println("***********************************");
		Employee emp1 = new Employee();
		emp1.empId = 1002;
		emp1.empName = "charumathi";
		emp1.empDept = "product Analysist";
		emp1.empSal = 40000;
		emp1.empGender = 'F';
		emp1.display();

	}
}
