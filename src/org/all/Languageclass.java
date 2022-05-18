package org.all;

public class Languageclass {
	public void alllanguage() {
		System.out.println("Language list that are available");
	}

	public void teluguLanguage() {
		System.out.println("Telugu is the neighbouring Language");
	}
	public static void main(String[] args) {
		Languageclass l = new Languageclass();
		l.alllanguage();
		l.tamilLanguage();
		l.englishLanguage();
		l.teluguLanguage();
	}
}
