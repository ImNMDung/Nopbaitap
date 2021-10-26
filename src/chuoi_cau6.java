import java.util.Scanner;
import java.lang.*;

public class chuoi_cau6 {
    public static void main(String[] args) {
    
        Scanner input = new Scanner(System.in);


        System.out.println("Nhap chuoi :");
        String str = input.nextLine();

        System.out.println("Nhap ki tu can tim");
        char s = input.next().charAt(0);

        char[] charArray = str.toCharArray();

        int dem = 0;
        System.out.println(s+ " xuat hien tai vi tri: ");
        for(int i = 0; i < charArray.length; i++) {
            if(charArray[i] == s)
            {
                System.out.print(i + " ");
                dem++;
            }
        }
        System.out.println();
        System.out.println("co "+dem+" ki tu " + s +" xuat hien");

    }

}