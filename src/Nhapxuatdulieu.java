import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Nhapxuatdulieu {
	public static void main(String[] args) { 
		  try {
		   //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
		   FileOutputStream fos = new FileOutputStream("f:/filename.txt");
		   DataOutputStream dos = new DataOutputStream(fos);
		   //Bước 2: Ghi dữ liệu
		   String n;
	        Scanner scaner = new Scanner(System.in);
	        n = scaner.nextLine();
		   dos.writeBytes(n);  
		   //Bước 3: Đóng luồng
		   fos.close();
		   dos.close();
		   System.out.println("Done!");
		   
		
		  
		  FileInputStream fis = new FileInputStream("f:/filename.txt");
		   DataInputStream dis = new DataInputStream(fis);
		   //Bước 2: Đọc dữ liệu
		   String m = dis.readLine();
		   //Bước 3: Đóng luồng
		   fis.close();
		   dis.close();
		   //Hiển thị nội dung đọc từ file
		   System.out.println( m);
		  
		  } catch (IOException ex) {
		    ex.printStackTrace();
	}
		
		}
	}

		