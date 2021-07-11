package lab3.innerclass;

public class InnerClassImplement {

	class MyInner implements MyInterface {
		public void print(String name) {
			System.out.println("Hello " + name);
		}
	}

	public static void main(String[] args) {
		MyInner inObj =
				new InnerClassImplement().new MyInner();
		inObj.print("Shalu");
	}
}
