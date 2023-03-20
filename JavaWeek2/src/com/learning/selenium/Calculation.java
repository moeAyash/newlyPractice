package com.learning.selenium;

public class Calculation {
	
	public static void main(String[] args) {
		
		
		
		
		
	}
	
	public void calculator(int a, int b, String Opr) {
		 
		String Op = Opr;
		
		switch (Op) {
		case "+": 
			add (a,b);
			break;
		case "-": 
			subtraction (a,b);
			break;
		case "/": 
			division (a,b);
			break;
		case "*": 
			multiblication (a,b);
			break;
			
			default:
				System.out.println("invalid operator");
		
		
		}
		
		
	}

	private void multiblication(int a, int b) {
		// TODO Auto-generated method stub
		int m = a * b;
		System.out.println(m);
		
	}

	private void division(int a, int b) {
		// TODO Auto-generated method stub
		int d = a / b;
		System.out.println(d);
		
	}

	private void subtraction(int a, int b) {
		// TODO Auto-generated method stub
		int s = a - b;
		System.out.println(s);
		
	}

	private void add(int a, int b) {
		// TODO Auto-generated method stub
		int ad = a * b;
		System.out.println(ad);
		
	}

}
