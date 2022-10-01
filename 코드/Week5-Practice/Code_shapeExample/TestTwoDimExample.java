package shapeExample;

public class TestTwoDimExample {

	public static void main(String[] args) {

		// create an object
		Circle objectCircle = new Circle("Cir One", 3.0);
		Rectangle objectRectangle = new Rectangle("Rec One", 3.0, 4.0);
		Square objectSquare = new Square("Square One", 6.0);

		objectSquare = new Square("Square Two", 4.0);
		System.out.println("Four shapes have been created:");

		// print the object properties
		System.out.println("1." + objectCircle);
		System.out.printf("%s's area is %.2f, radius is %.2f\n", objectCircle.getName(), objectCircle.getArea(),
				objectCircle.getRadius());

		System.out.println("2." + objectRectangle);
		System.out.printf("%s's area is %.2f, width is %.2f, height is is %.2f\n", objectRectangle.getName(),
				objectRectangle.getArea(), objectRectangle.getWidth(), objectRectangle.getHeight());

		System.out.println("3." + objectSquare);
		System.out.printf("%s's area is %.2f, side is %.2f\n", objectSquare.getName(), objectSquare.getArea(),
				objectSquare.getSide());

		System.out.println("4." + objectSquare);
		System.out.printf("%s's area is %.2f\n", objectSquare.getName(), objectSquare.getArea());

		System.out.println();

		// print all circle shape
		System.out.printf("Is %s a TwoDimensionalShape? %s\n", objectRectangle.getName(),
				objectRectangle instanceof TwoDimensionalShape);
		System.out.printf("Is %s a Rectangle? %s\n", objectRectangle.getName(), objectRectangle instanceof Rectangle);
		System.out.printf("Is %s a Square? %s\n", objectSquare.getName(), objectSquare instanceof Square);

		System.out.printf("Is %s a Rectangle? %s \n", objectRectangle.getName(), objectSquare instanceof Rectangle);
		System.out.printf("Is %s a Square? %s\n", objectSquare.getName(), objectSquare instanceof Square);
		System.out.println();

	}

}
