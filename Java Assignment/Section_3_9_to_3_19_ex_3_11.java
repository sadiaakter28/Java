import java.util.Scanner;

public class Section_3_9_to_3_19_ex_3_11 {  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a year: ");
    int year = input.nextInt();
   
    System.out.print("Enter a month name: ");
    int month = input.nextInt();
    int days = 0;
    
    boolean isLeapYear = 
    	(year % 4 == 0 && year % 100 != 0);
    
    String monthName = "";
    switch (month) {
    		case 1: monthName = "January";
    			days = 31;
    			break;
    		case 2: monthName = "February";
    			if (isLeapYear)	
    				days = 29;
    			else
    				days = 28;
    			break;
    		case 3: monthName = "March";
    			days = 31;
    			break;
    		case 4: monthName = "April";
    			days = 30;
    			break;
    		case 5: monthName = "May";
    			days = 31;
    			break;
    		case 6: monthName = "June";
    			days = 30;
    			break;
    		case 7: monthName = "July";
    			days = 31;
    			break;
    		case 8: monthName = "August";
    			days = 31;
    			break;
    		case 9: monthName = "September";
    			days = 30;
    			break;
    		case 10: monthName = "October";
    			days = 31;
    			break;
    		case 11: monthName = "November";
    			days = 30;
    			break;
    		case 12: monthName = "December";
    			days = 31;
    			break;
 
		}
    System.out.println(monthName+" "+ year+ " has " + days+ " days.");
  }
}
