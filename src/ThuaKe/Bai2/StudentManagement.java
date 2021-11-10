package ThuaKe.Bai2;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

	Student[] students;
	
	public static void Show(Student[] students) {
		for (Student o: students) {
			System.out.println(o.toString());
		
		}
	}
	
	public static Student[] sortStudent(Student[] stds) {
		for(int i = 0; i < stds.length - 1; i++) {
			for(int j = i + 1; j < stds.length; j++) {
				if(stds[i].compareTo(stds[j]) == -1) {
					Student temp = stds[i];
					stds[i] = stds[j];
					stds[j] = temp;
				}
			}
		}
		return stds;
		
	}
	
	public void write(Student[] student) { 
		
        try {   
            FileOutputStream f = new FileOutputStream("F:\\filename.dat");   
            ObjectOutputStream oStream = new ObjectOutputStream(f); 
            oStream.writeObject(student);   
            oStream.close();
        } catch (IOException e) {
            System.out.println("Error");
        }
    
	}
	
    public Student[] read() {
    	
        Student[] student = null;
        try {   
            FileInputStream f = new FileInputStream("F:\\filename.dat"); 
            ObjectInputStream inStream = new ObjectInputStream(f); 
          
            student = (Student[]) inStream.readObject();
            inStream.close();
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        } catch (IOException e) {
            System.out.println("Error Read file");
        }
        return student;
    }
	
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = sc.nextInt();
		
		StudentManagement list = new StudentManagement();
		list.students = new Student[n];
		
		for(int i = 0; i < n; i++) {
			
			list.students[i] = new Student();
			list.students[i].setInfo();
		}
		
		Show(list.students);
		
		Student[] result = sortStudent(list.students);
		
		System.out.println("Sau khi sap xep: ");
		Show(result);
		
		list.write(result);
		
	

	}

}
