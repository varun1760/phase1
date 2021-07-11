package lab1.package1;

public class AccessModifier {

	public static void main(String[] args) {
		SpecificModifier specific = new SpecificModifier();
		specific.display();		// can use only within package
		specific.displayProtected();	// can use within package and subclass(i.e. extended)
//		specific.displayPrivate();		// can't access private method outside class
	}
}

class SpecificModifier {
	void display() {
		System.out.println("inside display method");
	}
	private void displayPrivate() {
		System.out.println("inside display private method");
	}
	protected void displayProtected() {
		System.out.println("inside display protected method");
	}
}