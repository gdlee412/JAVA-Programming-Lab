
//import for scanning
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// to store the increasing percentage
		double salaryIncreasePercentage = 0;
		// create scanner for inputs
		Scanner input = new Scanner(System.in);

		// initialize the two employee objects
		Employee firstEmployee = new Employee("John", 600000);
		Employee secondEmployee = new Employee("Mark", 900000);

		// using getInformation to get employee information
		firstEmployee.getInformation();
		secondEmployee.getInformation();

		// getting user input for salary increase percentage
		System.out.println("=======================================");
		System.out.print("Increase salary (in percentage): ");
		salaryIncreasePercentage = input.nextDouble();

		// use increaseSalary to change the salaries and update the tax and insurance
		firstEmployee.increaseSalary(salaryIncreasePercentage);
		secondEmployee.increaseSalary(salaryIncreasePercentage);

		// use getInformation method to print the updated values
		System.out.println("After Salary Increase");
		firstEmployee.getInformation();
		secondEmployee.getInformation();

		// chose scanner
		input.close();
	}

}
