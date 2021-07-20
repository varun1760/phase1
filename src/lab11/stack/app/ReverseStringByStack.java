package lab11.stack.app;

import java.util.Stack;

public class ReverseStringByStack {

	public static String reverser(String input) {
		Stack<Character> stack = new Stack<Character>();
		
//		for (int i = 0; i < input.length(); i++) {
//			stack.push(input.charAt(i));
//		}
		
		for (char ch : input.toCharArray()) {
			stack.push(ch);
		}
		
		String reversed = "";
		while (!stack.isEmpty()) {
//			reversed = reversed + stack.pop();
			reversed += stack.pop();
		}
		
		return reversed;
	}
	
	public static void main(String[] args) {
		String originalString = "Communication";
//		String originalString = "abba";
		String reversedString = reverser(originalString);
		System.out.println("Original String: " + originalString);
		System.out.println("Reversed String: " + reversedString);
		
		if(originalString.equals(reversedString)) {
			System.out.println("String is pallindrome");
		} else {
			System.out.println("String is not pallindrome");
		}
	}

}
