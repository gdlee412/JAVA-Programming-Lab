
public class Main {

	public static void main(String[] args) {
		//Operator to declare an object of another class
		ball football = new ball();
		football.color = "blue";
		football.shape = "circle";
		football.size = 15.2f;
		football.Set_Ball_Color("Black");
		football.Set_Ball_Shape("Elipse");
		System.out.println(football.color);
		System.out.println(football.shape);
		System.out.println(football.size);

		
		ball baseball = new ball();
		System.out.println(baseball.color);
		System.out.println(baseball.shape);
		System.out.println(baseball.size);

		
		ball tennis = new ball("yellow", 5.15f, "maybe circle");
		System.out.println(tennis.color);
		System.out.println(tennis.shape);
		System.out.println(tennis.size);

		
	}

}
