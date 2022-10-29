import java.util.Scanner;

public class UsingExceptions {
	public static void main(String[] args) {
		int a;
		Scanner input = new Scanner(System.in);
		a = input.nextInt();
		try {
			if (a > 10) {
				// generate some error if the number is more than 10
				throw new testingExc("number is more than 10");
			} else {
				throw new RuntimeException("number is less than 10");
			}
		} catch (testingExc e) {// more specific catch must always come first
			e.printStackTrace();
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		// catch(testingExc | RuntimeException e) multiple catches
	}
}// end class

//user defined exception
class testingExc extends RuntimeException {
	public testingExc(String message) {
		super(message);
	}
}