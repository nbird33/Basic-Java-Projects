/*
Programmer: Noah Bird
Date: 4/11/2018
Output: User inputs as many numbers as they want in do/while loop that determines largest and smallest integers entered.
*/
import java.util.Scanner;

public class intScanner
{
	public static void main(String[] args)
	{
		int number, largest, smallest;     // define variable name and type

		largest = 0;
		smallest = 0;
		number = 0;                        // initialize variables

		Scanner user = new Scanner(System.in);   // create scanner object


					do
					{
					System.out.println("Enter a number: (type any negative number to end) ");   //input integer
					number = user.nextInt();

					if(number < 0)
					{
						break;                             // break statement
					}
					if(smallest == 0)
					{
						smallest = number ;                // resets smallest number to first number so it doesnt stay as zero
					}
					if(number >= largest)                  // get largest number
					{
						largest = number;
					}

					if(largest >= number)
					{
						largest = largest;
					}

					if(number <= smallest)					// get smallest number
					{
						smallest = number;
					}

					if(smallest <= number)
					{
						smallest = smallest;
					}
	}while(number >=0);									//end of do/while loop with sentinal value

	System.out.println("Largest: " + largest + "\n");
	System.out.println("Smallest: " + smallest);         //print largest and smallest numbers
}
}