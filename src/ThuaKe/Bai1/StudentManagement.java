package ThuaKe.Bai1;

import java.util.*;

public class StudentManagement {

	ArrayList<Student> listStudents;

	public static ArrayList<Student> findByBirthYear(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap nam sinh can tim");
		int namSinh = sc.nextInt();
		
		for (Student o: listStudents) {
			if(o.getBirthYear() == namSinh) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static ArrayList<Student> findByName(ArrayList<Student> listStudents){
		ArrayList<Student> result = new ArrayList<Student>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhap ten can tim");
		String ten = sc.next();
		
		for (Student o: listStudents) {
			if(o.getName().equals(ten)) {
				result.add(o);
			}
		}
		
		return result;
	}
	
	public static void Show(ArrayList<Student> students) {
		for (Student o: students) {
			System.out.println(o.toString());
		}
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap so sinh vien");
		int n = sc.nextInt();
		
		StudentManagement list = new StudentManagement();
		list.listStudents = new ArrayList<Student>();
		
		for(int i = 0; i < n; i++) {
			
			Student s = new Student();
			s.setInfo();
			list.listStudents.add(s);
		}
	
		
		Show(list.listStudents);
		
	
		
		ArrayList<Student> resultByBirthYear = findByBirthYear(list.listStudents);
		
		System.out.print("Danh sach sinh vien cung nam can tim: ");
		Show(resultByBirthYear);
		
		ArrayList<Student> resultByName = findByName(list.listStudents);
		
		System.out.print("Danh sach sinh vien cung ten can tim: ");
		Show(resultByName);
	}

}
