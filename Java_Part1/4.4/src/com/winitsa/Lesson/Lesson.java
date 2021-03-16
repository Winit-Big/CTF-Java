package com.winitsa.Lesson;

import java.util.Scanner;

public class Lesson {
	
	public static void main(String[] args) {
		Lab6();
		Lab7();
		Lab8();
	}
	
	// While Loop
	public static void Lab6() {
		// Lab 6.
		// 1.
		int i = 0;
		while (i <= 10) {
			System.out.println("Round: " + i);
			i++;
		}
		// 2.
		int ret = 0;
		for (int j = 1; j <= 10; j++) {
			ret += j;
		}
		System.out.println("Result 1-10: " + ret);
		// 3.
		for (int k = 1; k <= 100; k++) {
			if (k % 12 == 0) {
				System.out.println("1-100 mod 12: " + k);
			}
		}
		// 4.
		int sum = 0;
		int myArray[] = {1,2,3,4,5};
		for (int l : myArray) {
			sum += l;
		}
		System.out.println("Summary 1-5: " + sum);
	}

	// Do While Loop
	public static void Lab7() {
		// 1.
		int i = 20;

        while ( i > 0 ) {
            System.out.print (i  + ", ");
            i--;
        }     

        System.out.println("End");
		
		// 2. 
		Scanner reader = new Scanner(System.in);
		
		int number;

        System.out.println("\tDetermine odd/even program");

        do {
            System.out.print("Enter odd number to exit loop: ");
            number = reader.nextInt();

            if (number % 2 == 0) {
                System.out.println("You entered " + number + ", it's even.");
            } else {
                System.out.println("You entered " + number + ", it's odd.");
            }

        } while (number % 2 == 0);

        System.out.println("Exited loop.");
	}

	// Break, For
	public static void Lab8() {
		for (int count = 20; count >= 0; count--) {
			if (count == 11) {
				System.out.print ("Break count:" + count);
				break;
			}
			System.out.print ("Continue count:" + count + ",");
		}
	}
}
