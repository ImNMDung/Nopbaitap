import java.util.Scanner;import java.util.Scanner;
public class inchtometer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Input a value for inch: ");
		        double inch = sc.nextDouble();
		        double meters = inch * 0.0254;
		        System.out.println(inch + " inch is " + meters + " meters");
	}

}
