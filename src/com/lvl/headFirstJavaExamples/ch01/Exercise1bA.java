package com.lvl.headFirstJavaExamples.ch01;

public class Exercise1bA {

	public static void main(String[] args) {
		
		int x = 1;
		
		while (x < 10) {
			
			if (x > 3) {
				System.out.println(String.format("big x (%d)", x));
			}
			
			x++;
			
		}
		
	}
	
}
