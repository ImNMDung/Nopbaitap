import java.util.Scanner;

public class cau4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count = 0, num ;
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Input N: ");
	        num = scanner.nextInt();
	    while (num != 0) {
	      
	      num /= 10;
	      ++count;
	    }

	    System.out.println("Number of digits: " + count);
	}

}
