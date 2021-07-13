package lab5.multithreading;

public class MyRunnableApp {

	public static void main(String[] args) {
		System.out.println("Welcome");
		MyRunnable r1 = new MyRunnable();
		Thread thread1 = new Thread(r1);
		thread1.start();
		for (int counter = 0; counter < 10; counter++) {
			try {
				Thread.sleep(400);
			} catch (InterruptedException ie) {
				ie.printStackTrace();
			}
			System.out.println("inside main " + counter);
		}
		System.out.println("End Of Program");
	}

}
