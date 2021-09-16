import java.util.*;
import java.lang.Math;

public class ptbac2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a,b,c,d ,z,x1=0,x2=0 ;
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.print("Nhap a :   ");
		 a = scanner.nextInt();
		 System.out.print("Nhap b :   ");
		 b = scanner.nextInt();
		 System.out.print("Nhap c :   ");
		 c = scanner.nextInt();
		 d=(b*b)-4*a*c;
			if (a!=0)
			{ 
			 	if (d < 0 )
			 		System.out.println("Vo Nghiem");} 
			 	if (d == 0)	
			 	{
				 	x1= -(b)/(2*a);
				 	System.out.println("Phuong trinh co nghiem kep la  " + x1);}	
				else if (d > 0 )
					  {x1 = ((-b + Math.sqrt(d) )/ (2*a));
			    	    x2 = ((-b - Math.sqrt(d))/ (2*a));
			    	    System.out.println("Phuong trinh co 2 nghiem la "+ x1 + " va " + x2);}
			
			 }	
		 
	}

