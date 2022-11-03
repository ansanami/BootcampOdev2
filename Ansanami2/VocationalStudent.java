package Ansanami2;

import java.util.Date;

public class VocationalStudent extends Student{
	public VocationalStudent(int no, String name, int year, Date dob, String major) {
		super(no,name,year,dob,major);
		
	}
	@Override
	public void study() {
		System.out.println("VocationalStudent calisiyor.");
	}
	@Override
	public void register() {
		System.out.println("VocationalStudent .");
	}
	@Override
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
}
