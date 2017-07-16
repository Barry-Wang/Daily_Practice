package com.soundsystem;

import org.springframework.stereotype.Component;

enum Spiciness {
	NOT,
	MIDDLE,
	HOT
}

@Component
public class SgtPeppers implements CompactDisc {

	private String  title = "Sgt. Pepper's lonely Hearts club ";
	private String artist = "The beatles";
	public void play() {
		
		System.out.print("playing" + title + "by" + artist);
	}
	
	void f1(char x) {
	   
		System.out.println("f1 char");
	}
	
	void f1(byte x) {
		
		System.out.println("f1 byte");
	}
	
	void f1(short x) {
		
		System.out.println("f1 short");
	}
	
	void f1(int x) {
		
		System.out.println("f1 int");
	}
	
	void f1(long x) {
		
		System.out.println("f1 long");
	}
	
	void f1(float x) {
		
		System.out.println("f1 float");
	}
	
	
	void f1(double x) {
		
		System.out.println("f1 double");
	}
	
	void printSomething(Object []a) {
		
		for(Object nu: a){
			System.out.println(nu);
		}
	}
	
	void printVarious(Object...objects){
		
		for(Object nu: objects){
			System.out.println(nu);
		}
		
	}
	
	void f (float a, Character...characters){
		
		for(Spiciness s :Spiciness.values()){
			 
			System.out.println(s + " orinary" + s.ordinal());
		}
	}
	
	public static void main(String [] args){
		
		SgtPeppers sg = new SgtPeppers();
		sg.printSomething(new Integer[]{1, 2, 3, 4, 5, 6});
		sg.printVarious(1, 2, 3, 4,5);
		
		sg.f(1, '1');

	}
	

	

}
