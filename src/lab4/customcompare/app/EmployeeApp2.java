package lab4.customcompare.app;

import lab4.customcompare.comparator.Employee;

public class EmployeeApp2 {

	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Shalu",
				"shaluvarun@gmail.com");
		Employee e2 = new Employee(101, "Shalu",
				"shaluvarun@gmail.com");
		
		if (e1 == e2) {
			System.out.println("e1 content is same as e2");
		}
		else {
			System.out.println("e1 content is not same as e2");
		}
		
		if (e1.equals(e2)) {
			System.out.println("e1 content is same as e2");
		}
		else {
			System.out.println("e1 content is not same as e2");
		}
	}

}
