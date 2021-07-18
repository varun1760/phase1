package lab9.exception.app;

public class ThrowDemo {
	
	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException(
					"You are not Eligible to Vote");
		}
		else {
			System.out.println("Go Ahead and Vote Please!");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(17);
		}
		catch(ArithmeticException ae) {
			System.out.println("Exception: " + ae.getMessage());
		}
	}
}
