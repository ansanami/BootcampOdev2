package Ansanami2;

import java.util.Date;

public class Student {
	int no;
	String name;
	int year;
	Date dob;
	String major;
	

	public Student(int no, String name, int year, Date dob, String major) {
		this.no = no;
		this.name = name;
		this.year = year;
		this.dob = dob;
		this.major = major;
	}
	public void study() {
		System.out.println("Student calisiyor.");
	}
	public void register() {
		System.out.println("Student .");
	}
	public String toString() {
		String s=new String();
		s+="Vocational Student Info\n";
		s+="No:    "+no+"\n";
		s+="Name:  "+name+ "\n";	
		s+="Year:   "+year+ "\n";	
		s+="Dob:   "+dob+ "\n";	
		s+="Major: "+major+"\n";
		
		return s;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	
}
