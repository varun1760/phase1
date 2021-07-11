package lab4.customcompare.comparable;

public class Person implements Comparable<Person> {

	int id;
	String name;
	String email;

//	public static void main(String[] args) {		
//	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(int id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", email=" + email + "]";
	}

	@Override
	public int compareTo(Person o) {
		System.out.println("Comparing " + this + " with " + o);
//		if(this.id < o.id) {
//			return -1;
//		}
//		else {
//			if(this.id > o.id) {
//				return +1;
//			}
//			else {
//				return 0;
//			}
//		}
		return this.id - o.getId();		// another way
//		return	this.name.compareTo(o.getName());
	}
}
