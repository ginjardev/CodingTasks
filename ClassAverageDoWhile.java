import java.util.Scanner;
public class ClassAverageDoWhile{

	public static void main(String[] args){
	
		Scanner userInput = new Scanner(System.in);

		double grades = 0;
		double totalgrades = 0.00;
		double average;
		int count = 0;
		
		System.out.println("Enter students grades below "); 

		do{
			grades = userInput.nextDouble();
			if(grades >= 1 && grades <= 100) {
	
				totalgrades += grades;
		
				count++;	
			}	
			
		}while(count < 10);
		
		average = totalgrades/count;
		System.out.println("The average of all grades is : " + average);
	}

}