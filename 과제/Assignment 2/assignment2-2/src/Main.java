
//import for scanner
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// to store the increasing percentage
		int userInputChoice = 1;
		// create scanner for inputs
		Scanner input = new Scanner(System.in);

		// initialize the two book objects
		Book firstBook = new Book(2343, "Harry Potter", 0);
		Book secondBook = new Book(4434, "Deep Learning", 0);

		// continue looping if userInputChoice = 1
		while (userInputChoice == 1) {
			// initialize the book order number for input
			int bookOrderNum;
			// to receive user input of book ratings
			double bookRatingInput = 0;

			// while loop to continuously ask for input until the right ones are given
			while (true) {
				// print book information using toString method
				System.out.println("=======================================");
				System.out.println("Book 1: " + firstBook);
				System.out.println("===========");
				System.out.println("Book 2: " + secondBook);
				System.out.println("=======================================");

				// ask for user input
				System.out.print("Please select book (order number): ");
				bookOrderNum = input.nextInt();

				// if case to see if book order number exists
				if (bookOrderNum == 1 || bookOrderNum == 2) {
					break;
				} else {
					System.out.println("Error! No such book order number exists. Try again");
				}

			}

			// if 1st book was selected, update its ratings
			if (bookOrderNum == 1) {
				// ask for rating
				System.out.println("You Selected Book: " + firstBook.getBookTitle());
				// ask for bookRatingInput, check this input in the checkRateRange method
				// if checkRateRange returns false, ask for another loop
				do {
					if (!checkRateRange(bookRatingInput)) {
						System.out.println("Error! Rates only range from 0.0 - 5.0. Try again");
					}
					System.out.print("Please enter your rate: ");
					bookRatingInput = input.nextDouble();
				} while (!checkRateRange(bookRatingInput));// loop again if checkRateRange is false
				// update book rate using updateRate method
				firstBook.updateRate(bookRatingInput);

			}
			// due to the previous loop of checking for book existence, the only else choice
			// is the second book
			else {
				// ask for rating
				System.out.println("You Selected Book: " + secondBook.getBookTitle());
				System.out.print("Please enter your rate: ");
				bookRatingInput = input.nextDouble();
				// update book rate using updateRate method
				secondBook.updateRate(bookRatingInput);
			}

			// run a do while to ask for rerun input
			do {
				// if previous input of this loop is not 0 or 1, ask for another input
				if (userInputChoice > 1 || userInputChoice < 0) {
					System.out.println("Error! Wrong input. Please input again.");
				}

				// ask for input whether the user wants to add more rates
				System.out.print("Would you like to rate more (1: yes, 0: no): ");
				userInputChoice = input.nextInt();
			} while (userInputChoice > 1 || userInputChoice < 0);

			// due to while loop condition, if user inputs 1 (yes), loop will continue,
			// if input is 0, loop will end
		}

		// print thank you message to show the exit of while loop
		System.out.println("Thank you so much! Have a great day!");
		// close scanner
		input.close();
	}

	// boolean to check whether the rate is in the range 0 - 5
	public static boolean checkRateRange(double bookRatingInput) {
		// if case, if bookRatingInput is not between 0 and 5, return false
		if (bookRatingInput < 0 || bookRatingInput > 5) {
			return false;
		}
		// else return true
		else {
			return true;
		}
	}
}
