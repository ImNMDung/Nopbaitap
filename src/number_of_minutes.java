import java.util.Scanner;
public class number_of_minutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double minutesInYear = 60 * 24 * 365;

        Scanner cn = new Scanner(System.in);

        System.out.print("Input the number of minutes: ");

        double min = cn.nextDouble();

        long years = (long) (min / minutesInYear);
        int days = (int) (min / 60 / 24) % 365;

        System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
    }

}
