import java.util.Scanner;

public class cau6_phien2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count = 0;
        System.out.println("Cac So Nguyen To Co 5 Chu So :");
        for (int i = 10001; i < 99999; i+=1) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("Co " + count+ " So Nguyen To Trong Pham Vi So Co 5 Chu So");
    }
     
    
    public static boolean isPrimeNumber(int n) {
       
        if (n < 2) {
            return false;
        }
      
        int squareRoot = (int) Math.sqrt(n);
        for (int i = 2; i <= squareRoot; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
