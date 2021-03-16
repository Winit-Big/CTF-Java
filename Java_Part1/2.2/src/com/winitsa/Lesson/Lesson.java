package com.winitsa.Lesson;

/*
@author winitsa
*/
public class Lesson {

	public static void main(String[] args) {
		bark();
		float f1 = 1.0f;
		int i1 = (int)f1;
		System.out.println("float to int = " + i1);
		
		int i2 = 2;
		float f2 = (float)i2;
		System.out.println("int to float = " + f2);
		
		double d1 = 3.5;
		float f3 = (float)d1;
		System.out.println("double to float = " + f3);
		
		char ch1 = 'a';
		int i4 = (int)ch1;
		System.out.println("char to int = " + i4);
		
		final String str = "Hello";
		//str = "World";
		
	}

	public static void bark() {
		String dogName = "diggy";
		System.out.println("The Dog name = " + dogName + " bark");
	}
}
