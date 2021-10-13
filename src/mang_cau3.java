import java.util.Random;
import java.util.Scanner;
public class mang_cau3 {


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
    public static void InputArrayFloat(float []array) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();
        float z = rd.nextFloat();

        for (int i=0; i<=array.length-1; i++) {
            System.out.print("a[" + i + "] = ");
            array[i] =  rd.nextFloat();
            System.out.println();
            System.out.println(array[i] + " ");
        }
        scanner.close();
    }

    public static void OutputArray(int []arr) {
        for (int i=0; i<=arr.length-1; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void OutputArraysz (float []array) {
        for (int i=0; i<=array.length-1; i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] arr = new int[5];
        InputArray(arr);
        float[] array = new float[5];
        OutputArray(arr);
        System.out.println();
        InputArrayFloat(array);
        OutputArraysz(array);
    }}
