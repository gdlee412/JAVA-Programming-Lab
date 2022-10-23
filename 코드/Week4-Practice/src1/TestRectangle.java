import java.util.Iterator;
import java.util.Scanner;

public class TestRectangle
{
	public static void main(String[] args) {
		rectangle object = new rectangle(1, 1);
		Scanner input = new Scanner(System.in);
		boolean flage = true;
		while (flage == true) {
			System.out.println("1. Set Length");
			System.out.println("2. Set Width");
			System.out.println("3. Exit");
			System.out.print("Choice ");
			int userChoice = input.nextInt();
			if(userChoice==1) {
				System.out.print("Enter height: ");
				double userHeight = input.nextDouble();
				object.setHeight(userHeight);
				System.out.println(object);
			}
			
			else if(userChoice==2) {
				System.out.print("Enter width: ");
				double userWidth = input.nextDouble();
				object.setWidth(userWidth);
				System.out.println(object);
			}
			
			else if (userChoice == 3) {
				flage = false;
			}
		}

		System.out.println("Good bye!!");
	}
}
