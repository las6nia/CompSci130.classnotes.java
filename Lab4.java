package SentinelControlled;
import java.util.Scanner;
public class Lab4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);

String code; // coin code as a String
double total_value = 0.0; // the total value of the coinage sorted
char coin; // sentinel variable for the While loop
//<DO_01: Declare your counter variables here and initialize them to 0, int pennies counter is given as an example.>
int pennies_counter = 0;
int nickels_counter = 0;
int dimes_counter = 0;
int quarters_counter = 0;
int unknown_counter = 0;

// Read the coin code from the user as shown in the sample run
System.out.println("Enter the coin code: ");
code = input.nextLine();
// Read the first character in the coin code
coin = code.charAt(0);
// process coins until we get an 'x' to exit or more than 10 unknown
// <DO_2 Fill in the condition so the loop exits when coin is 'x'
// or there are more than 10 coins of unknown type.>
int index = 0;
while (coin != 'x' && unknown_counter <= 10)
{
	if ( coin == 'p' || coin == 'P') // case pennies
	{
		pennies_counter++;
		total_value += 0.01;
	}
	// <DO_03: Write code to process nickels, dimes, quarters, and unknown coins.>
	// HINT: Use the above pennies case as a reference.
	else if ( coin == 'n'|| coin == 'N') // case nickles
	{
		nickels_counter++;
		total_value += 0.05;
	}
	else if ( coin == 'd'|| coin == 'D') // case dime
	{
		dimes_counter++;
		total_value += 0.10;
	}
	else if ( coin == 'q'|| coin == 'Q') // case quarter
	{
		quarters_counter++;
		total_value += 0.25;
	}
	else
	{
		unknown_counter++;
	}
// <DO_04: Write code to read next coin code.>
	
	index++;
	if (index < code.length())
	{
		coin = code.charAt(index);
	}
	
} // The end of WHILE STRUCTURE
// Output the counts and total value
System.out.println("Coin counts: ");
System.out.println("---------------");
System.out.println("Pennies: " + pennies_counter);
// <DO_05: Print the remaining counts and total value, as shown in the sample run.>
System.out.println("Nickels: " + nickels_counter);
System.out.println("Dimes: " + dimes_counter);
System.out.println("Quarters: " + quarters_counter);
System.out.println("---------------");
System.out.printf("Total Value: $%.2f\n", total_value); 
System.out.println("Number of unidentified coins: " + unknown_counter);
        // Step 4: Calculate total value
      
total_value = pennies_counter * 0.01 + nickels_counter * 0.05 + dimes_counter * 0.10 + quarters_counter * 0.25;

	
	
	
	
	
	} // end of the main method
} // end of the class Lab4





