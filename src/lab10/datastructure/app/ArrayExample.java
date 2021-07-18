package lab10.datastructure.app;

class ArrayD{
	int[] items;
	int count;
	public ArrayD(int length) {
		items = new int[length];
	}
	
	public void insert(int item) {
		// if array is full, throw exception
//		if(items.length == count) {
//			throw new ArrayIndexOutOfBoundsException();
//		}
		// if array is full, resize it
		if (items.length == count) {
			// Create new array (twice the size)
//			int[] newItems = new int[items.length*2];
			int[] newItems = new int[count*2];
			// copy all existing element into the new array
			for (int i = 0; i < count; i++) {
				newItems[i] = items[i];
			}
			// set "items" array to this new array
			items = newItems;
		}
		// add the new item at end
//		items[count++] = item;	//or
		items[count] = item;
		count++;
	}
	
	public void removeAt(int index) {
		// validate the index
		if(index < 0 || index >= count) {
			throw new IllegalArgumentException();
		}
		// shift items to left to fill the hole
		for (int i = index; i < count; i++) {
			items[i] = items[i+1];
		}
		count--;
	}
	
	public void print() {
		System.out.println("Printing Element:");
		System.out.println("Array Size: " + items.length);
//		for (int i = 0; i < items.length; i++) {
		for (int i = 0; i < count; i++) {
			System.out.println(items[i]);
		}
	}
}

public class ArrayExample {

	public static void main(String[] args) {
		ArrayD array = new ArrayD(3);
		array.insert(100);
		array.insert(200);
		array.insert(300);
		array.insert(400);
		array.insert(500);
		array.insert(600);
		array.insert(700);
		array.print();
		System.out.println("---------------");
		array.removeAt(2);
		array.print();
	}

}
