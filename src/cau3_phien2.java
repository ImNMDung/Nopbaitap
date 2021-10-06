import java.util.Scanner;
public class cau3_phien2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int number;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhap n: ");
        number = scanner.nextInt();
        System.out.println("Day so Fibonacci la: ");
        for (int i = 0; i < number; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
  
    public static int fibonacci(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
 
        if (n < 0) {
            return -1;
        } else if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
	}

}
