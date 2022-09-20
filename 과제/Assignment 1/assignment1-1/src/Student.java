//imports for scanning
import java.util.Scanner;

public class Student 
{
	//declaring the required public variables
	public String studentName;
	public String studentDepartment;
	public int dateOfBirth;
	public int studentAge;
	public float cumulativeGPA;

	//method to receive student information
	public void getStudentInfo()
	{	
		//creating Scanner to obtain input
		Scanner input = new Scanner(System.in);
		
		//requesting student info
		System.out.print("Enter your name: ");
		studentName = input.nextLine();
		System.out.print("Enter your date of birth: ");
		dateOfBirth = input.nextInt();
		System.out.print("Enter your cumulative GPA: ");
		cumulativeGPA = input.nextFloat();
		//nextLine input to get rid of the unnecessary reading of a \n character
		input.nextLine();
		System.out.print("Enter your department: ");
		studentDepartment = input.nextLine();
		
		//closing scanner
		input.close();
	
		//calling of studentAgeCalc method to calculate studentAge of year 2022
		studentAge = studentAgeCalc(dateOfBirth);		
	}
	
	//method to calculate studentAge for the year 2022
	public int studentAgeCalc(int year) 
	{
		//declare age variable
		int age;
		
		//subtract birthYear from 2022 to get age
		age = 2022 - year;
		
		//return the age value
		return age;
	}
}