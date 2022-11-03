package Ansanami2;

import java.util.Date;

public class MasterStudent extends GraduateStudent{

	public MasterStudent(int no, String name, int year, Date dob, String major, String advisor) {
		super(no, name, year, dob, major, advisor);
	
	}

	@Override
	public void study() {
		
		System.out.println("MasterStudent calisiyor.");
	}

	@Override
	public void register() {
		
		System.out.println("MasterStudent .");
	}

	@Override
	public void writeThesis() {	}

	@Override
	public void meetWithAdvisor() {	}
	@Override
	public String toString() {
		String s=new String();
		s+="Master Student Info\n";
		s+="No:    "+no+"\n";
		s+="Name:  "+name+ "\n";	
		s+="Year:   "+year+ "\n";	
		s+="Dob:   "+dob+ "\n";	
		s+="Major: "+major+"\n";
		s+="Advisor:"+advisor+"\n";
		return s;
	}

}
