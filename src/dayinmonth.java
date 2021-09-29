import java.util.Scanner;

public class dayinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day,month,year;
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Input a month number: ");
	        month= scanner.nextInt();	
	        System.out.print("Input a year: ");
	        year = scanner.nextInt();	
	        
	        boolean isLeap = false;
	        if(year % 4 == 0)
	        {
	            if( year % 100 == 0)
	           
	            {
	                if ( year % 400 == 0)
	                    isLeap = true;
	                else
	                    isLeap = false;
	            }
	            else
	                isLeap = true;
	        }
	        else {
	            isLeap = false;
	        }
	       
	        
	        switch(month)
	        {
	            case 1:		 System.out.print("January" +year+ " has 31 day");	break;
	        	case 2:		  if(isLeap==true)
	        						System.out.print("February " +year+ " has 29 day");
	        					else
	        						System.out.print("February " +year+ " has 28 day");
	        		break;
	        	case 3:		 System.out.print("March "+year+ " has 31 day" );	break;
	        	case 4:		 System.out.print("April "+year+ " has 30 day" );	break;
	        	case 5:		 System.out.print("May " +year+ " has 31 day");		break;
	        	case 6:		 System.out.print("June " +year+ " has 30 day");		break;
	        	case 7:		 System.out.print("July "+year+ " has 31 day");		break;
	        	case 8:		 System.out.print("August "+year+ " has 31 day");	break;
	        	case 9: 	 System.out.print("September "+year+ " has 30 day");	break;
	        	case 10:	 System.out.print("October "+year+ " has 31 day");	break;
	        	case 11: 	 System.out.print("November "+year+ " has 30 day");	break;
	        	case 12: 	 System.out.print("December "+year+ " has 31 day");	break;
	        }
	}
}
		
	        
	        
     
	 


