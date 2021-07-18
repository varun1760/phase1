package lab8.models;

public class Sports extends Marks {
	protected int score;
	
	public void acceptDetails() {
		super.acceptDetails();
		System.out.print("Enter Sports Scores: ");
		this.score = scanner.nextInt();	
	}
	
	public void displayDetails() {
		super.displayDetails();
		System.out.println("Sports Score: " +
		this.score);
	}
}
