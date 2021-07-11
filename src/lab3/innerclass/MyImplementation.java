package lab3.innerclass;

public class MyImplementation implements MyInterface {

	@Override
	public void print(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String args[]) {
		MyImplementation object = new MyImplementation();
		object.print("Shalu");
	}
}
