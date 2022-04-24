
import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
	    	
	    	String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
	    	MyDate d = new MyDate();
	    	d.accept(d);
	    	d.print();
	    	
	    	
	    	while(true) {
	    		System.out.println("Please input your option to print the date: ");
	    		System.out.println("0. Exit.");
	    		System.out.println("1. Print the date format dd/MM/yyyy.");
	    		System.out.println("2. Print the date format yy-mm-dd.");
	    		Scanner s = new Scanner(System.in);
	            int option = s.nextInt();
                if(option == 0) {
                   System.out.println("Exit the print program");
                   break;
                }
                else {
                	d.print(option);
                }
				
	    	}
	    	
	    }
	    

}
