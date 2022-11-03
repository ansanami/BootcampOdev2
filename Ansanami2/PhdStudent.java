package Ansanami2;

import java.util.Date;

public class PhdStudent extends GraduateStudent{
	
	boolean qualifyingExamTaken;
	
	
	public PhdStudent(int no, String name, int year, Date dob, String major,
			String advisor, String thesis,boolean qualifyingExamTaken) {
		super(no, name, year, dob, major, advisor);
		this.qualifyingExamTaken=qualifyingExamTaken;
		
		
	}
	@Override
	public String toString() {
		String s=new String();
		s+="Phd Student Info\n";
		s+="No:      "+no+"\n";
		s+="Name:    "+name+ "\n";	
		s+="Year:    "+year+ "\n";	
		s+="Dob:     "+dob+ "\n";	
		s+="Major:   "+major+"\n";
		s+="Advisor: "+advisor+"\n";
		s+="Thesis:  "+thesis+"\n";
		s+="qualifyingExamTaken:"+qualifyingExamTaken+"\n";
		return s;
	}
	@Override
	public void study() {
		System.out.println("PhdStudent calisiyor.");
	}
	@Override
	public void register() {
		System.out.println("PhdStudent .");
	}
	@Override
	public void writeThesis() {	}
	@Override
	public void meetWithAdvisor() {		}
	
	public void writePeaper() {	}
	
	
	public boolean isQualifyingExamTaken() {
		return qualifyingExamTaken;
	}

	public void setQualifyingExamTaken(boolean qualifyingExamTaken) {
		this.qualifyingExamTaken = qualifyingExamTaken;
	}
	
	
	
}
