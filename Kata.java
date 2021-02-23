/**
calculateAverage(int, int, int): double
calculateGrade(int): String
isEven(int): boolean

**/
public class Kata{
	
	public double calculateAverage(int firstNumber, int secondNumber, int thirdNumber){
	
		double average = (double) (firstNumber + secondNumber + thirdNumber) / 3;
		return average;

}
	public String calculateGrade(int grade) {
	
	if (grade > 90) {
	 	return ("Student got an A"); 
	} else if (grade >= 80) {
		return ("Student got an B");
	} else if (grade >= 70) {
		return ("Student got an c");
	} else if (grade >= 60) {
		return ("Student got an D");
	} else if (grade < 60) {
		return ("Student got an failed!");
	} else {
		return ("try a valid number");
	}
}

	public boolean isEven(int number) {
	if (number % 2 == 0)
	return true;
	else 
	return false;
}

}