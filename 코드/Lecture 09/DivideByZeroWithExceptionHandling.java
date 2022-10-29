
//Handling ArithmeticExceptions and InputMismatch Exceptions
import java.io.IOException;
import java.util.Scanner;

public class DivideByZeroWithExceptionHandling {

	// demonstrates throwing an exception when a divide-by-zero occurs
	public static int quotient(int numerator, int denominator) throws ArithmeticException {
		return numerator / denominator;
	}// end method quotient

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // scanner for input
		boolean continueLoop = true;// determines if more input is needed

		do {
			try// read two numbers and calculate quotient
			{
				System.out.print("Please enter an integer numerator: ");
				int numerator = scanner.nextInt();

				System.out.print("Please enter an integer denominator: ");
				int denominator = scanner.nextInt();

				int result = quotient(numerator, denominator);
				System.out.printf("\nResilt: %d / %d = %d\n", numerator, denominator, result);

				continueLoop = false; // input successful; end looping
			} // end try
			catch (Exception var) {
				System.out.printf("\nException: %s\n", var);
				scanner.nextLine();
				System.out.println("\nPlease try again.\n");

			} // end catch
			finally {
				System.out.print("\nthis is final");
			}

		} while (continueLoop);// end do while

	}// end main

}// end class
