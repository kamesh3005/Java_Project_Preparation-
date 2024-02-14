package practiceday5;

public class EmployeeMain {

	public static void main(String[] args) {

		Employee emp = new Employee();
		System.out.println(emp);
		Employee emp1 = new Employee();
		System.out.println(emp1);// implicitly call the toString() method
		System.out.println(emp.getClass());
		Employee emp2 = new Employee(1003, "charumathi", "Developer");
		System.out.println(emp2);
		emp2.setEmpDept("Analysist");
		System.out.println(emp2);

		Employee emp3 = new Employee(1005, "Kumar", "Manager", 89000.32);
		System.out.println(emp3);

	}

}
