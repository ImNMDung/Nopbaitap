
import java.util.Scanner;
public class integernumber {

    public static void main(String[] Strings) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Input an integer between 0 and 1000: ");
        int num = sc.nextInt();
//firstDigit so dau tien
//SecondDigit so thu hai  
//thirdDigit so thu ba 
//fourthDigit so thu tu
        int firstDigit = num % 10;
        int remainingNumber = num / 10;
        int SecondDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int thirdDigit = remainingNumber % 10;
        remainingNumber = remainingNumber / 10;
        int fourthDigit = remainingNumber % 10;
        int sum = firstDigit + SecondDigit +  thirdDigit + fourthDigit;
        System.out.println("The sum of all digits in " + num + " is " + sum);

    }
}