package Intefacer_Sinhvien;

import java.io.*;

public class qlsvKTPMK44 {

	public static void main(String[] args) throws IOException, ClassNotFoundException, CloneNotSupportedException {
	
		Student s = new Student("Nguyen Van A", "1-2-2002", '1', 9, 5);
		
		
		Student s2 = (Student) s.clone();
	
		
		System.out.println("s2: " + s2.toString());
		
		
		FileOutputStream fos = new FileOutputStream("F:\\filename.txt");
	    ObjectOutputStream oos = new ObjectOutputStream(fos);
	    oos.writeObject(s);
	    
	   
	    FileInputStream fis = new FileInputStream("F:\\filename.txt");
	    ObjectInputStream ois = new ObjectInputStream(fis);
	    Student b = (Student)ois.readObject(); 
	   
	    
	    System.out.println(b.toString());
	

	    oos.close();
	    ois.close();
	    
	   
	    System.out.println("Compare");
	    Student c = new Student("Vo Hai Nam", "12-02-2002", '2', 3, 4);
	    
	    System.out.print("So sanh " + s.getFullName() + " co gpa " + s.getGpa() + " va Social Activities " + s.getSocialActivities() + " voi ");
	    System.out.println(c.getFullName() + " voi gpa: " + c.getGpa() + " va Social Activities " + c.getSocialActivities());


	    int result = s.compareTo(c);
	    if(result == 1)
	    	System.out.println(s.getFullName() + " gioi hon " + c.getFullName());
	    else if(result == 0)
	    	System.out.println(s.getFullName() + " gioi bang " + c.getFullName());
	    else if(result == -1)
	    	System.out.println(s.getFullName() + " kem hon " + c.getFullName());
	}

}
