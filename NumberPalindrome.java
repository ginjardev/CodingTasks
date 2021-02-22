import java.util.Scanner;
public class NumberPalindrome{
	
	public static void main(String... args){
	
	Scanner userInput = new Scanner(System.in);
		int number1;
		int number2;
		int number3;
	

System.out.println("Enter three digits");
number1 = userInput.nextInt();
number2 = userInput.nextInt();
number3 = userInput.nextInt();

if(number1 == number3) {
	System.out.print("This is a palindrome");
} else { System.out.print("This is not a palindrome"); }

}





}