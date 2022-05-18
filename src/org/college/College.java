package org.college;

public class College {
	//collegeName(),collegeCode(),collegeRank()
	public void collegeName() {
		System.out.println("College name: Jain Arts and College");
	}
	public void collegeCode() {
		System.out.println("College Code: 634");
	} 
	public void collegeRank() {
		System.out.println("All over State the college Ranks: 21");
	}
	public static void main(String[] args) {
		College c = new College();
		c.collegeName();
		c.collegeCode();
		c.collegeRank();
		Student s = new Student();
		s.studentId();
		s.studentName();
		s.studentDept();
		Dept d = new Dept();
		d.deptName();
		Hostel h = new Hostel();
		h.hostelName();
	}

}
