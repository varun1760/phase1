package lab5.multithreading;

public class MyThreadApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		MyThread thread1 = new MyThread();
		thread1.start();
		for (int counter = 0; counter < 10; counter++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("inside main " + counter);
		}
		System.out.println("End of the program");
	}

}
