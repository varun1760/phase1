package lab6.exception.customexception;

public class InsufficientFundException extends Exception {
	// no arg constructor
	
	public InsufficientFundException() {
		super();
	}
	// String arg constructor 	
	
	public InsufficientFundException(String message) {
		super(message);
	}
}
