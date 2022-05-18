package org.task;

public class EmployeeDetails {
	// empId(),empName(),empDob(),empPhone(),empEmail(),empAddress()
	public void empID() {
		System.out.println("empID");
	}
	public void empName() {
		System.out.println("empName");
	}
	public void empDob() {
		System.out.println("Date of birth");
	}
	public void empPhone() {
		System.out.println("Phoneno:");
	}
	public void empEmail() {
		System.out.println("EmailID:");
	}
	public void empAddress() {
		System.out.println("Address:");
	}
	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		ed.empName();
		ed.empID();
		ed.empPhone();
		ed.empDob();
		ed.empEmail();
		ed.empAddress();
	}
}
