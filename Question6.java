package com.practice.breakcontinue;

public class Question6 {

	// Check numbers from 1 to 100. Skip even numbers and stop when you find a number divisible by 7.
	
	public static void main(String[] args) {
		
		for(int i = 1; i <= 100; i++) {
			
	        if(i % 2 == 0) {
	        	
	        	continue;
	        	
	        }
	        
	        if(i % 7 == 0) {
	        	
	        	System.out.println(i);
	        	break;
	        	
	        }
			
		}
		
	}
	
}
