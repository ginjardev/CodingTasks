import java.util.Scanner;

public class Volume{

	public static void main(String[] args) {
	
	Scanner userInput = new Scanner(System.in); 

	double PIE = 3.14; 
	double radius;
	double length;
	
 	System.out.println("Enter a radius and length: ");
	radius = userInput.nextDouble();
	length = userInput.nextDouble();
	
	double area = (radius * radius) * PIE;
	double volume = area * length;
	
	System.out.printf("Area of  Circle is %.2f%n", area);
	System.out.printf("Volume of  Circle is %.2f%n", volume);
}


}