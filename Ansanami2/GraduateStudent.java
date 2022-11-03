package Ansanami2;

import java.util.Date;

public class GraduateStudent extends Student {
	String advisor;
	String thesis;
	
	public GraduateStudent(int no, String name, int year, Date dob, String major,String advisor) {
		super(no,name,year,dob,major);
		this.advisor = advisor;
		
	}
	@Override
	public String toString() {
		String s=new String();
		s+="Graduate Student Info\n";
		s+="No:     "+no+"\n";
		s+="Name:   "+name+ "\n";	
		s+="Year:   "+year+ "\n";	
		s+="Dob:    "+dob+ "\n";	
		s+="Major:  "+major+"\n";
		s+="Advisor "+advisor+"\n";
		return s;
	}
	@Override
	public void study() {
		System.out.println("GraduateStudent calisiyor.");
	}
	@Override
	public void register() {
		System.out.print("GraduateStudent ");
	}
	public void writeThesis() {	}
	public void meetWithAdvisor() {	}
	

	
	public String getAdvisor() {
		return advisor;
	}

	public void setAdvisor(String advisor) {
		this.advisor = advisor;
	}

	public String getThesis() {
		return thesis;
	}

	public void setThesis(String thesis) {
		this.thesis = thesis;
	}
	
}
