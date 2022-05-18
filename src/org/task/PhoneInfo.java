package org.task;

public class PhoneInfo {
	//phoneName(),phoneMieiNum(),Camera(),storage(),osName()
	public void phoneName() {
		System.out.println("Phone name: Samsung");
	}
	public void phoneMieiNum() {
		System.out.println("IMEI number of phone:IMEI23489662386652363672");
	}
	public void Camera() {
		System.out.println("Camera specification Front: 16mp and Back: 48mp");
	}
	public void Storage() {
		System.out.println("8Gb ram and 128Gb internal storage with external memory expandable  till 256gb");
	}
	public void osName() {
		System.out.println("Operating System of the phone: Android 11");
	}
	public static void main(String[] args) {
		PhoneInfo p = new PhoneInfo();
		p.phoneName();
		p.phoneMieiNum();
		p.Camera();
		p.Storage();
		p.osName();
	}
}
