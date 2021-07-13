package lab6.exception.app;

import java.util.Scanner;

import lab6.exception.classes.Shopping;
import lab6.exception.customexception.InsufficientFundException;

public class ShoppingApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Shopping shopping = new Shopping();
		
		System.out.println("Enter balance: ");
		int balance = scan.nextInt();
		
		System.out.println("Enter cost: ");
		int cost = scan.nextInt();
		scan.close();
		/*
		 * since throws is top most layer of class so
		 * it is bad practice to use throws.
		 * so instead we should use try catch
		 * */
		try {
			int updatedBalance = shopping.buy(balance, cost);
			System.out.println("Updated balance after your"
					+ " order:\n" + updatedBalance);
		}
		catch(InsufficientFundException ife) {
			ife.printStackTrace();
		}
	}

}
