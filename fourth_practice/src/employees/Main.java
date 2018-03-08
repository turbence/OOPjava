package employees;

public class Main {
	public static void main(String[] args) {
		Alkalmazott kisgomboc = new Alkalmazott();
		kisgomboc.setName("Devlin");
		kisgomboc.setSalary(0);
		System.out.println(kisgomboc.toString());
		kisgomboc.raiseSalary(500);
		System.out.println(kisgomboc);
		System.out.println(kisgomboc.isBetweenSalary(200, 1000));
		System.out.println(kisgomboc.isBetweenSalary(1000, 2000));
		System.out.println(kisgomboc.getTax());
		Alkalmazott bence = new Alkalmazott();
		bence.setSalary(20000);
		System.out.println(kisgomboc.getName()+" fizetése nagyobb: ");
		
	}
}
