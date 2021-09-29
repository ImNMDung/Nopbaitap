import java.util.Scanner;

public class positive_or_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a;
		
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input A : ");
	        a = scanner.nextInt();	
	        
	        if ( a % 2 == 0) 	{	  System.out.println(" Numbers is Positive");}
	        else {  System.out.println(" Numbers is Negative ");}
	        
	}

}
