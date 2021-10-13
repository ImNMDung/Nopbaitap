import java.util.Random;
import java.util.Scanner;

public class mang_cau4 {


    public static void InputArray(int []arr) {
        Random rd = new Random();
        int z = rd.nextInt();
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print("a[" + i + "] = ");
            arr[i] = rd.nextInt(10);
            System.out.println();
            System.out.println(arr[i]+ " ");
        }
        scanner.close();
    }


    public static void OutputArray(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void OutputArraysz (int []arr) {
        int i;
        for (i = 4; i<=arr.length-1; i--) {


            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[5];
        InputArray(arr);

        OutputArray(arr);
        System.out.println();
        OutputArraysz(arr);
    }}
