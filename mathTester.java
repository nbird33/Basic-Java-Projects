/*
Programmer: Noah Bird
Date: 5/10/2018-first coded
Output: to demonstrate an advanced math tutor/tester with two static methods, display 10 random math problems using + or - and track user answers
*/

import java.util.Scanner;
import java.util.Random;         // import keyboard scanner and random number tool

public class mathTester
{
	public static void main(String[] args)
	{
		int correct = 0, wrong = 0, sign = 0, level, answer = 0, right = 0, randnum1 = 0, randnum2 = 0, guess;    // declaring int data types, names and initializations

		Random randnum = new Random();               // creates new random object

		Scanner user = new Scanner(System.in);       // creates new keyboard entry object

		System.out.println("(Select 1: for level 1 or 2: for level 2): ");    // ask user which level they want to try

		level = user.nextInt();

	 if(level == 2)            // if user selects 2, then second method is called
			{
				leveltwo();    // calls second method
			}

	if(level == 1)             // if user selects 1, then user stays in main method to play math game
	{
		for(int x = 0; x < 10; x++)   // for loop to assign ten repeating random questions
		{
			System.out.println();
			System.out.println("What is your answer?   ");

			randnum1 = 1 + randnum.nextInt(9);
			randnum2 = 1 + randnum.nextInt(9);     // generates two random numbers from 1 to 9
			sign = 1 + randnum.nextInt(2);         // generates random number 1 or 2 to be used to define the operator( + or - )

			switch(sign)                           // switch statement uses sign to define if equation is plus or minus
			{
				case 1:

				answer = randnum1 + randnum2;
				System.out.println(randnum1 + "+" + randnum2 + " = ");
				guess = user.nextInt();                              // case 1 is addition, program displays equation and calculates answer, then asks user for their guess

				if(guess == answer)
				{
					System.out.println("Correct!  ");
					right++;                                      // if users guess is right, program displays they got it correct and adds one to the correct answer counter
				}
				else if(guess != answer)
				{
					System.out.println("Wrong ! The correct answer is " + answer);
					wrong++;                                       // if user guesses wrong then program tells user correct answer and adds one to the incorrect answer counter
				}
				break;


				case 2:                                            // case 2 is subtraction, program displays equation and calculates answer, then asks user for guess
				answer = randnum1 - randnum2;
				System.out.println(randnum1 + "-" + randnum2 + " = ");
				guess = user.nextInt();

				if(guess == answer)
					{
					System.out.println("Correct! ");
					right++;                                     // if guess is correct, program displays they got it right and adds one to the correct answer counter
					}
				else if(guess != answer)
					{
					System.out.println("Wrong ! The correct answer is " + answer);
					wrong++;                                    // if guess is incorrect, then program displays correct answer and adds one to the incorrect answer counter
					}
					break;
			 }
		  }


						System.out.println();
						System.out.println("You solved 10 problems!!");
						System.out.println("You got " + right + " answer(s) right");
						System.out.println("You got " + wrong + " answer(s) wrong");        // displays how many answers user got right and wrong

	}
}
		public static int leveltwo()                           // second method for level 2
				{
					int randomnum1 = 0, randomnum2 = 0, operator = 0, answer, correct, right = 0, wrong = 0;    // declare int data types, names and initializations

							Random randnum = new Random();                        // new random object

							Scanner user = new Scanner(System.in);               // new keyboard scanner object


					for(int i = 0; i < 10; i++)                               // for loop to generate 10 random equations
							{
								System.out.println();
								System.out.println("What is your answer?    ");

								randomnum1 = 10 + randnum.nextInt(19);
								randomnum2 = 10 + randnum.nextInt(19);      // creates two random numbers from 10 - 19
								operator = 1 + randnum.nextInt(2);          // creates random number 1 or 2 to create random operator

								switch(operator)                         // switch statement to decide for addition or subtraction in equation
								{
									case 1:
									correct = randomnum1 + randomnum2;
									System.out.println(randomnum1 + "+" + randomnum2 + " =  ");
									answer = user.nextInt();                 // if operator equals 1 then addition is the operator for the equation and the program calculates answer and asks user to guess

									if(answer == correct)
									{
										System.out.println("Correct!  ");
										right++;                           // if users guess is right, program displays they got it correct and adds one to the correct answer counter
									}
									else if(answer != correct)
									{
										System.out.println("Wrong ! The correct answer is " + correct);
										wrong++;                         // if user guesses wrong then program tells user correct answer and adds one to the incorrect answer counter
									}

									break;


									case 2:
									correct = randomnum1 - randomnum2;
									System.out.println(randomnum1 + "-" + randomnum2 + " = ");
									answer = user.nextInt();                 // case 2 is subtraction, program displays equation and calculates answer, then asks user for guess

									if(answer == correct)
										{
										System.out.println("Correct! ");
										right++;                             // if users guess is right, program displays they got it correct and adds one to the correct answer counter
										}
									else if(answer != correct)
										{
										System.out.println("Wrong ! The correct answer is " + correct);       // if user guesses wrong then program tells user correct answer and adds one to the incorrect answer counter
										wrong++;
										}
										break;
								}

							}

									System.out.println();
									System.out.println("You solved 10 problems!!");
									System.out.println("You got " + right + " answer(s) right");
									System.out.println("You got " + wrong + " answer(s) wrong");     // displays how many answers user got right and wrong
									return (right) & (wrong);

}
}















