package org.task;

public class CompanyInfo {
	//companyName(),companyId(),companyAddress()
	public void companyName() {
		System.out.println("Name of the Company : TCS");
	}
	public void companyId() {
		System.out.println("Company Id: IT871387");
	}
	public void companyAddress() {
		System.out.println("Address of the Company: Chennai");
	}
	public static void main(String[] args) {
		CompanyInfo ci= new CompanyInfo();
		ci.companyId();
		ci.companyName();
		ci.companyAddress();
		
	}
}
