package com.practice.breakcontinue;

public class Question4 {
	
	// Print numbers from 1 to 30, skipping multiples of 4 and stopping at 25.

	public static void main(String[] args) {
		
		for(int i = 1; i <= 30; i++) {
			
			if(i == 25) {
				
				break;
				
			}
			
			if(i % 4 == 0) {
				
				continue;
				
			}
			
			System.out.println(i);
			
		}
		
	}

}
