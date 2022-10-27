
public class StudentData {

	private String studentName;
	private int studentID;
	private int studentAge;
	//static variables
	private static String college = "";
	//static method
	//static methods can its own code or static fields only
	//non-static can access static field
	public static void SetCollege(String College)
	{
		college = College;
		//studentAge = 12; will not work
		
	}
	
	//can create constructor through source -> generate constructor through fields 
	public StudentData() {
		//studentName = "None";
		this.SetStudentName("None");
		studentID = 10000;
		//studentAge = 0;
		this.SetAge(0);
	}

	//constructor overloading
	public StudentData(String studentName, int studentID, int studentAge)
	{
		//using this.variable to define the field variable
		//this only works for non-static variables
		//"this" is used when you want a meaningful parameter name which is identical to the field variable
		this.studentName = studentName;
		this.studentID = studentID;
		//this.studentAge = studentAge;
		this.SetAge(studentAge);
	}
	
	//get methods -> returns the given value needed
	//often called the accessor methods or query methods
	public String getStudentName()
	{
		return this.studentName;
	}
	
	public int getStudentAge()
	{
		return this.studentAge;
	}
	
	public int getStudentID()
	{
		return this.studentID;
	}
	//set method -> generates / receives / sets the variable's contents
	//called the mutator methods since they can modify the values of the variables
	public void SetStudentName(String studentName)
	{
		this.studentName = studentName;
	}
	
	public void SetAge(int studentAge)
	{
		if(studentAge > 0)
		{
			this.studentAge = studentAge;
		}
		else
		{
			System.out.println("Error, you cannot assign 0 or negative values.");
		}
	}
	//toString method
	//when it exists and the entire object was called to print, this will automatically print
	public String toString()
	{
		String info = "";
		
		info = info + this.studentName + " \n"
				+ this.studentID + " \n"
				+ this.studentAge + "\n"
				+ college + "\n"
				+ "This info is from toString() method";
		
		return info;
	}
}
