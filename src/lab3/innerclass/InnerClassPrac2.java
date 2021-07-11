package lab3.innerclass;

public class InnerClassPrac2 {

	class InnerLayout{
		void display() {
			System.out.println("Displaying Inner Layout");
		}
	}
	void print() {
		InnerLayout inLay = new InnerLayout();
		inLay.display();
	}
	public static void main(String[] args) {
		// indirect accessing non-static inner class
		InnerClassPrac2 object = new InnerClassPrac2();
		object.print();
		
		// direct accessing non-static inner class
		InnerLayout inLayout =
				new InnerClassPrac2().new InnerLayout();
		inLayout.display();
	}

}
