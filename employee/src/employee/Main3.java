package employee;

import java.io.PrintWriter;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) { 
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Random rnd = new Random();
		
		Employee[] employees = new Employee[number];
		
		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("Employee" + i, rnd.nextInt(100000), rnd.nextInt(30));
		}
		
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		
		Employee.setPensionageLimit(50);
		
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		
		printWithYearsToPension(employees, 5);
		
		double avg = employees[0].yearsLeftToPension();
		for (int i = 0; i < employees.length; i++) {
			avg+=employees[i].yearsLeftToPension();
		}
		
		avg=avg/number;
		
	}

	private static void printWithYearsToPension(Employee[] employees, int years) {
		for (Employee employee : employees) {
			if (employee.yearsLeftToPension()< years) {
				System.out.println(employee);
			}
		}
	}
}
