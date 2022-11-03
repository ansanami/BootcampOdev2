package Ansanami2;

import java.util.Date;

public class UnderGraduateStudent extends Student {
	String minor;
	
	public UnderGraduateStudent(int no, String name, int year, Date dob, String major,String minor) {
		super(no, name, year, dob, major);
		this.minor=minor;
	
	}

	@Override
	public void study() {
		System.out.println("UnderGraduateStudent calisiyor.");
	}
	@Override
	public void register() {
		System.out.println("UnderGraduateStudent .");
	}
	@Override
	public String toString() {
		
		String s=new String();
		s+="UnderGraduate Student Info\n";
		s+="No:    "+no+"\n";
		s+="Name:  "+name+ "\n";	
		s+="Year:  "+year+ "\n";	
		s+="Dob:   "+dob+ "\n";	
		s+="Major: "+major+"\n";
		s+="Minor: "+minor+"\n";	
		return s;
	
	}
	
	
	public String getMinor() {
		return minor;
	}


	public void setMinor(String minor) {
		this.minor = minor;
	}

}
