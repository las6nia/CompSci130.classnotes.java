package StringsandCharacters;
import java.util.Scanner;
public class Lab3 {

	public static void main(String[] args) {//start main
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String majorstatus;
				
		System.out.println("Enter two characters:");
		majorstatus = input.next();//  
		
		if (majorstatus.length() <2)//verify only two characters were entered. I tried to use !=2 but still got errors sometimes 
		{
		System.out.print("Invalid input");
		}
		
		char major = Character.toUpperCase(majorstatus.charAt(0));
		char year = majorstatus.charAt(1);
		
		String majorName = ""; // I had a hard time figuring out how to initialize these strings
		String status = "";    
		
		boolean isValid = true;//testing flag
		
		switch (major) {
			case 'M':
				majorName = "Mathematics";
				break;
			case 'C':
				majorName = "Computer Science";
				break;
			case 'I':
				majorName = "Information Technology";
				break;
			default:
				isValid = false;
			}
		switch (year) {
			case '1':
				status = "Freshman";
				break;
			case '2':
				status = "Sophomore";
				break;
			case '3':
				status = "Junior";
				break;
			case '4':
				status = "Senior";
				break;
			default:
				isValid = false;
		}
	
		if (isValid) {
			System.out.printf("Hello %s %s\n", majorName, status);
		}
		else {
			System.out.println("Invalid input");//Ensures the correct output
		}
		
		/*
		 * 	Initially, I began by trying to use switch statements. After some time struggling to get it to 
		 *  run properly, I was able to use if statements to accomplish this assignment. Then, after figuring 
		 *  out a successful code, I was able to find my errors with the Switch statements.  I believe both
		 *   codes run successfully.
		
		if (major == 'M') {
			 majorName= "Mathematics";
		} 
		else if (major == 'C') {
			 majorName= "Computer Science";
		}
		else if (major == 'I') {
			 majorName = "Information Technology";
		}
		else{
			isValid = false; //invalid major
		}
	 
		if (year == '1') {
			status = "Freshman";
		} 
		else if (year == '2') {
			status = "Sophomore";
		}
		else if (year == '3') {
			status = "Junior";
		}
		else if(year == '4') {
			status = "Senior";
		}
		else{
			isValid = false;//invalid year
		}
	 	
		if (isValid) {
			System.out.printf("Hello %s %s%n", majorName, status);
		}
		else {
			System.out.println("Invalid input");
		}
		
		*/	
		
		
	}//end of main
	
	
}//end of class