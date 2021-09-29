import java.util.Scanner;

public class FahrenheittoCelsius {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fahrenheit ,celsius;
		 Scanner scanner = new Scanner(System.in);

		        System.out.print("Input a degree in Fahrenheit: ");
		       fahrenheit = scanner.nextDouble();

		        celsius =(( 5 *(fahrenheit - 32.0)) / 9.0);
		        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");
		    }
		
	}


