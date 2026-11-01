package com.practice.breakcontinue;

public class Question3 {

	// Find the first number between 1 and 100 that is divisible by both 7 and 9 Skip all even numbers.

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {

			if (i % 7 == 0 && i % 9 == 0) {

				System.out.println(i);
				break;

			}

			if (i % 2 == 0) {

				continue;

			}

		}

	}

}
