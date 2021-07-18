package lab8.constructors.app;

class Employee{
	public Employee() {
		this(101);
		System.out.println("Default Constructor - Default");
	}
	public Employee(int id) {
		this(102, "KissMiss");
		System.out.println("Parameterized Constructor -"
				+ " One Parameters");
	}
	public Employee(int id , String name) {
		System.out.println("Parameterized Constructor -"
				+ " Two Parameters");
	}
	
}
public class ConstructorChaining1 {

	public static void main(String[] args) {
		Employee employee = new Employee();
	}

}
