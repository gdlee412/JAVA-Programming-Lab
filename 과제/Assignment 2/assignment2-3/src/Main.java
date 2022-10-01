//import for scanner
import java.util.*;

public class Main {

	public static void main(String[] args) {
		//variable to save choice
		int choice = 1;
		
		//create scanner for input
		Scanner input = new Scanner(System.in);
		
		//ask for input
		System.out.println("=== Welcome to TEACH MATH ===");
		System.out.println("1. Calculate volume of Square Pyramid.");
		System.out.println("2. Calculate volume of Cone.");
		System.out.println("3. Calculate volume of Cylinder.");
		//keep asking for input until input is from 1 - 3
		do {
			//if choice was not within input, ask for input again
			if(choice > 3 || choice < 1) {
				System.out.println("Error! Choose from 1 - 3. Please try again.");
			}
			System.out.print("Enter your choice: ");
			choice = input.nextInt();
		}while(choice > 3 || choice < 1);
		
		//if choice = 1, get square pyramid info
		if(choice == 1)
		{
			//initialize local edge and height variables
			double edge;
			double height;
			
			//ask for edge and height input
			System.out.print("Enter edge of Square Pyramid: ");
			edge = input.nextDouble();
			System.out.print("Enter height of Square Pyramid: ");
			height = input.nextDouble();
			
			//initialize SquarePyramid object
			SquarePyramid squarepyramid = new SquarePyramid(edge, height);
			
			//print volume of SquarePyramid with format
			System.out.printf("Volume of Square Pyramid: %.2f", squarepyramid.calculateVolume(edge, height));
		}
		//if choice = 2, get cone info
		else if(choice == 2)
		{
			//initialize local radius and height variables
			double radius;
			double height;
			
			//ask for edge and height input
			System.out.print("Enter radius of Cone: ");
			radius = input.nextDouble();
			System.out.print("Enter height of Cone: ");
			height = input.nextDouble();
			
			//initialize Cone object
			Cone cone = new Cone(radius, height);
			
			//print volume of Cone with format
			System.out.printf("Volume of Cone: %.2f", cone.calculateVolume(radius, height));
		}
		//else(choice = 3), get cylinder info
		else {
			//initialize local radius and height variables
			double radius;
			double height;
			
			//ask for edge and height input
			System.out.print("Enter radius of Cylinder: ");
			radius = input.nextDouble();
			System.out.print("Enter height of Cylinder: ");
			height = input.nextDouble();
			
			//initialize Cone object
			Cylinder cylinder = new Cylinder(radius, height);
			
			//print volume of Cone with format
			System.out.printf("Volume of Cylnider: %.2f", cylinder.calculateVolume(radius, height));
		}
		
		//close scanner
		input.close();
	}

}
