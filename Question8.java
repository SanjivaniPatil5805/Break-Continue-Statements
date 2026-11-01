package com.practice.breakcontinue;

public class Question8 {
	
	// Print numbers from 1 to 100, skipping numbers divisible by 2 or 3, and stop when the number reaches 60.
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if(i == 60) {
				
				break;
				
			}
			
			if(i % 2 == 0 || i % 3 == 0) {
				
				continue;
				
			}
			
			System.out.println(i);
			
		}
		
	}

}
