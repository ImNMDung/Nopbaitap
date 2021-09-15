import java.util.Scanner;
public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a,cn,cc ;
		 Scanner scanner = new Scanner(System.in);		 	        
	        System.out.println("Nhap Chieu Cao: ");
	        cn = scanner.nextDouble();
	        System.out.println("Nhap Can Nang: ");
	        cc = scanner.nextDouble();
	        
	        a = cn / (cc*cc);
	      
	        System.out.println("BMI: " + a);
		
		      
	if (a < 18.5 ) {
		 System.out.println("Underweight");
	
	}
	if ( (18.5 <= a) && (a < 25) ) {
		 System.out.println("Normal");
	
	}
	if ((25 < a) && (a < 30)  ) {
		 System.out.println("Overweight");
	
	}
	if (30 <= a) {
	 System.out.println("Obese");
	
	}
}
}
