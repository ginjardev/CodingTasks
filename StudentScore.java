import java.util.Scanner;
public class StudentScore{
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);
	int score;
	
	System.out.println("Enter a score for student");
	score = userInput.nextInt(); 

	if(score > 90) {
		System.out.println("Student got A");
	} else if(score >= 80) {
		System.out.println("Student got B");
	} else if(score >= 70) {
		System.out.println("Student got C");
	} else if (score < 70) {
		System.out.println("Student failed");
	}
	  else {
		System.out.println("Student does not have a score!");
	}
}


}


