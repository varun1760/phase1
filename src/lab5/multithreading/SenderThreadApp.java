package lab5.multithreading;

public class SenderThreadApp {

	public static void main(String[] args) {
		
		System.out.println("Start of program");
		Sender sender = new Sender();
		SenderThread t1 = new SenderThread(sender, "Hello");
		SenderThread t2 = new SenderThread(sender, "welcome");
		SenderThread t3 = new SenderThread(sender, "to");
		SenderThread t4 = new SenderThread(sender, "java");
		SenderThread t5 = new SenderThread(sender, "threads");
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		System.out.println("End of program");
	}

}
