import java.util.Scanner;
public class cau7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n , firstTerm = 0, secondTerm = 1;
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Input n : ");
	        n = scanner.nextInt();
	        if (n > 2 ) {
	    System.out.println("Fibonacci Series till " + n + " terms:");

	    for (int i = 1; i <= n; ++i) {
	      System.out.print(firstTerm + ", ");

	    
	      int nextTerm = firstTerm + secondTerm;
	      firstTerm = secondTerm;
	      secondTerm = nextTerm;
	    }
	  }
	        else {return;}
	        }
	
	}


