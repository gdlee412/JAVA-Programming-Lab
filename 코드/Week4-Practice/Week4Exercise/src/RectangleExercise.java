import java.util.*;

public class RectangleExercise {

	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle();
		Scanner input = new Scanner(System.in);
		while(true){
			System.out.println("1. Set Height");
			System.out.println("2. Set Width");
			System.out.println("3. Exit");
			System.out.print("Choice: ");	
			int userChoice = input.nextInt();
			if(userChoice == 1) {
				System.out.print("Enter height: ");
				float height = input.nextFloat();
				rectangle.setHeight(height);
				System.out.println(rectangle);
			}
			else if(userChoice == 2) {
				System.out.print("Enter width: ");
				float width = input.nextFloat();
				rectangle.setWidth(width);
				System.out.println(rectangle);
			}
			else if(userChoice == 3) {
				System.out.println("Goodbye!");
				break;
			}
			else {
				System.out.println("Error, not a valid choice! Try again!");
			}
		}

	}

}
