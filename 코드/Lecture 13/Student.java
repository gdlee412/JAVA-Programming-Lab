
//generic class
//Type1 extends Number means the first type must be any number type
public class Student<Type1 extends Number, Type2 extends Person> {
	// define these variables as Type for future use
	Type1 StudentID;
	Type2 StudentName;
	Type1 StudentSSN;

	public Student(Type1 SID, Type2 studentName, Type1 SSN) {
		StudentID = SID;
		StudentName = studentName;
		StudentSSN = SSN;
	}

	public Type1 getStudentID() {
		return StudentID;
	}

	public void setStudentID(Type1 studentID) {
		StudentID = studentID;
	}

	public Type2 getStudentName() {
		return StudentName;
	}

	public void setStudentName(Type2 studentName) {
		StudentName = studentName;
	}

	public Type1 getStudentSSN() {
		return StudentSSN;
	}

	public void setStudentSSN(Type1 studentSSN) {
		StudentSSN = studentSSN;
	}



}

class Calc {
//  generic methods
	public static <Type>Type method(Type variable) {
		return variable;
		
	}
}


//run as javac -Xlint Sample.java
//to avoid pitfalls with type parameters
//or input -Xlint in run configuration -> program arguments
class Test {
	public static void main(String[] args) {
		Student student1 = new Student<Integer, Admin>(1, new Admin(), 111);
		student1.setStudentID(1234);
		System.out.println(student1.getStudentID());
		Student student2 = new Student<Double, Employee>(1.1, new Employee(), 11.11);
		student2.setStudentID(1.11);
		System.out.println(student2.getStudentID());

		// array of generic student class
		Student/* <Integer> */ array[] = new Student[100]; // reserve 100 elements (no variable type defined yet)

		array[0] = new Student<Integer, Employee>(0, new Employee(), 123);
		// array[1] = new Student<String>("a") ILLEGAL
		// cannot change data type after the first has been decided
		
		//using generic method
		System.out.println(Calc.<Integer>method(123));
	}
}