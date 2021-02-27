public class Increment {
	
	public static void main(String[] args) {
	
		int counter = 1;
		
		//question 1
		counter = ++counter + ++counter;
		System.out.println("The answer for question 1 is " + counter);
		
		//question 2
		counter = counter++ + ++counter;
		System.out.println("The answer for question 2 is " + counter);
		
		//question 3
		counter = counter++ + counter++;
		System.out.println("The answer for question 3 is " + counter);
	
		//question 4
		counter = ++counter + counter++;
		System.out.println("The answer for question 4 is " + counter);	
		
	}


}