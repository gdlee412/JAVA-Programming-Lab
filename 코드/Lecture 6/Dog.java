
public class Dog implements Animal, Draw {
	private String type;
	private int age;
	
	public String toString() {
		return "dog class toString";
	}

	@Override
	public void SetName(String Name) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void DrawAnimal() {
		// TODO Auto-generated method stub
		
	}
}

class PetDog extends Dog{
	private String owner;
	private String FoodType;
	
	public String toString() {
		return "petdog class toString";
	}
}

class PoliceDog extends PetDog{
	private String PoliceID;
	public String toString() {
		return "policedog class toString";
	}
}

class Testing {
	public static void main(String[] args) {
		Dog dog1 = new Dog();
		Dog dog2, dog3, dog4;
		
		dog2 = new PoliceDog();
		System.out.println(dog2.toString());
		
		dog3 = new PetDog();
		System.out.println(dog3.toString());
		
		dog4 = dog3; //upcasting
		
		//PoliceDog dog5;
		
		//dog5 = (PoliceDog) new Dog(); 
		//invalid down casting
		
		Dog dog5 = new PoliceDog();

		//valid downcasting
		//downcasting: casting a reference of a super class to its subclasses
		PoliceDog dog6 = (PoliceDog) dog5; 
	}
}