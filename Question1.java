package com.practice.breakcontinue;

public class Question1 {

	// Print numbers from 1 to 100. Skip multiples of 5 and stop when the number reaches 50.

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
			
			if (i == 50) {

				break;

			}

			if (i % 5 == 0) {

				continue;

			}

			System.out.println(i);

		}

	}

}
