package lab11.queue.app;

import java.util.Arrays;

class ArrayQueue {
	private int[] items;
	private int rear;
	private int front;
	private int count;
	
	public ArrayQueue(int capacity) {
		items = new int[capacity];
	}
	
	public void enqueue(int item) {
		if (count == items.length) {
			throw new IllegalStateException();
		}
		items[rear++] = item;
		count++;
	}
	public int dequeue() {
		var item = items[front];
		items[front++] = 0;
		return item;
	}
	
	public String toString() {
		return Arrays.toString(Arrays.copyOfRange(items, front, rear));
	}
}

public class QueueUsingArray {

	public static void main(String[] args) {
		ArrayQueue queue = new ArrayQueue(5);
		queue.enqueue(40);
		queue.enqueue(10);
		queue.enqueue(55);
		System.out.println(queue);
		
		System.out.println("Element Dequeued: " + queue.dequeue());
		System.out.println(queue);
	}

}
