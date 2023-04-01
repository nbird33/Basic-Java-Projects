/*
Programmer: Noah Bird
Date: 2/14/18-first coded
Output: find how much a business profits off a product if it operates on a 0.4 profit margin
*/

import java.util.Scanner;
public class profitMarginCalc
{
	public static void main(String[] args)
	{
		double retail_price;
		double profit;
        	double profit_margin = 0.4;
		
		Scanner keyboard = new Scanner(System.in);

		System.out.print("What is the retail price of the product? ");

		retail_price = keyboard.nextDouble();

		profit = retail_price * profit_margin;

		System.out.println("Hello User, your profit is $" + profit );
	}
}
