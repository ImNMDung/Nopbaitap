import java.util.Scanner;

public class cau1_phien2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,  n;
		  
		  Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Input n : ");
	        n = scanner.nextInt();
	      for ( i=1 ; i <=n ; i++)
	    	  
	      {
	    	  if ( i % 7 == 0 && i % 5 != 0)
	    	  {
	    		  System.out.print(" "+ i);
	    	  }
	      }
	}

}
