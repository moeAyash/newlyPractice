package com.learning.java;

import java.util.Scanner;

public class Excercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int Age;
		Excercise obj = new Excercise();
		Scanner input = new Scanner(System.in);
		Age = input.nextInt();
		obj.EligibilityToWork(Age);
		obj.EvenOdd(Age);
		obj.PosNeg(Age);
		
		Scanner input1 = new Scanner(System.in);
		int x,y,z;
		x = input1.nextInt();
		y = input1.nextInt();
		z = input1.nextInt();
		obj.Greatiest(x, y, z);
		
		obj.WeekDays();

	}
	
	public void EligibilityToWork (int Age) {
		
		if (Age > 18) {System.out.println("Eligible To vote");}
		else {System.out.println("not Eligible to vote");}
		
	}
	
	public void EvenOdd (int num) {
		
		if(num % 2 == 0) {
			System.out.println(num + " is even");
		}
		else {System.out.println(num +" is Odd");}
	}
	
	public void PosNeg(int x) {
		if (x < 0) {System.out.println(x + "  is Negative");}
		else {System.out.println(x +" is Positive");}
	}
	
	public void Greatiest(int x,int y,int z) {
		
		
		if (x > y && x > z) {System.out.println(x + " is the greater");}
		else if  (y > x && y>z) {System.out.println(y + " is the greater");}
		else {System.out.println(z + " is the greater");}
		
	}
	
	
	
	public void WeekDays() {
		
		Scanner inp = new Scanner (System.in);
		int x= inp.nextInt();
		
		switch (x) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		
		}
	}
	
	
	
	}


