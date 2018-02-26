package gyak2_hf;

public class pitagorasz {
	public static void main(String[] args) {
		int no = 0;
		for (int i = 1; i < 100; i++) {
			for (int j = 1; j < 100; j++) {
				for (int k = 1; k < 100; k++) {
					if (((i*i) + (j*j)) == (k*k) && (i<=j)) {
						no++;
						System.out.println(no + ". i = " + i + ", j = " + j + ", k = " + k);
					}
				}
			}
		}
	}
}
