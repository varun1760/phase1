package lab4.arrayprac;

import java.util.Scanner;

public class ArrayDemo1D {

	public static void main(String[] args) {
		
		int []marks;		
		Scanner scan = new Scanner(System.in);
		System.out.println("how many elements?\n");
		int size = scan.nextInt();
		marks = new int[size];
		
		System.out.println("Enter marks:");
		for ( int i = 0; i < marks.length; i++ ) {
			marks[i] = scan.nextInt();
		}
		System.out.println("Array Elements are:");
		for ( int i = 0; i < marks.length; i++ ) {
			System.out.println(marks[i]);
		}
	}
}
