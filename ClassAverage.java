import java.util.Scanner;
public class ClassAverage {
	
	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in);

	double grades;
	double totalgrades = 0.00;
	double average;
	int count = 0;
	System.out.println("Enter students grades below "); 

	while(count < 10) {
		
		grades = userInput.nextDouble();
		totalgrades += grades;
		System.out.println("this is count: " + count);
		count++;
}
	average = totalgrades/count;
	System.out.println("The average of all grades is : " + average);

	}

}