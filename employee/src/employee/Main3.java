package employee;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		// K�sz�tsen egy futtathat� oszt�lyt, amely beolvas n sz�m� alkalmazottat egy
		// t�mbbe.
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		Random rnd = new Random();
		Employee[] employees = new Employee[number];

		for (int i = 0; i < employees.length; i++) {
			employees[i] = new Employee("employee" + i, rnd.nextInt(100000), LocalDate.of((1950+rnd.nextInt(70)), 01, 05));
		}

		// �rja ki az alkalmazottak adatait, majd m�dos�tsa a nyugd�jkorhat�rt �s �jra
		// �rja ki az alkalmazottak adatait. 
		System.out.println("initial");
		for (Employee employee : employees) {
			System.out.println(employee);
		}
		Employee.setPensionageLimit(70);
		System.out.println("PensionAgeLimit Changed");
		for (int i = 0; i < employees.length; i++) {
			System.out.println(employees[i]);
		}
		// �rja ki azon alkalmazottak adatait, akiknek 5 �vn�l kevesebb van m�g h�tra
		// nyugd�jig.
		System.out.println("5 �vn�l kevesebb van nyugd�jig");
		printWithYearsToPension(employees, 5);
		// �rja ki azoknak az alkalmazottaknak az adatait, akiknek az �tlagn�l t�bb �ve
		// van m�g h�tra nyugd�jig.
		double avg=employees[0].yearsLeftToPension();
		for (int i = 1; i < employees.length; i++) {
			avg+=employees[i].yearsLeftToPension();
		}
		avg=avg/number;
		System.out.println(avg);
		printWithYearsToPension(employees, avg);
		// Rendezze az alkalmazottak t�mbj�t a nyugd�jig h�tral�v� �vek alapj�n n�vekv�,
		// majd pedig cs�kkent� sorrendbe.

	}
	
	private static void printWithYearsToPension(Employee[] employees, double years) {
		for (Employee employee : employees) {
			if(employee.yearsLeftToPension()<years) {
				System.out.println(employee);
			}
		}
	}

}