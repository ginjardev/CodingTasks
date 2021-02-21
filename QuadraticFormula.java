import java.lang.Math; 
import java.util.Scanner;

public class QuadraticFormula {
	public static void main(String[] args) {
	
		Scanner userInput = new Scanner(System.in); 
		
		double a;	
		double b;
		double c;
		double d;
		
		double quadraticEquationOne;
		double quadraticEquationTwo;
		double quadraticEquationThree;

		System.out.println("Quadratic Formula Calculator");
		System.out.println("Enter a value for a: ");
			a = userInput.nextDouble();
		
		System.out.println("Enter a value for b: ");
			b = userInput.nextDouble();

		System.out.println("Enter a value for c: ");
			c = userInput.nextDouble();

		d = Math.pow(b,2) -(4*a*c);

		if (d > 0.00) {
			quadraticEquationOne = (-b + Math.sqrt(d))/(2*a);
			quadraticEquationTwo = (-b - Math.sqrt(d))/(2*a);
			System.out.printf("The solution of the algebriac equation is %.2f and %.2f%n", quadraticEquationOne, quadraticEquationTwo);
		} 
		else if (d == 0.00) {
			quadraticEquationThree = -b /(2*a);
			System.out.printf("The solution of the algebriac equation is %.2f%n", quadraticEquationThree);
		}
		else {
			System.out.print("Try out numbers with real roots");
		}


}


}