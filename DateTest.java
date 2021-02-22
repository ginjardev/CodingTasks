public class DateTest {

	public static void main(String... args) {

		Date myDate = new Date(16, 02, 2021);
		
		myDate.setDay(17);
		myDate.setMonth(02);
		myDate.setYear(2022);
		
	System.out.print("Bessie's birthday next year is on " + myDate.displayDate());

}


}