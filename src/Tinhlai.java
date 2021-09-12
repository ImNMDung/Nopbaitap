import java.util.Scanner;
import java.util.*;
public class Tinhlai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double loanamount;
		double monthlyinterestRate;
		double year;
		double monthlyPayments;
		double d,b;
		
		 System.out.println("So Tien Vay: ");
		 Scanner scanner = new Scanner(System.in);
		 loanamount = scanner.nextDouble();
	        System.out.println("Lai Theo Thang: ");
	        monthlyinterestRate = scanner.nextDouble();
	        System.out.println("So Nam: ");
	        year = scanner.nextDouble();
	        d=1+monthlyinterestRate;
	        b=1-1/Math.pow(d,year*12);
	        
	        monthlyPayments = loanamount*monthlyinterestRate/b ;
	        System.out.println("So Tien Phai Tra: " +monthlyPayments); 
	      

}}
