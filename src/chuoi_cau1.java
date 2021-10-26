import java.util.Scanner;

public class chuoi_cau1 {
    public static void main(String[] args) {
        String chuoi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = scanner.nextLine();
                String replaceString = chuoi.replaceAll(" ", "");
                System.out.println(replaceString);
            }



}