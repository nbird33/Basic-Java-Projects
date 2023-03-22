/*
Programmer: Noah Bird
Date: 3/21/18-initially coded
Output: To get users to enter decimal inputs to be converted into other units.
*/
import java.util.Scanner;

import java.text.DecimalFormat;

public class imperialMetricConverter
{
	public static void main(String[] args)
	{
		int option;
		double miles, kilometers, pound, kilogram, liter, gallon; // declare variables

		DecimalFormat formatter = new DecimalFormat("#0.00"); // create DecimalFormat object

		Scanner user = new Scanner(System.in); // create scanner object for keyboard input

		System.out.println("Welcome to Unit Converter!!");
		System.out.print("\t V.1.0 \n");
		System.out.println("Developed by Noah Bird");
		System.out.print("**************************************** \n");

		System.out.println("Choose Options: \n");
		System.out.print("0: miles to kilometers \n");
		System.out.print("1: pounds to kilograms \n");
		System.out.print("2: gallon to liter \n");

		option = user.nextInt(); // asks user to enter integer for the units they want to convert

		switch(option) // calculate and convert units based on user input, then display results and exit program
		{
		case 0:
			System.out.println("Enter miles: ");
			miles = user.nextDouble();
			kilometers = miles * 1.609344;
			System.out.print("\n");
			System.out.print(formatter.format(miles) + " miles = " + formatter.format(kilometers) + " kilometers\n");
			break;

		case 1:
			System.out.println("Enter pounds: ");
			pound = user.nextDouble();
			kilogram = pound * 0.4536;
			System.out.print("\n");
			System.out.print(formatter.format(pound) + " pounds = " + formatter.format(kilogram) + " kilograms\n");
			break;

		case 2:
			System.out.println("Enter gallons: ");
			gallon = user.nextDouble();
			liter = gallon * 3.7854;
			System.out.print("\n");
			System.out.print(formatter.format(gallon) + " gallons = " + formatter.format(liter) + " liters\n");
			break;

		default:
			System.out.print("\n");
			System.out.println("Sorry Wrong option! You must choose either 0, 1 or 2!");
		}
		System.out.println();
		System.out.print("**************************************** \n");
		System.out.println("Thank you for using unit converter!\n");
		}
}






