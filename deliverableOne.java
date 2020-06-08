package bishop_deliverable_one;
import java.util.Scanner;

public class deliverableOne {
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    
	    String vacationType = "userInput";
	    boolean valid = false;
	    		
	    while (!valid) {
	    	System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous?");
	    	vacationType = scnr.nextLine();
	    	//check if user picked valid vacation type and if they didn't, repeat vacation type question
	    	if (vacationType.equals("musical") || vacationType.equals("tropical") || vacationType.equals("adventurous")) {
	    		valid = true;
	    }	else {
	    			System.out.println("This vacation type is invalid. Please select one of the following trip types: musical, tropical, or adventurous");
	    		} 
	    
	    

	    	}

	    scnr.close();
	}

}








