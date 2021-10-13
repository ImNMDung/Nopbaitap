import java.util.Random;
import java.util.Scanner;
public class mang_cau2 {

	public static void InputArray(int []arr) {
		Scanner scanner = new Scanner(System.in);
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print("a[" + i + "] = ");
			arr[i] = scanner.nextInt();
			
		}
		scanner.close();
	}
	public static void Average(int []arr) {
		double average = 0;
		for(int i=0; i<=arr.length-1; i++) {
			average += arr[i];
		}
		System.out.println("Trung bình là : " + (average / arr.length));
	}
	
	public static void OutputArray(int []arr) {
		for (int i=0; i<=arr.length-1; i++) {
			System.out.print(arr[i] + " ");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		 Random rd = new Random();
		 
		int n = rd.nextInt(10);
		 System.out.println("Số phần tử của mảng là " + n);
		int []arr = new int[n];
		
		InputArray(arr);
		OutputArray(arr);
		System.out.println();
		Average(arr);
	}
}

