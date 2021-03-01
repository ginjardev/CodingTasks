public class TwelveDaysOfChristmasDoWhile{

	public static void main(String[] args){
		
		int daysOfChristmas = 0;
		int counter = 0; 
		
		String middle = "day of Christmas, my true love sent to me",
			begin = "On the ",
		        dayTwelve = "Twelve drummers drumming",
			dayEleven = "Eleven pipers piping",
			dayTen = "Ten lords a-leaping",
			dayNine = "Nine ladies dancing",
			dayEight = "Eight maids a-milking", 
			daySeven = "Seven swans a-swimming", 
			daySix = "Six geese a-laying", 
			dayFive = "Five golden rings",
			dayFour = "Four calling birds",
			dayThree = "Three french hens", 
			dayTwo = "Two turtle doves, and",
			dayOne = "A partridge in a pear tree";
		
		System.out.println("The Twelve Days of Christmas Lyrics \n");	
		
		do{
			daysOfChristmas++;
			counter++;
			
			switch(daysOfChristmas){
		case 1:
			System.out.println(begin + "first " + middle + "\n" + dayOne + "\n");
			break;
		case 2: 
			System.out.println(begin + "second " + middle + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 3: 
			System.out.println(begin + "third " + middle + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 4: 
			System.out.println(begin + "fourth " + middle + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 5: 
			System.out.println(begin + "fifth " + middle + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 6: 
			System.out.println(begin + "sixth " + middle + "\n" + daySix + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 7: 
			System.out.println(begin + "seventh " + middle + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 8: 
			System.out.println(begin + "eighth " + middle+ "\n" + dayEight + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 9: 
			System.out.println(begin + "ninth " + middle+ "\n" + dayNine + "\n" + dayEight + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 10: 
			System.out.println(begin + "tenth " + middle+ "\n" + dayTen + "\n" + dayNine + "\n" + dayEight + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 11: 
			System.out.println(begin + "eleventh " + middle + "\n"+ dayEleven + "\n" + dayTen + "\n" + dayNine + "\n" + dayEight + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
		case 12: 
			System.out.println(begin + "twelfth " + middle+ "\n" + dayTwelve + "\n"  + dayEleven + "\n" + dayTen + "\n" + dayNine + "\n" + dayEight + "\n" + daySeven + "\n" + dayFive + "\n" + dayFive + "\n" + dayFour + "\n" + dayThree + "\n" + dayTwo + " \n" + dayOne + " \n");
			break;
					}
			} while(counter < 12);
	}


}