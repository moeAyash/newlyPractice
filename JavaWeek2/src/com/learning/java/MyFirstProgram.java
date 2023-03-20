package com.learning.java;

public class MyFirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1;
		int e,s;
		int j=1;
		
		for (i=1;i<=6;i++) {
			
			//System.out.println(i);
			
			for (j=1;j<=i;j++) {
				
				System.out.print(i);
				
				System.out.print(" ");
				
			}System.out.println("");
				
				
				
			}
		
		
		int num=100;
				
		for (i=1;i<num;i++)
		{
				if ((i%3 ==0) && (i%5 ==0)) {System.out.println("fizzbuzz");}
				else if (i % 5 == 0) {System.out.println("buzz");}
				else if (i %3 == 0) {System.out.println("fizz");}
				else {System.out.println(i);}
		}
		
		
		
		
		
		
			
		}
	

	

}
