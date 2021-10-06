import java.util.Scanner;

public class cau9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		    int n, tmp;
		   Scanner scanner = new Scanner(System.in);
		       
	        System.out.print("Input N: ");
	        n = scanner.nextInt();
		   
		    int res = 0;
		    while(n > 0){
		        tmp = n % 10;
		        res = res * 10 + tmp;
		        n = n / 10;
		    }
		    System.out.print("N reverse number is  : "+res);
		}
	}


