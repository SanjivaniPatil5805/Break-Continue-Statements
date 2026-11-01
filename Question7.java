package com.practice.breakcontinue;

public class Question7 {
	
	// Print the multiplication table of 8, skipping the result 40 and stopping when the result exceeds 80.
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
			if(8 * i == 40) {
				
				continue;
				
			}
			
			if(8* i  > 80) {
				
				break;
				
			}
			
			System.out.println(8 + " * "+ i+" = "+(8 * i));
			
		}
		
	}

}
