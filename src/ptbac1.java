import java.util.Scanner;
public class ptbac1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
        double nghiem;
        Scanner scanner = new Scanner(System.in); 
        System.out.println("Nhập vào số a: ");
        a = scanner.nextInt();
        System.out.println("Nhập vào số b: ");
        b = scanner.nextInt();
  
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình này có vô số nghiệm.");
            } else {
                System.out.println("Phương trình vô nghiệm.");
            }
        } else {
            nghiem = (double) -b / a;   
            System.out.println("Phương trình có nghiệm x = " + nghiem );
        }
        
	}

}
