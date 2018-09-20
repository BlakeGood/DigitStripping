import java.util.Arrays;
import java.util.Scanner;
public class digitStripping
	{

		public static void main(String[] args)
			{
				//challengeOne();
				challengeTwoThroughFour();
			}
		
		public static void challengeOne()
		{
			int[] userNumbers = new int[6];
			System.out.println("Please input a six digit number.");
			Scanner userInput = new Scanner(System.in);
		
			int userNum = userInput.nextInt();
			for(int i = 0; i < userNumbers.length; i++)
				{
					 int digitStripping = userNum%10;
					 userNumbers[i] = digitStripping;
					 userNum = userNum/10;
				}
			System.out.println(Arrays.toString(userNumbers));
			
			
		}
		
		public static void challengeTwoThroughFour()
		{
			
			Scanner userInput = new Scanner(System.in);
			System.out.println("Please input a number");
			int number = userInput.nextInt();
		
			
			
			int counter = 0;
			
			int [] userInputArray = new int[counter];
			for(int i = 0; i < userInputArray.length; i++)
				{
					int digitStripping = number%10;
					userInputArray[i] = digitStripping;
					number = number/10;
				}
			
			
			while (number > 0)
				{
					number = number / 10; 
					counter++;
				}
			System.out.println("There are " + counter + " digits in this number");
			
			int[] userNumbers = new int[counter];
			int counter2 = 0;
			
			for(int i = 0; i < userNumbers.length; i++)
				{
					int digitStripping = number%10;
					userNumbers[i] = digitStripping;
					number = number/10;
					if (userNumbers[i]%2 != 0)
						{
							counter2++;
						}
					System.out.println(counter2);
					
					
					
				}	
					
			// add up the digits
			
			int sum = 0;
			for(int i = 0; i < userInputArray.length; i++)
				{
					sum = sum + userInputArray[i]; 
				}
			System.out.println(sum);
			
			
		}

	}
