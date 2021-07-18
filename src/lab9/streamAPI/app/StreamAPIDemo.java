package lab9.streamAPI.app;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class StreamAPIDemo {

	public static void main(String[] args) {
		int[] array = new int[] {1,2,3,4,5};
		for(int i : array) {
			System.out.println(i);
		}
		System.out.println();
		
		int[] array2 = new int[] {11,22,33,44,55};
		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}
		System.out.println();
		
		Stream<Integer> stream = Stream.of(51,42,33,24,15);
		stream.forEach(a -> System.out.println(a));
		System.out.println();
		
		Stream<Integer> stream2 = Stream.of(
				new Integer[] {15,24,33,42,51});
		stream2.forEach(a -> System.out.println(a));
		System.out.println();
		
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(9);
		list.add(8);
		list.add(7);
		list.add(6);
		Stream<Integer> stream3 = list.stream();
		stream3.forEach(b -> System.out.println(b));
		System.out.println();
		
		Stream<Integer> randomNumber = Stream.generate(
				() -> (new Random()).nextInt(100));
		randomNumber.limit(5).forEach(
				c -> System.out.println(c));
	}
}
