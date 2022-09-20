//import java util
import java.util.*;

public class Exponent {

	//power of baseNumber to get possiblePowerNumber if it is a power
	static int powerValue;
	
	public static void main(String[] args) {
		//declaring of necessary variables
		int baseNumber;
		int possiblePowerNumber;
		boolean powerDeterminant;	//is possiblePowerNumber a power of baseNumber
		
		//initialize scanner object and request for inputs
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number: ");
		baseNumber = input.nextInt();
		System.out.print("Enter your guessed power of above number: ");
		possiblePowerNumber = input.nextInt();
		
		//determine if it is a power
		powerDeterminant = isPower(baseNumber, possiblePowerNumber);
		
		//print results
		System.out.println("==================================");
		//if boolean is false, just print false
		//else, print power and print true
		if(!powerDeterminant)
		{
			System.out.println("Output: " + powerDeterminant);
		}
		else
		{
			System.out.println("power = " + powerValue);
			System.out.println("Output: " + powerDeterminant);
		}
		
		//close scanner
		input.close();

	}
	
	//method to determine whether possiblePowerNumber is a power of baseNumber
	public static boolean isPower(int baseNumber, int powerNumber)
	{
		//if powerNumber is a power, it will reach 1
		//while loop will therefore continue until powerNumber = 1
		while(powerNumber != 1)
		{
			/*if powerNumber is divisible by baseNumber
			 * do the division and increase powerValue
			 */
			if(isDivisible(baseNumber, powerNumber))
			{
				powerNumber = powerNumber / baseNumber;
				powerValue++;
			}
			//if not divisible, return false
			else
			{
				return false;
			}
		}
		//if while loop exits, return true
		return true;
	}
	
	
	//method to determine whether powerNumber is divisible by baseNumber
	public static boolean isDivisible(int baseNumber, int powerNumber)
	{
		//if the remainder is 0, it means it is divisible
		//so return true
		if((powerNumber % baseNumber) == 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
}
