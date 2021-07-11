package lab3.innerclass;

public class AppInterface {

	public static void main(String[] args) {
		// Anonymous Inner class
		MyInterface myInt = new MyInterface() {
			public void print(String name) {
				System.out.println("Hello " + name);
			}
		};
		myInt.print("Shalu");
		
		MyInterface myInt2 = new MyInterface() {
			
			@Override
			public void print(String name) {
				System.out.println("Hello " + name);
			}
		};	
		myInt2.print("varun");
	}
}
