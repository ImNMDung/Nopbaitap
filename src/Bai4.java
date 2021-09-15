import java.util.Scanner;
public class Bai4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 double status ;
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Status :   ");
		 status = scanner.nextInt();
		
		if (status == 0) {

			System.out.println("Compute tax for single filers    ");

			}

			else if (status == 1) {
				 System.out.println("Compute tax for married file jointly or qualifying widow(er) ");
			

			}

			else if (status == 2) {
				 System.out.println("Compute tax for married file separately  ");

			}

			else if(status == 3)
				 System.out.println("Compute tax for head of household   ");
				
				else {	 System.out.println("Display wrong status :   ");
	}

}}
