package com.practice.breakcontinue;

public class Question5 {

	// Find the sum of numbers from 1 to 100, skipping multiples of 3 and stopping when the sum exceeds 200.

	public static void main(String[] args) {

		int sum = 0;

		for (int i = 1; i <= 100; i++) {

			if (i % 3 == 0) {

				continue;

			}

			sum = sum + i;

			if (sum > 200) {

				break;

			}

		}

		System.out.println(sum);

	}

}
