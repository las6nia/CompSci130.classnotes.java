package IfStatements;

import java.util.Scanner;

public class Lab2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner (System.in); //Scanner object

		// <DO_01: Declare your variables here, Gender is given as an example>

		char Gender;
		int Age, TickNum;
		int Premium = 0;
		
		// Read the driver's gender from the user

		System.out.println("Enter your gender (M/F): ");
		Gender = input.next().charAt(0);
	
		// <DO_02: Read the driver's age and the number of traffic tickets she/he had, as shown in the sample run.>
		
		System.out.println("Enter your age as an integer: ");
		Age = input.nextInt();
		
		System.out.print("How many tickets do you have? ");
		TickNum= input.nextInt();
		
		// Using nested if statements to calculate the insurance premium based on formulas that are given in Lab2.pdf
		
		if ( Gender == 'M')
		{
			if ( Age < 21 )
			{
			Premium = 1200 + 200 * TickNum;
			}
			else
			{	
			Premium = 1000 + 100 * TickNum;
			}
		}
		
		// <DO_04: Complete the remaining if statements to cover the remaining premium formulas that are mentioned in Lab2.pdf.>

		else if ( Gender == 'F')
		{
			if ( Age < 21 )
			{
			Premium = 1000 + 200 * TickNum;
			}
			else
			{	
			Premium = 900 + 100 * TickNum;
			}
		}// end of IF STRUCTURE
		
		// <DO_05: Print the calculated premium, as shown in the sample run.>
		
		System.out.printf("Your premium is $ %d\n",  Premium);

		
		} // end of the main method
	
	} // end of the class Lab2


