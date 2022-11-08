
public class Dog implements Animal, Draw{
	private String type;
	private int age;
	
	public void print() {
		System.out.println("print info of Dog class");

	}
	public void method() {
		 

	}
	@Override
	public String toString() {
		 
		return "dog class toString";
	}
	@Override
	public void SetName(String Name) {	
		
		
	}
	@Override
	public void DrawAnimal() {
		// TODO Auto-generated method stub
		
	}
	
}

class PetDog extends Dog{
	private String owner;
	private String FoodType;
	@Override
	public String toString() {
		 
		return "PetDog class toString";
	}
	
}

class PoliceDog extends PetDog{
	
	private String PoliceID;
	@Override
	public String toString() {
		 
		return "PoliceDog class toString";
	}
	
	public void method() {
		System.out.println("Method of PolicDog class");

	}
}

class Testing {
	
	public static void main(String[] args) {
		Dog dog1 = new Dog(); //upcasting 
		Dog dog2, dog3, dog4 ;
		
		int a = (int) 3.2; // casting
		dog2 =  new PoliceDog();  //upcasting 
		
		dog2.print();
		dog2.method(); 
		System.out.println(dog2.toString());
		
		dog3 = (Dog) new PetDog(); //upcasting 
		
		dog4 = dog3; // upcasting 
		
		// Dog dogobj = new Dog();
		
		//PoliceDog dog5 = (PoliceDog) dogobj;  invalide downcasting
		
		Dog dog5 = new PoliceDog();
		
		PoliceDog dog6 = (PoliceDog)dog5; //valide downcasting
		dog6.method();
	}
}
