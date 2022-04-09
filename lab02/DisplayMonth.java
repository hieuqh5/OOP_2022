package lab02;

import java.util.Scanner;

public class DisplayMonth {
	public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        
        System.out.print("Input the month: " );
        String strMonth = key.nextLine();
        
    	
    	if(strMonth.equals("January") || strMonth.equals("Jan.") || strMonth.equals("Jan") || strMonth.equals("1")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("February") || strMonth.equals("Feb.") || strMonth.equals("Feb") || strMonth.equals("2")) {
    		System.out.println("\nInput the year: ");
    		 
            int strYear = key.nextInt();
    	    if(strYear % 4 == 0) {
        		System.out.println("The day of the month is: 29 days");

    	    }
    	    else {
        		System.out.println("The day of the month is: 28 days");

    	    }
    		
    	}
    	else if(strMonth.equals("March") || strMonth.equals("Mar.") || strMonth.equals("Mar") || strMonth.equals("3")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("April") || strMonth.equals("Apr.") || strMonth.equals("Apr") || strMonth.equals("4")) {
    		System.out.println("The day of the month is: 30 days");
    		
    	}
    	else if(strMonth.equals("May") || strMonth.equals("5")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("June") || strMonth.equals("Jun") || strMonth.equals("6")) {
    		System.out.println("The day of the month is: 30 days");
    		
    	}
    	else if(strMonth.equals("July") || strMonth.equals("Jul.") || strMonth.equals("7")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("August") || strMonth.equals("Aug.") || strMonth.equals("Aug") || strMonth.equals("8")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("September") || strMonth.equals("Sept.") || strMonth.equals("Sep") || strMonth.equals("9")) {
    		System.out.println("The day of the month is: 30 days");
    		
    	}
    	else if(strMonth.equals("October") || strMonth.equals("Oct.") || strMonth.equals("Oct") || strMonth.equals("10")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else if(strMonth.equals("November") || strMonth.equals("Nov.") || strMonth.equals("Nov") || strMonth.equals("11")) {
    		System.out.println("The day of the month is: 30 days");
    		
    	}
    	else if(strMonth.equals("December") || strMonth.equals("Dec.") || strMonth.equals("Dec") || strMonth.equals("12")) {
    		System.out.println("The day of the month is: 31 days");
    		
    	}
    	else {
    		System.out.println("Invalid month!");
    	}
    	
        
     }
   
}
