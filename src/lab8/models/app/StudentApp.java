package lab8.models.app;

import lab8.models.Results;

//import lab8.models.Marks;
//import lab8.models.Student;

public class StudentApp {

	public static void main(String[] args) {

		Results result = new Results();
		result.acceptDetails();
		result.displayDetails();
		result.calculateResult();
		
//		Student student = new Student();
//		student.acceptDetails();
//		student.displayDetails();

//		Marks marks = new Marks(78, 96);
//		System.out.println(marks);
		
//		Marks marks = new Marks();
//		marks.acceptDetails();
//		marks.displayDetails();
		
//		Student student = new Student();
//		System.out.println(student);
//		Student student2 = new Student(201, "KissMe", 27);
//		System.out.println(student2);
		
	}
}
