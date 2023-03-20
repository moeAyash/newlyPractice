package com.week3.variables;

public class LearningMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LearningMethods Obj = new LearningMethods();
		
		Obj.printAddition(5,6);
		
		int res = Obj.Addition(5,6);
		System.out.println(res);
		
		Obj.printMyString("I love Java Programming !!!    ");
		
		
		
		
		
	}              
	
	public void printAddition(int x, int y) {
		
		int resault = x+y;
		System.out.println(resault);
	}
	
	
	public int Addition(int c, int e) {
		
		int result = c+e;
		return result;
	}
	
	
	public void printMyString(String inputString) {
		
		System.out.println("Original "+ inputString);
		// remove spaces before and after the data
		String data = inputString.trim();
		// count the string length
		int length = inputString.length();
		
		System.out.println("Trimmed " + data + "\n string length= "+ length);
		
		
	}
	
	
	

}
