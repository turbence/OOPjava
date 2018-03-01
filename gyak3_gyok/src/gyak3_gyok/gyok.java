package gyak3_gyok;

import java.util.Scanner;


public class gyok {
	public static void main(String[] args) {
		int size = 10;
		double multiply = 1;
		double geometric = 0.0;
		double[] array = new double[size];
		Scanner scanner = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("[" + (i+1) + "] = ");
			array[i] = scanner.nextDouble();
			multiply *= array[i];
		}
		geometric = Math.pow(multiply, (1.0/size));
		System.out.println(geometric);
		scanner.close();
	}
}

