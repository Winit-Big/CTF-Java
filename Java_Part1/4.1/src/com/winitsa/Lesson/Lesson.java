package com.winitsa.Lesson;

public class Lesson {

	public static void main(String[] args) {
		int score = 40;
		boolean isHandSome = true;
		if (score >= 80 || isHandSome) {
			System.out.println("Good");
		} else if (score >= 50 && score < 80) {
			System.out.println("normal");
		} else if (score < 50) {
			System.out.println("fail");
		}

	}

}
