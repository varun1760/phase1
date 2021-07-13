package lab5.multithreading;

public class SenderThread extends Thread {
	Sender sender;
	String message;
	public SenderThread(Sender sender, String message) {
		super();
		this.sender = sender;
		this.message = message;
	}
	public void run() {
		// synchronized block
		synchronized (sender) {
			sender.send(message);
		}
		
//		sender.send(message);
	}
	
}
