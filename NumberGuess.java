import java.util.Scanner;
public class NumberGuess{

  public static void main(String[] args){
	
	Scanner userInput = new Scanner(System.in); 
	int guessAnswer = 30;
	int userGuess = 0;
	
	
	while(userGuess != guessAnswer){
 
	System.out.print("Guess a random number: ");
	userGuess = userInput.nextInt();

	if(userGuess == guessAnswer){
	System.out.print("You guessed right! \n");
	}
	if(userGuess < guessAnswer){
	System.out.print("Your guess is lower \n");
	}
	if(userGuess > guessAnswer) {
	System.out.print("Your guess is higher \n");
	}

}



}

}