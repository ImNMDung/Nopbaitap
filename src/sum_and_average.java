import java.util.Scanner;

public class sum_and_average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int a,b,c,d,e,sum=0;
			double avg=0;
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Input A : ");
	        a = scanner.nextInt();	
	        System.out.print("Input B : ");
	        b = scanner.nextInt();	
	        System.out.print("Input C : ");
	        c = scanner.nextInt();	
	        System.out.print("Input D : ");
	        d = scanner.nextInt();	
	        System.out.print("Input E : ");
	        e = scanner.nextInt();	
	        
	        sum = a+b+c+d+e;
	        avg = (a+b+c+d+e)/5;
	        
	        System.out.println("The sum of 5 no is : " +sum);
	        System.out.print("The Average is : "+avg);
	}

}
