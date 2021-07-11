package lab4.arrayprac;

import java.util.Scanner;

public class ArrayDemo2D {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [][]marks;
		
		System.out.println("How many arrays?");
		int n = scan.nextInt();
		marks = new int[n][];
		
		for ( int i = 0; i < n; i++) {
			System.out.println("How many elements in array ["
					+i+"] : ");
			int m = scan.nextInt();
			marks[i] = new int[m];
		}
		
		System.out.println("Enter array elements below:");
		// input to 2d Array elements
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				marks[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Entered Arrays are:");
		// display 2d array elements
		for (int i = 0; i < marks.length; i++) {
			for (int j = 0; j < marks[i].length; j++) {
				System.out.print(marks[i][j] + " ");
			}
			System.out.println();
		}
	}

}
