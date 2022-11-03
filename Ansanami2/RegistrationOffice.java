package Ansanami2;

import java.util.Date;
import java.util.Random;

public class RegistrationOffice {
	public RegistrationOffice() {}
	
	public Student  getAStudent() {
		Date d=new Date();
		Random rnd = new Random();
		int sayi = rnd.nextInt(5);
	
		if(sayi==0){
			Student s1=new GraduateStudent(1,"emir", 2000, d, "major", "advisor");
			
			System.out.println(s1.toString());
			return s1;
		}
		else if(sayi==1) {
			Student s1=new VocationalStudent(1,"emir", 2000, d, "major");
			System.out.println(s1.toString());
			return s1;
		}
		else if(sayi==2) {
			Student s1=new UnderGraduateStudent(1,"emir", 2000, d, "major", "minor");
			System.out.println(s1.toString());
			return s1;
		}
		else if(sayi==3) {
			Student s1=new MasterStudent(1,"emir", 2000, d, "major", "advisor");
			System.out.println(s1.toString());
			return s1;
		}
		else if(sayi==4) {
			Student s1=new PhdStudent(1,"emir", 2000, d, "major", "advisor", "thesis", false);
			System.out.println(s1.toString());
			return s1;
		}
		else {
			Student s1=new Student(1,"emir", 2000, d, "major");
			System.out.println(s1.toString());
			return s1; }
		
	
	}
	public void registerStudent(Student student) {
		if(student instanceof GraduateStudent){
			System.out.println("Graduate Student ");
		}
		else if(student instanceof VocationalStudent) {
			System.out.println("Vocational Student ");
		}
		else if(student instanceof  UnderGraduateStudent) {
			System.out.println("UnderGraduate Student ");
		}
		else if(student instanceof MasterStudent) {
			System.out.println("Master Student ");
		}
		else if(student instanceof PhdStudent) {
			System.out.println("PhdStudent Student ");
		}
		else {
			System.out.println("Student ");
		}
	}
	
}
