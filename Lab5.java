package UserDefinedMethods;

import java.util.Scanner;
public class Lab5 {
static Scanner input = new Scanner (System.in); //Scanner object
public static void main(String[] args) {
// TODO Auto-generated method stub
	
	double totalReceipts = 0.0; // total fee collected for the entire day
	double fee; // the charge for the current customer
	double hours; // parked hours for the current customer
	// Prompt the user to enter month the first customer's parked hours
	System.out.print("Enter number of hours (a negative to quit): " );
	hours = input.nextDouble();
	// process parked hours until we get a negative input to quit
	
	// <DO_1 Fill in the condition so the loop exits when the user enters a negative value to quit.>
	while (hours >= 0 )
		{
	// <DO_02: Finish the below statement to invoke the calculateCharges method with the inputted hours is passed to the parameter.>
		fee = calculateCharges(hours);
	// <DO_03: Write code to add the computed fee to the variable totalReceipts.>
		totalReceipts += fee;
		System.out.printf ("Current charge: $%.2f, Total receipts: $%.2f\n", fee, totalReceipts);
	// <DO_04: Write code to read the next parked hours.>
		System.out.print("Enter number of hours (a negative to quit): " );
		hours = input.nextDouble();
		} // The end of WHILE STRUCTURE
	
	} // end of the main method
	
public static double calculateCharges( double hours ) {// Method calculateCharges that determines fee based on time
	// <DO_05: Write code to implement this method by following the below steps.>
		double charge = 2.00; 	// step 1: apply minimum charge
		if (hours > 3) 
		{		// step 2: add extra fees as applicable
			charge = 2.00 + (hours - 3) * 0.50;
	    }
		if (charge > 10.00) 
		{	// step 3: apply maximum value if needed
			charge = 10.00;
	    }	 
		return charge;			// step 4: add the needed return statement
	} // end method calculateCharges

} // end of the class Lab5