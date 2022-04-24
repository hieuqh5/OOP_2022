import java.util.ArrayList;
import java.util.Collections;

public class DateUtils {
    public static int Compare(MyDate date1, MyDate date2) {
          if(date1.getYear() > date2.getYear()) {
        	  return 1;
          }
          else if(date1.getYear() < date2.getYear()) {
              return 0;
          }
          else {
        	  if(date1.getMonth() > date2.getMonth()) {
                 return 1;
        	  }
        	  else if(date1.getMonth() < date2.getMonth()) {
        		 return 0;
        	  }
        	  else {
        	      if(date1.getDay() > date2.getDay()) {
        	    	  return 1;
                	  }
        	      else if(date1.getDay() < date2.getDay()) {
                      return 0;
        	      }
        	      else {
        	    	  return -1;
        	      }
        	  }
          }
    }
    public static void SortDay(ArrayList<MyDate> dates) {
    	boolean haveSwap;
    	for(int i = 0; i < dates.size() - 1; i++ ) {
    		haveSwap = false;
    		for(int j = 1; j < dates.size() - i - 1; j++) {
    			if(Compare(dates.get(j), dates.get(i)) == 1) {
    				Collections.swap(dates, i, j);
    				haveSwap = true;
    			}
    		}
    		if(haveSwap == false) {
    			break;
    		}
    	}
    }
}
