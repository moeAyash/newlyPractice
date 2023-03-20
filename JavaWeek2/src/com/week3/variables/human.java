package com.week3.variables;

public class human {
	
	public static int age;
	public String name;
	public double height;
	
	
	public void setAge (int _age) {
		
	age=_age;
	}

	public void setName (String _name) {
		
		name=_name;
	}
	
	public void setHeight(double _height) {
		
		height=_height;
		
	}
	
	public void printData() {
		
		System.out.println("name is  " + name);
		System.out.println("age is  " + age);
		System.out.println("height is  " + height);
	}
	
	


		
		
	

}
