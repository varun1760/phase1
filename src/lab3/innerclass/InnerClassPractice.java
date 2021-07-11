package lab3.innerclass;

class OuterLayer{
	
	private class InnerLayer{
		void inMethod() {
			System.out.println("Inner class");
		}
	}
	void outMethod() {
		InnerLayer inLayer = new InnerLayer();
		inLayer.inMethod();
	}
}

public class InnerClassPractice {

	public static void main(String[] args) {
		OuterLayer outLayer = new OuterLayer();
		outLayer.outMethod();
	}

}
