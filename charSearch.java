/*
Programmer: Noah Bird
Date: 12/2/18-initially coded
Output: ask users to enter a string then ask user to select a char and program will determine 
how many times that char is in the string user entered.
*/

import java.util.Scanner;

public class charSearch
{
	public static void main(String args[])
	{
			Scanner user = new Scanner(System.in);
			System.out.println("Enter a string to be searched... ");
			String sentence = user.nextLine();

			System.out.println("Enter character to search for... ");
			char character = user.next().charAt(0);

			int count = 0;
			int current = sentence.indexOf(character, 0);


		for(int index = 0; index < sentence.length(); index++)
		{
			if(sentence.charAt(index) == character)
			count++;
		}

		System.out.printf("Number of %s's: %d\n", character, count);

	}
}
