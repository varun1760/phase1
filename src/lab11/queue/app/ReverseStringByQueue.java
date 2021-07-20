package lab11.queue.app;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Stack;

public class ReverseStringByQueue {

	public static void reverser(Queue<Integer> queue) {
		Stack<Integer> stack = new Stack<Integer>();
		while (!queue.isEmpty()) {
			stack.push(queue.remove());
		}
		while (!stack.isEmpty()) {
			queue.add(stack.pop());
		}
	}
	
	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<Integer>();
		queue.add(22);
		queue.add(47);
		queue.add(80);
		System.out.println("Original Queue: " + queue);
		reverser(queue);
		System.out.println("Reversed Queue: " + queue);
	}
}
