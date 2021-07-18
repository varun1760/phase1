package lab8.models;

public class Marks extends Student {
	protected int objectiveMarks;
	protected int subjectiveMarks;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Objective Marks: ");
		this.objectiveMarks = scanner.nextInt();
		System.out.print("Enter Subjective Marks: ");
		this.subjectiveMarks = scanner.nextInt();
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Objective Marks: " +
		this.objectiveMarks);
		System.out.println("Subjective Marks: " +
		this.subjectiveMarks);
	}
	
//	public Marks(int objectiveMarks, int subjectiveMarks) {
//	super();
//	this.objectiveMarks = objectiveMarks;
//	this.subjectiveMarks = subjectiveMarks;
//}
//@Override
//public String toString() {
//	return "Marks [objectiveMarks=" + objectiveMarks + ", subjectiveMarks=" + subjectiveMarks + "]";
//}
}
