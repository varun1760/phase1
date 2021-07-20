package lab11.searching.app;

public class LinearSearchDemo {

	public static int linearSearch(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] numbers = {7 , 55 , 40 , 2 , 35};
		var index = linearSearch(numbers, 55);
		System.out.println(index != -1 ? "Element Found"
				: "Element Not Found");
	}

}
