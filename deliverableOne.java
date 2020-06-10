package bishop_deliverable_one;
import java.util.Scanner;

public class deliverableOne {
	public static void main(String[] args) {
	    Scanner scnr = new Scanner(System.in);
	    
	    String vacationType;
	    int groupSize;
	        		
	    System.out.println("What kind of trip would you like to go on, musical, tropical, or adventurous?");
	    	vacationType = scnr.nextLine();
	    System.out.println("How many are in your group?");
	    	groupSize = scnr.nextInt();
	   
	    String destination = "assignedBelow";	
	    if (vacationType.equals("musical")) { 
	    	destination = "New Orleans"; 
	    } else if (vacationType.equals("tropical")) {
	    	destination = "a Beach Vacation in Mexico";
	    } else if (vacationType.equals("adventurous")) {
	    	destination = "Whitewater Rafting the Grand Canyon";
	    	}
	    
	    String travelSuggestion = "assignedBelowTwo";	
	    if (groupSize ==1 || groupSize ==2) { 
	    	travelSuggestion = "First Class"; 
	    } else if (groupSize >=3 && groupSize <=5) {
	    	travelSuggestion = "a Helicopter";
	    } else if (groupSize >=6) {
	    	travelSuggestion = "a Charter Flight";
	    	}
	    	
	    scnr.close();
	    
	    String result = ("Since you're a group of " + groupSize + " going on " + vacationType + " vacation, you should take " + travelSuggestion + " to " + destination );
	    
	    System.out.println(result);
	
	}	    	
		

	}
	


