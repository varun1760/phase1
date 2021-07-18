package lab9.exception.app;

class AgeException extends Exception {
	
	public AgeException() {
		super("Come Again when you are 18+. Thankyou!");
	}
	
	public AgeException(String message) {
		super(message);
	}
	
}

public class CustomeException {

	static void validate(int age) throws AgeException {
		if (age < 18) {
//			throw new AgeException(
//					"You are not Eligible to Vote");
			throw new AgeException();
		}
		else {
			System.out.println("Go Ahead and Vote Please!");
		}
	}
	
	public static void main(String[] args) {
		try {
			validate(15);
		}
		catch(AgeException ae) {
			System.out.println("Exception: " + ae.getMessage());
		}
	}
}