package lab5.multithreading;

public class MyRunnable implements Runnable {
	public void run() {
		System.out.println("Thread Practice");
		for (int counter = 0; counter < 10; counter++) {
			try {
				Thread.sleep(250);
			}
			catch (InterruptedException ie){
				ie.printStackTrace();
			}
			
			System.out.println("inside child " + counter);
		}
		System.out.println("End of Practice");
	}
}
