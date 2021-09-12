import java.util.Scanner;
public class Chuvi {
	
	
	 
	    public static double tinhchuvi(double r){
	        return r * 2 * 3.14;
	    }
	    public static void main(String[] args) {
	        double r;
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Nhap Ban Kinh Hinh Tron: ");
	        r = scanner.nextDouble();
	   
	        System.out.println("Chu Vi Hinh Trong: "+ tinhchuvi(r));
	   
	        System.out.println(Math.pow(2.5, -2));
	    }
	}

