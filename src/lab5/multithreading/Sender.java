package lab5.multithreading;

public class Sender {
//	synchronized public void send(String message) {	//synchronized
													//method
	public void send(String message) {
		System.out.println("Sending: " + message);
		
		try {
			Thread.sleep(500);
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
		
		System.out.println("Sent: " + message);
	}
}
