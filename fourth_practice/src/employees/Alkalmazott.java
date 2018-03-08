package employees;

public class Alkalmazott {
	 private String name;
	 private Integer salary;
	
	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		if (salary < upperSalary && salary > lowerSalary) {
			return true;
		}
		return false;
	}
	
	
	
	public boolean isBiggerSalary(Alkalmazott otherEmployee) {
		if (salary<otherEmployee.salary) {
			return true;
		}
		return false;
	}
	
	public double getTax() {
		return salary*0.16;
	}
	
	public void raiseSalary(int raise) {
		salary+=raise;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getSalary() {
		return salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return "Név: " + name + ", fizetés: " + salary;
	}
}
