import java.util.Scanner;

public class bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,d;
		 double c ;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap a: ");
	        a = scanner.nextInt();	   
	        
	        System.out.println("Nhap b: ");
	        b = scanner.nextInt();	   
	        d = a - b ;
		
		 System.out.println("What is " + a +" - " + b + " = ");
		 c = scanner.nextInt();	   
	
if ((a-b) == c ) 
	{
		System.out.println("Correct");
	}
else {System.out.println("Wrong");}
	}

}
