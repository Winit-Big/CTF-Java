package com.winitsa.Lesson;

public class Lesson {

	public static void main(String[] args) {
		Lab9();
		Lab10();
	}

	public static void Lab9() {
		System.out.println("Lab 9");
		for (int count = 20; count >= 0; count--) {
			if (count == 11) {
				System.out.print ("Continue count:" + count + ",");
				continue;
			}
			System.out.print ("Loop count:" + count + ",");
		}
		System.out.println("");
	}
	
	public static void Lab10() {
		System.out.println("Lab 10");
		for (int i = 1; i <= 10; i++) {
			if (i == 2) {
				continue;
			}
			System.out.print ("Loop count:" + i + ",");
		}
	}
}
