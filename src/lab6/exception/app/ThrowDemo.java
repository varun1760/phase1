package lab6.exception.app;

import java.util.Scanner;

public class ThrowDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Balance: ");
		int balance = scan.nextInt();
		System.out.println("Enter Cost: ");
		int cost = scan.nextInt();
		scan.close();
		if (balance < cost) {
			ArithmeticException ae = new ArithmeticException(
					"Insufficient Fund " + balance + 
					" to place order with cost " + cost);
			throw ae;
		}
		balance = balance - cost;
		System.out.println("After successfully placing order"
				+ " balance is: " + balance);
		
		// Handling exception
		
//		try {
//			if (balance < cost) {
//				ArithmeticException ae = new ArithmeticException(
//						"Insufficient Fund " + balance + 
//						"to place order with cost " + cost);
//				throw ae;
//			}
//			balance = balance - cost;
//			System.out.println("After successfully placing order"
//					+ " balance is: " + balance);
//		}
//		catch (ArithmeticException e) {
//			System.out.println("Exception caught: " +e.getMessage());
//		}
	}
}