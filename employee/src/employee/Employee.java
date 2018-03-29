package employee;
import java.time.LocalDate;

//K�sz�tsen egy Alkalmazott oszt�lyt n�v, kor �s fizet�s adatokkal.
public class Employee {
	// Legyen egy oszt�lyszint� adattagja a nyugd�jkorhat�r t�rol�s�ra, �rt�ke
	// kezdetben legyen 65.
	private static int pensionAgeLimit = 65;
	private String name;
	private Integer salary;
	private LocalDate birthDate;

	/*
	 * Legyen 2 konstruktora. Az egyik a param�terk�nt kapott n�v, kor �s fizet�s
	 * �rt�kekkel inicializ�lja az adattagokat. A m�siknak csak a nevet �s a kort
	 * kell megadni, a fizet�s 10000*kor.
	 */

	public Employee(String employeeName, int salary, LocalDate birthDate) {
		this.birthDate = birthDate;
		name = employeeName;
		this.salary = salary;
	}

	public Employee() {
		birthDate = LocalDate.now();
		salary = 0;
		name = "";
	}

	public Employee(String name, LocalDate birthDate) {
		this.birthDate = birthDate;
		this.name = name;
		salary = 10000 * (LocalDate.now().getYear() - birthDate.getYear());
	}

	// Legyen met�dusa, amely visszadja h�ny �ve van m�g nyugd�jig.
	public int yearsLeftToPension() {
		return pensionAgeLimit - (LocalDate.now().getYear() - birthDate.getYear());
	}

	// Legyen met�dusa, amely String-be �sszef�zve adja vissza az Alkalmazott
	// adatait, hozz�f�zve a nyugd�jig h�trelev� �veinek sz�m�t is.
	@Override
	public String toString() {
		return name + ", sz�letett: " + birthDate.getYear() + ". " + birthDate.getMonthValue() + ". "
				+ birthDate.getDayOfMonth() + " ," + salary + "ft " + yearsLeftToPension() + "�v van nyugd�jig";
	}

	// Legyen met�dusa, amely a param�terk�nt kapott �rt�kre �ll�tja be a
	// nyugd�jkorhat�rt.
	public static void setPensionageLimit(int limit) {
		pensionAgeLimit = limit;
	}

	// Legyen met�dusa, amely a param�terk�nt kapott k�t Alkalmazott k�z�l azt adja
	// vissza, amelyiknek t�bb �ve van m�g h�tra a nyugd�jig.

	public static Employee hasMoreYearsTillPension(Employee firstEmployee, Employee secondEmployee) {
		if (firstEmployee.yearsLeftToPension() >= secondEmployee.yearsLeftToPension()) {
			return firstEmployee;
		}
		return secondEmployee;
	}

	/*
	 * adjon vissza igazat, ha a fizet�s a param�terk�nt megadott hat�rok k�z� esik,
	 * �s hamisat ha nem; adja vissza a fizetend� ad� �rt�ket, ha az ad�kulcs 16% ;
	 * 
	 * adjon vissza igazat, ha a fizet�s nagyobb, mint egy param�terk�nt megadott
	 * m�sik alkalmazott�.
	 */

	public boolean isBetweenSalary(int lowerSalary, int upperSalary) {
		if (salary < upperSalary && salary > lowerSalary) {
			return true;
		}
		return false;
	}

	public boolean hasBiggerSalary(Employee otherEmployee) {
		if (salary < otherEmployee.salary) {
			return true;
		}
		return false;

	}

	public double getTax() {
		return salary * 0.16;
	}

	public void raiseSalary(int raise) {
		salary += raise;
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

}