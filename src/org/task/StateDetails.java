package org.task;

public class StateDetails {
//southIndia(),northIndia()
	public void southIndia() {
		System.out.println("Southern region of India");
	}
	public void northIndia() {
		System.out.println("Northern region of india");
	}
	public static void main(String[] args) {
				
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		StateDetails s = new StateDetails();
		s.southIndia();
		s.northIndia();
	}
}
