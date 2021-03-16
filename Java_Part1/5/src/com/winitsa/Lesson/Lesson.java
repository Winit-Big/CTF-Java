package com.winitsa.Lesson;

public class Lesson {

	public static void main(String[] args) {
		returnMethod();
		noReturnMethod();
	}

	public static String returnMethod() {
		String retVal = "return method";
		System.out.println("Return result : " + retVal);
		return retVal;
	}
	
	public static void noReturnMethod() {
		System.out.println("No return");
	}
	
}
