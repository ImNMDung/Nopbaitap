import java.util.Scanner;

public class positive_negative_small {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 double a ;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input a number: ");
	        a = scanner.nextDouble();	
	        
	        if ( a == 0 )
	        {
	        	 System.out.println(" Zero  ");
	        	 }
	        if ( Math.abs(a) < 1) 
	        {
	        	System.out.println(" Small  ");
	        }
	        if ( a > 1000000) 
	        {
	        	System.out.println(" Large  ");
	        }
	        if (a > 0 ) {System.out.println(" positive  ");}
	        else {System.out.println(" negative  ");}
	        }
	       
	}


