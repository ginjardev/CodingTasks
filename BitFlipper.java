import java.util.Scanner; 

public class BitFlipper{

	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in); 
	
	int firstNumber;
	int computerOutputOne = 0;
	int computerOutputTwo = 1;

	System.out.println("Enter a number Either 1 or 0 after the prompt");
	firstNumber = userInput.nextInt();
	

	if(firstNumber == 0) {
	System.out.print("Computer output is ");
	System.out.print(computerOutputTwo); 
	}
	else 
		if(firstNumber == 1) {
		System.out.print("Computer output is ");
		System.out.println(computerOutputOne);
	}
       	else {
		System.out.println("choose a binary number");
}

}







}