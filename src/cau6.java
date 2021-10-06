import java.util.Scanner;

public class cau6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i, j, isPrime; 

	   
	    Scanner scanner = new Scanner(System.in);
	       
        System.out.print("Nhap Pham Vi : ");
        n = scanner.nextInt();

	  
	    for(i=2; i<=n; i++)
	    {
	       
	        isPrime = 1; 

	        
	        for(j=2; j<=i/2; j++)
	        {
	            
	            if(i%j==0)
	            {
	                isPrime = 0;
	                break;
	            }
	        }

	   
	        if(isPrime==1)
	        {
	        	System.out.print(" " + i);
	        }
	    }
	}

}
