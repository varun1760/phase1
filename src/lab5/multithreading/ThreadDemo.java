package lab5.multithreading;

public class ThreadDemo {

	public static void main(String[] args) {
		System.out.println("Feel the thread using"
				+ " sleep(time in millies) method of class"
				+ " Thread{}, going to delay execution below.");
		for (int counter = 0; counter < 10; counter++) {
			try {
				Thread.sleep(250);
			}
			catch (InterruptedException ie){
				ie.printStackTrace();
			}
			
			System.out.println(counter);
		}
	}

}
