import java.util.Scanner;

public class Fahrenheit{

	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in); 

	double celsius; 

	
 	System.out.println("Enter temperature in celsius: ");
	celsius = userInput.nextDouble();
	
	double fahrenheit = (9/5) * celsius + 32;
	
	System.out.printf("%.2f Celsius is %.3f in Fahrenheit. ", celsius, fahrenheit);
}


}