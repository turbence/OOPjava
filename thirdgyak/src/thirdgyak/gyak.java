package thirdgyak;

import java.util.Scanner;

public class gyak {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String calculation;
		Double firstNumber;
		Double secondNumber;
		String operator;
		while (true) {
			calculation = scanner.nextLine();
			firstNumber = Double.parseDouble(calculation.split(" ")[0]);
			secondNumber = Double.parseDouble(calculation.split(" ")[2]);
			operator = calculation.split(" ")[1];
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