package lab1.task1;

import java.util.Scanner;

public class MyCalculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double number1 , number2 ;
		char symbol;
		number1 = scan.nextDouble();
		symbol = scan.next().charAt(0);
		number2 = scan.nextDouble();
		scan.close();
		
		Operation operation = new Operation();
		if(symbol == '+') {
			operation.addition(number1, number2);
		}else if(symbol == '-') {
			operation.subtraction(number1, number2);
		}else if(symbol == '/') {
			operation.division(number1, number2);
		}else if(symbol == '*') {
			operation.multiplication(number1, number2);
		}else {
			System.out.println("Wrong Operation.\nThis calculator supports "
					+ "only operations of + , - , / , *");
		}
	}
}

class Operation{
	void addition(double number1 , double number2) {
		double num1 = number1;
		double num2 = number2;
		double result = num1 + num2;
		System.out.println("= " + result);
	}
	void subtraction(double number1 , double number2) {
		double num1 = number1;
		double num2 = number2;
		double result = num1 - num2;
		System.out.println("= " + result);
	}
	void division(double number1 , double number2) {
		double num1 = number1;
		double num2 = number2;
		if(num2 != 0) {
			double result = num1 / num2;	
			System.out.println("= " + result);
		}else{
			System.out.println("denominator can not be zero");
		}
	}
	void multiplication(double number1 , double number2) {
		double num1 = number1;
		double num2 = number2;
		double result = num1 * num2;
		System.out.println("= " + result);
	}
}