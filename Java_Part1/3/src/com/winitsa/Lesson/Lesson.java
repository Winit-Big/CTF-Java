package com.winitsa.Lesson;

public class Lesson {

	public static void main(String[] args) {
		int i = 20;
		i++;
		i++;
		i++;
		i++;
		i++;
		System.out.println(i);
		--i;
		--i;
		--i;
		--i;
		--i;
		System.out.println(i);
		float val1 = 1.0f;
		float val2 = 2.0f;
		if ((val1 == 1.0) && (val2 == 2.0)) {
			System.out.println("val1 is 1.0 and val2 is 2.0");
		}
		char ch1 = 'a';
		char ch2 = 'b';
		if ((ch1 == 'a') || (ch2 == 'b')) {
			System.out.println("ch1 is a OR ch2 is b");
		}
	}

}
