package lab11.queue.app;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<Integer> queue = new ArrayDeque<>();
		queue.add(11);
		queue.add(22);
		queue.add(33);
		System.out.println(queue);
		System.out.println("Emelent Dequeued: " + queue.remove());
		System.out.println("Element Ready to Deque" + queue.element());
		System.out.println(queue);
	}

}
