//import for needed classes
import java.util.*;

public class KaiBaiBo 
{
	//public static int array to track scores throughout the code
	static int [] scoreTracker = new int[2]; // [0]: user's score; [1]: computer's score
	
	public static void main(String[] args) 
	{
		//declaring needed variables
		int computerChoice;
		int userChoice;

		//creating scanner to obtain input
		Scanner input = new Scanner(System.in);
		System.out.println("Let's play Kai-Bai-Bo(scissors, rock, paper)");
		//three round loop
		for(int roundNumber = 1; roundNumber <= 3; roundNumber++)
		{
			//request for user input
			System.out.println("Round " + roundNumber);
			System.out.println("Kai-Bai-Bo!");
			System.out.println("1. Kai (scissors)\n2. Bai (rock)\n3. Bo (paper)");
			System.out.print("Your choice: ");
			userChoice = input.nextInt();
			//method call on getComputerChoice
			computerChoice = getComputerChoice();
			//if choice is between 1 and 3
			if(userChoice >= 1 && userChoice <= 3)
			{
				//get choices through changeChoiceToObject
				//use decidingWinner to decide the winner
				System.out.print("You: ");
				changeChoiceToObject(userChoice);
				System.out.print("Computer: ");
				changeChoiceToObject(computerChoice);
				
				decidingWinner(userChoice, computerChoice);
			}
			//if choice is not applicable, go back to the same round for another input
			else
			{
				System.out.println("Wrong input! Please try again!");
				//subtract round to counter for the roundNumber++ in for loop
				roundNumber--;	
			}
			
			
		} 
		
		//print out final results
		System.out.println("You " + scoreTracker[0] + " : " + scoreTracker[1] + " Computer");
		System.out.print("Final Winner: ");
		if(scoreTracker[0] == scoreTracker[1])
		{
			System.out.println("A Tie!!");
		}
		else if(scoreTracker[0] > scoreTracker[1])
		{
			System.out.println("You!");
		}
		else
		{
			System.out.println("Computer!");
		}
		
		//close scanner
		input.close();
	}
	
	//method to randomly generate Computer's choice
	public static int getComputerChoice()
	{
		//initialize random Object
		Random randomGenerator = new Random();
		
		//randomly generate computer's choice from 1 - 3
		int computerChoice = randomGenerator.nextInt(3) + 1;
		
		//return computerChoice
		return computerChoice;
	}
	
	//method to change the numerical choice to their corresponding object
	public static void changeChoiceToObject(int choice)
	{
		//use if else to change to object
		if(choice == 1)
		{
			System.out.println("Scissors");
		}
		else if(choice == 2)
		{
			System.out.println("Rock");
		}
		else
		{
			System.out.println("Paper");
		}
	}
	
	//method to decide the winner
	public static void decidingWinner(int choice1, int choice2)
	{
		//if for tied case
		if(choice1 == choice2)
		{
			System.out.println("Tie");
			System.out.println("========================");
		}
		/*scissors cases
		 * if: computer wins
		 * else: user wins
		 * update scores
		 */
		else if(choice1 == 1)
		{
			if(choice2 == 2)
			{
				System.out.println("Winner: Computer");
				scoreTracker[1]++;
				System.out.println("========================");
			}
			else
			{
				System.out.println("Winner: You");
				scoreTracker[0]++;
				System.out.println("========================");
			}
		}
		/*rock cases
		 * if: computer wins
		 * else: user wins
		 * update scores
		 */
		else if(choice1 == 2)
		{
			if(choice2 == 3)
			{
				System.out.println("Winner: Computer");
				scoreTracker[1]++;
				System.out.println("========================");
			}
			else
			{
				System.out.println("Winner: You");
				scoreTracker[0]++;
				System.out.println("========================");
			}
		}
		/*paper cases
		 * if: computer wins
		 * else: user wins
		 * update scores
		 */
		else
		{
			if(choice2 == 1)
			{
				System.out.println("Winner: Computer");
				scoreTracker[1]++;
				System.out.println("========================");
			}
			else
			{
				System.out.println("Winner: You");
				scoreTracker[0]++;
				System.out.println("========================");
			}
		}
	}

}
