public class EmployeeTest {
	public static void main(String... args) {

		Employee myStaff = new Employee("Timi", "Billy", 200.00);
		Employee myStaff2 = new Employee("Joe", "Greg", 200.00);

		myStaff.setSalary(1200.00);
		myStaff2.setSalary(2600.00);

		//String staff1 = myStaff.getFirstName();
		//String staff2 = myStaff2.getFirstName();

		System.out.printf("%s %s's yearly pay check is %s%n",myStaff.getFirstName(), myStaff.getLastName(), myStaff.yearlySalary());
		System.out.printf("%s %s's yearly pay check is %s%n",myStaff2.getFirstName(), myStaff2.getLastName(), myStaff2.yearlySalary());
		System.out.printf("%s %s's 10 percent increased yearly pay check is %s%n",myStaff.getFirstName(), myStaff.getLastName(), myStaff.increaseYearlySalary());
		System.out.printf("%s %s's 10 percent increased yearly pay check is %s%n",myStaff2.getFirstName(), myStaff2.getLastName(), myStaff2.increaseYearlySalary());


}

}