package lab8.constructors.app;

class Person{
	
	int id;
	String name;
	
	public Person() {
		this.id = 101;
		this.name = "KissMiss";
	}
	
	public Person(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public void display() {
		System.out.println("ID: " + id + " Name: " + name);
	}
}

class Customer extends Person {
	
	float amount;

	public Customer() {
		super();
		this.amount = 70500.90f;
	}

	public Customer(int id, String name, float amount) {
		super(id, name);
		this.amount = amount;
	}

	public void display() {
		super.display();
		System.out.println("Amount: " + amount);
	}
	
}
public class ConstructorChaining2 {

	public static void main(String[] args) {
//		Customer customer = new Customer();
//		customer.display();
		
		Customer customer = new Customer(201, "Delta", 90000);
		customer.display();
	}
}
