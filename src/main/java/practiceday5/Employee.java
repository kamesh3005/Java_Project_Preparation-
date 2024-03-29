package practiceday5;

public class Employee {

	private int empId;
	private String empName;
	private String empDept;
	private double empSalary;

	public Employee() {

		empId = 1001;
		empName = "kamesh";
		empDept = "QA Automation";
		empSalary = 52000;
	}

	public Employee(int empId, String empName, String empDept) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;

	}

	public Employee(int empId, String empName, String empDept, double empSalary) {
		this.empId = empId;
		this.empName = empName;
		this.empDept = empDept;
		// this(empId, empName, empDept);
		this.empSalary = empSalary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empDept=" + empDept + ", empSalary=" + empSalary
				+ "]";
	}

}
