public class Main 
{
	public static void main(String[] args) 
	{
		//create Student object named student
		Student student = new Student();
		//call getStudentInfo method from Student class
		student.getStudentInfo();
		
		//print student information taken from the Student class
		System.out.println("========================");
		System.out.println("Student name: " + student.studentName);
		System.out.println("Student's Age: " + student.studentAge);
		System.out.println("Student's CGPA: " + student.cumulativeGPA);
		System.out.println("Student's department: " + student.studentDepartment);
	}

}
