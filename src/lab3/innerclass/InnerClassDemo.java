package lab3.innerclass;

public class InnerClassDemo {

	static String name = "Shalu";
	
	class InnerClass{
		public void hello() {
			System.out.println("Hello " + name);
		}
	}
	
	static class InnerClassTwo{
		void display() {
			System.out.println("Hey " + name);
		}
	}
	
	public static void main(String[] args) {
		// accessing non static inner class
		// way 1
		System.out.println("Non static Inner Class :"
				+ "(way 1)");
		InnerClassDemo outObj = new InnerClassDemo();
		InnerClassDemo.InnerClass inObj = 
				outObj.new InnerClass();
		inObj.hello();
		// way 2
		System.out.println("Non static Inner Class :"
				+ "(way 2)");
		InnerClass inObj2 =
				new InnerClassDemo().new InnerClass();
		inObj2.hello();
		
		System.out.println();
		// accessing static inner class
		// way 1
		System.out.println("static Inner Class :(way 1)");
		InnerClassDemo.InnerClassTwo inObj3 = 
				new InnerClassDemo.InnerClassTwo();
		inObj3.display();
		// way 2
		System.out.println("static Inner Class :(way 2)");
		InnerClassTwo inObj4 = new InnerClassTwo();
		inObj4.display();
	}
}