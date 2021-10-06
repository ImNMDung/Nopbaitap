import java.util.Scanner;
public class cau3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0,temp,i;
		 Scanner scanner = new Scanner(System.in);
	       
	        System.out.print("Nhap so tu nhien n: ");
	        n = scanner.nextInt();
	       
	        for(i = 1 ; i <=n ;i++)
	        {
	            temp = i;
	            while(temp != 0)
	            {
	                sum = sum + temp%10;
	                temp = temp/10;
	            }
	        }
      System.out.print("Tong la" + sum);
	}

}
