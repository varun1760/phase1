package lab8.models;

public class Results extends Sports {
	private int totalMarks;
	private int averageMarks;
	
	public void calculateResult() {
		this.totalMarks = this.objectiveMarks +
				this.subjectiveMarks + this.score;
		this.averageMarks = totalMarks/3;
		
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Marks: " + averageMarks);
	}
}
