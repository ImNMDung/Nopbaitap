import java.util.Scanner;

public class greatest_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input the 1st number : ");
        a = scanner.nextInt();	
        System.out.print("Input the 2nd number : ");
        b = scanner.nextInt();	
        System.out.print("Input the 3rd number: ");
        c = scanner.nextInt();	
        if ( a >= b && a >= c	 ) { System.out.print("The greatest: " + a); }
        else 
        if ( b >= a && b >= c ) { System.out.print("The greatest: " + b);}
        else { System.out.print("The greatest: " + c);
        }
        }
	

	
	}
