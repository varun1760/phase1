package lab8.models;

import java.util.Scanner;

public class Student {
	private int id;
	private String name;
	private int age;
	
	Scanner scanner = new Scanner(System.in);
	protected void acceptDetails() {
		System.out.print("Enter student ID: ");
		this.id = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Enter student name: ");
		this.name = scanner.nextLine();
		System.out.print("Enter student age: ");
		this.age = scanner.nextInt();
	}
	
	void displayDetails() {
		System.out.println("Student details:");
		System.out.println("ID: " + this.id);
		System.out.println("Name: " + this.name);
		System.out.println("Age: " + this.age);
	}
////	public Student() {
////		super();
////		id = 101;
////		name = "Lovely";
////		age = 26;
////	}
////	public Student(int id, String name, int age) {
////		super();
////		this.id = id;
////		this.name = name;
////		this.age = age;
////	}
////	public int getId() {
////		return id;
////	}
////	public void setId(int id) {
////		this.id = id;
////	}
////	public String getName() {
////		return name;
////	}
////	public void setName(String name) {
////		this.name = name;
////	}
////	public int getAge() {
////		return age;
////	}
////	public void setAge(int age) {
////		this.age = age;
////	}
////	
//////	it print string value of constructor when
//////	called with object otherwise Student object will
//////	print reference
////	
////	@Override
////	public String toString() {
////		return "Student [id=" + id + ", name=" + name +
////				", age=" + age + "]";
//	}
	
}
