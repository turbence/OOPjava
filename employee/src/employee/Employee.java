package employee;

public class Employee {
	private String name;
	private Integer salary;
	private Integer age;
	
	public Employee(String employeeName, int salary, int age) {
		this.age = age;
		name = employeeName;
		this.salary = salary;
	}
	
	public Employee() {
		
	}
	
	public Employee(String name, int age) {
		this.age = age;
		this.name = name;
		salary = 10000 * age;
	}
	
	public int yearsLeftToPension() {
		return pensionAgeLimit - age;
	}
	
	@Override
	public String toString() {
		return name + ", "+ age + " éves" + salary + "ft" + yearsLeftToPension() + "én van nyugdijig";
	}
	
	public void setPensionageLimit(int limit) {
		pensionAgeLimit = limit;
	}
	
	public static Employee hasMoreYearsTillPension(Employee firstEmployee, Employee secondEmployee) {
		if (firstEmployee.yearsLeftToPension()>=secondEmployee.yearsLeftToPension()) {
			return firstEmployee;
		}
		return secondEmployee;
	}
}
