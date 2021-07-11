package lab4.customcompare.app;

import java.util.TreeSet;

import lab4.customcompare.comparator.EmpNameComparator;
import lab4.customcompare.comparator.Employee;

public class EmployeeApp {

	public static void main(String[] args) {
//		EmpIdComparator idComp = new EmpIdComparator();
		EmpNameComparator nameComp = new EmpNameComparator();
		
//		TreeSet<Employee> empSet = new TreeSet<>(idComp);
		TreeSet<Employee> empSet = new TreeSet<>(nameComp);		
		Employee e1 = new Employee(1, "Shalu",
				"shaluvarun@gmail.com");
		Employee e2 = new Employee(2, "Varun",
				"varunshhalu@gmail.com");
		Employee e3 = new Employee(3, "Ankit",
				"ankit@gmail.com");
		Employee e4 = new Employee(1, "Varun",
				"varunshhalu@gmail.com");
		
		empSet.add(e1);
		empSet.add(e2);
		empSet.add(e3);
		empSet.add(e4);
		
		for ( Employee employee : empSet) {
			System.out.println(employee);
		}
	}

}
