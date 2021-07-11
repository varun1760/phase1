package lab2;

public class MethodDemo implements MyInterface {
	
	int p, q;	// local variable
	
	MethodDemo(int p, int q){		// parameterized constructor
		this.p = p;		// assigning parametric value of p into local variable p
		this.q = q;
	}

	int add(int a, int b) {
		int c = a + b;
		return c;
	}
	
	double add(double a, int b) {
		double c = a + b;
		return c;
	}
	
	int add(int a, int b, int c) {	// method overloading
		return a + b + c;
	}
	
	public static void main(String[] args) {
		MethodDemo object = new MethodDemo(8, 9);
		
		int result1 = object.add(5, 6);
		System.out.println("Sum of 5 and 6 is " + result1);
		
		double result3 = object.add(5.9, 6);
		System.out.println("Sum of 5.9 and 6 is " + result3);
		
		int result2 = object.add(5, 6, 7);
		System.out.println("Sum of 5 and 6 and 7 is " + result2);
	}

}
