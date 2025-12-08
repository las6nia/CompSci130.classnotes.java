package InputOutputArithmetic;

//<DO_01: add an import statement to import the Scanner library>
import java.util.Scanner;


public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in); //Scanner object
				
		// <DO_02: Declare your variables here, GPA is given as an example>
		
		Double Credit1,Credit2, GradePoint1, GradePoint2, TotalCredits, TotalGradePoints, GPA; //value of grade?
		
				
		System.out.println("Enter the credits for the first business class:	\n");
		
		// <DO_03: Read number of credits of the first business class, as shown in the sample run.>
		Credit1 = input.nextDouble();
				
		System.out.println("Enter the value (4.0, 3.0, etc.) of grade for the first business class: \n");
		
		// <DO_04: Read value of the grade of the first business class, as shown in the sample run.>
		
		GradePoint1 = input.nextDouble();
		
		System.out.println("Enter the credits for the second business class: \n");
		
		// <DO_05: Read number of credits of the second business class, as shown in the sample run.>
		
		Credit2 = input.nextDouble();
		
		System.out.println("Enter the value (4.0, 3.0, etc.) of grade for the second business class: \n");
		
		// <DO_06: Read value of the grade of the second business class, as shown in the sample run.>
				
		GradePoint2 = input.nextDouble();
		
		// <DO_07: Accumulate the total grade points and total credits.>
		
		TotalCredits = Credit1 + Credit2;
		
		TotalGradePoints = Credit1 * GradePoint1 + Credit2 * GradePoint2;
				
		// <DO_08: Calculate the GPA and display it as shown in the sample run.>
		
		GPA = TotalGradePoints / TotalCredits;
		
		System.out.println("Your GPA for the 2 business classes is: " + GPA);
		System.out.printf("TotalCredits %.2f\n", TotalCredits);
		System.out.printf("TotalGradePoints %.2f\n", TotalGradePoints);
		
		
		
	
	} // end of the main method
		

} // end of the class Lab1


