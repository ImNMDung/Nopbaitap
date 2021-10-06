import java.util.Scanner;

public class cau8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int i, fact = 1, n;
		  
		  Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Input n : ");
	        n = scanner.nextInt();
		    if (n <= 0)
		        fact = 1;
		    else
		    {
		        for (i = 1; i <= n; i++)
		        {
		            fact = fact * i;
		        }
		    }
		    System.out.print("The factorial of   " +n +" is " + fact);
		}
	}


