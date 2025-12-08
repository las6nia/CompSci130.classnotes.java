package Arrays;
import java.util.Scanner;

public class Lab6 {
	
    public static void main(String[] args) {
    	// TODO Auto-generated method stub

        Scanner input = new Scanner(System.in);

        // Get starting value and difference
        System.out.print("Enter a starting value for the progression: ");
        int startValue = input.nextInt();

        System.out.print("Enter the difference between values in the progression: ");
        int difference = input.nextInt();

        // Fill the array with 50 values of the progression
        int[] progression = new int[50];
        for (int i = 0; i < progression.length; i++) {
            progression[i] = startValue + i * difference;
        }

        // Ask for a value to locate
        System.out.print("Enter a value to locate in the progression: ");
        int locateValue = input.nextInt();

        int locateIndex = -1;
        for (int i = 0; i < progression.length; i++) {
            if (progression[i] == locateValue ) {
            	locateIndex  = i;
                break;  // stop when value is found
            }
        }

        if (locateIndex  != -1) {
            System.out.println(locateValue  + " is in the array at index position " + locateIndex + ".");
        } else {
            System.out.println(locateValue  + " is not in the array.");
        }

        // Ask how many to show 
        System.out.print("How many would you like me to show? ");
        int n = input.nextInt();

        while (n < 0 || n > 50) {
            System.out.println("Enter a number between 0 and 50");
            System.out.print("How many would you like me to show? ");
            n = input.nextInt();
        }

        // Print first n values
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d", progression[i]);
            if ((i + 1) % 10 == 0) {   // every 10 numbers, start a new line
                System.out.println();
            }
        }

    }//end main
      
}//end class