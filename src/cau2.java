import java.util.Scanner;
public class cau2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		    int n;
		    Scanner scanner = new Scanner(System.in);
		       
	        System.out.print("Nhap so tu nhien n: ");
	        n = scanner.nextInt();
		    for(int i = 5 ; i >= 0; i--) {
		       
		        for(int j = i; j >= 1; j--) {
		        	
		  	       
		 	        System.out.print(j + " ");
		 	      
		        }
		        System.out.println();
		    }
	}
}
	
		 
