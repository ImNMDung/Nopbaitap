package ThuaKe.Bai2;

import java.io.Serializable;

public class Person implements  Serializable, Cloneable, Comparable<Student>{

	String name;
	char gender;
	int birthYear;
	
	public Person() {
		super();
	}

	public Person(String name, char gender, int birthYear) {
		super();
		this.name = name;
		this.gender = gender;
		this.birthYear = birthYear;
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getBirthYear() {
		return birthYear;
	}

	public void setBirthYear(int birthYear) {
		this.birthYear = birthYear;
	}

	@Override
	public String toString() {
		return "Name: " + name 
				+ ", gender: " + gender
				+ ", birthYear: " + birthYear;
	}


	@Override
	public int compareTo(Student o) {
		
		return 0;
	}

}
