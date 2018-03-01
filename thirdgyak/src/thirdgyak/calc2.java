package thirdgyak;

import java.util.Scanner;
public class calc2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while (true) {
			System.out.println("Add meg az elso szamot:");
			firstNumber = scanner.nextDouble();
			System.out.println("Add meg a második számot:");
			secondNumber = scanner.nextDouble();
			System.out.println("Add meg az operátort:");
			operator = scanner.next();
			calculate(operator, firstNumber, secondNumber);
		}
	}
	public static void calculate(String operator, Double firstNumber, Double secondNumber) {
		System.out.println("Result: ");
		switch (operator) {
		case "-":
			System.out.println(firstNumber - secondNumber);
			break;
		case "+":
			System.out.println(firstNumber + secondNumber);
			break;
		case "*":
			System.out.println(firstNumber * secondNumber);
			break;
		case "/":
			if (!secondNumber.equals(0.0)) {
				System.out.println(firstNumber / secondNumber);
			} else {
				System.out.println("Can't divide by 0.");
			}
			break;
		default:
			System.out.println("Unknown operator");
			break;
		}
		return;
	}
}
