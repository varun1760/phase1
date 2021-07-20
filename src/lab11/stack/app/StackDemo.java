package lab11.stack.app;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(22);
		stack.push(56);
		stack.push(76);
		stack.push(39);
		System.out.println(stack);
		System.out.println("Poped element: " + stack.pop());
		System.out.println("Element ready to pop: " + stack.peek());
		System.out.println(stack.isEmpty() ? "Stack is empty" 
				: "Stack: " + stack);
	}

}
