package com.hackertest;

public class ReverseNumber {
	
	public static void main(String[] args) {
		int n = 5679;
		
		int reverse = 0;
		
		while(n != 0) {
			int digit  = n % 10;
			reverse = reverse * 10 + digit;
			
			n  = n/10;
		}
		
		System.out.println("number >>>"+reverse);
	}
	

}
