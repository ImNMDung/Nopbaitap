package ThuaKe.Bai1;

import java.util.Scanner;

public class Student extends Person {
	@Override
	public String toString() {
		return "Student :\n studentID: " + studentID + " ,\n Name: "+ name + ",\n AcademicYear: " + academicYear;
	}
	
	public Student() {
		super();
	}

	public Student(String studentID, int academicYear) {
		super();
		this.studentID = studentID;
		this.academicYear = academicYear;
	}
	
	
	
	public Student(String name, char gender, int birthYear, String studentID, int academicYear) {
		super(name, gender, birthYear);
		
		this.academicYear = academicYear;
		
		this.studentID = studentID;
		
		
	}

	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public int getAcademicYear() {
		return academicYear;
	}
	public void setAcademicYear(int academicYear) {
		this.academicYear = academicYear;
	}
	
	String studentID;
	int academicYear;
	
	public void setInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.print("ho ten: ");
		this.setName(sc.next());

		System.out.print(" ma sinh vien: ");
		this.setStudentID(sc.next());
		
		System.out.print("nam sinh: ");
		this.setBirthYear(sc.nextInt());
		
		System.out.print(" gioi tinh: ");
		this.setGender(sc.next().charAt(0));
		
		System.out.print("nam nhap hoc: ");
		this.setAcademicYear(sc.nextInt());
		
		
	}
}














