import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate() {
    
    }
    public MyDate(int day, int month, int year) {
    	this.day = day;
    	this.month = month;
    	this.year = month;
    }
    public MyDate(String date) {
    	System.out.println("The date is: " + date);
    }
    public int getDay() {
    	
		return day;
	}
	public void setDay(int day) {
	  switch(month) {
	     case 1:
			if(day >= 1 && day <= 31) {
				this.day = day;
		    }
			else {
				System.out.println("Invalid date!");
			}
		 case 2:
			if(year % 4 == 0) {
			   if(day >= 1 && day <= 29) {
			       this.day = day;
		       }
			   else {
			       System.out.println("Invalid date!");
		       }
			}
			else {
			  if(day >= 1 && day <= 28) {
				   this.day = day;
			   }
			  else {
				   System.out.println("Invalid date!");
			   }
			}
		 case 3:
			if(day >= 1 && day <= 31) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 4:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 5:
			if(day >= 1 && day <= 31) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 6:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 7:
			if(day >= 1 && day <= 31) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 8:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 9:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 10:
			if(day >= 1 && day <= 31) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 11:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
		 case 12:
			if(day >= 1 && day <= 30) {
				this.day = day;
			 }
			else {
				System.out.println("Invalid date!");
			 }
	   }
	   
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if(month < 1 || month > 12) {
			System.out.println("Invalid date!");
		}
		else {
		 this.month = month;
		}
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	Scanner sc = new Scanner(System.in);
	public void accept(MyDate date) {
		String str = sc.nextLine();
		String[] inp = str.split("\\s");
    	String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for(int i = 0; i < 12; i++) {
        	if(inp[0].equals(month[i])) {
        		date.setMonth(i + 1);
        	}
        	
        	
        }
        System.out.println(date.getMonth());
        int dayy = 0;
        for(int i = 0; i < inp[1].length(); i++) {
        	if(inp[1].charAt(i) >= '0' && inp[1].charAt(i) <= '9') {
        		dayy += inp[1].charAt(i) - '0';
        		dayy *= 10;
        	}
        }
        date.setDay(dayy/10);
        date.setYear(Integer.valueOf(inp[2]));
        if(date.getMonth() != 0) {
        	System.out.println("The month is: " + month[date.getMonth() - 1]);
        }
        else {
        	System.out.println("Invalid date!");
        }
        if(date.getDay() != 0) {
        	System.out.println("The day is: " + date.getDay());
        }
        else {
        	System.out.println("Invalid date!");
        }
        if(date.getYear() != 0) {
        	System.out.println("The year is: " + date.getYear());
        }
        else {
        	System.out.println("Invalid date!");
        }
	}
	
	public void print() {
		SimpleDateFormat formatt = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		System.out.println("Current date is " + formatt.format(date));
	}
}
