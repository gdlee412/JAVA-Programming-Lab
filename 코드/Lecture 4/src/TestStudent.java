//static imports: imports all static members of a class
//imports only one member
//import static packageName.className.staticMemberName;
//imports all static members of the class
//import static packageName.className.*;


public class TestStudent {

	public static void main(String[] args) {
		//both will be Korea Uni, it is a static field so there is no need to use objects
		StudentData.SetCollege("Korea Uni");
		
		StudentData student1 = new StudentData("Tamer", 123456, 30);
		//one static field can be used with all the objects of the same class
		//college SKKU was defined only to Tamer, but Kim YoungJae also has college = SKKU
		//student1.SetCollege("SKKU");
		
		StudentData student2 = new StudentData("Kim Youngjae", 456432, 22);
		//this will update the college, making both students SNU
		//student2.SetCollege("SNU");
		
		//System.out.println(student1.getStudentName());
		//System.out.println(student1.getStudentID());
		//System.out.println(student1.getStudentAge());
		System.out.println(student1);
		System.out.println(student2);
	}

}
