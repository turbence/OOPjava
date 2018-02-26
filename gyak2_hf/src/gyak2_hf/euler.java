package gyak2_hf;

public class euler {
	public static void main(String[] args) {
		double sum = 1.0000;
		for (int i = 1; i < 15; i++) {
			sum = sum + (1.0/(faktor(i)));
			//System.out.println(sum);
		}
		System.out.println("e= " + sum);
	}
	private static int faktor (int n) {
		int fakt = 1;
		for (int i = 1; i <= n; i++) {
			fakt = fakt * i;
		}
		//System.out.println(fakt);
		return fakt;
	}

}
