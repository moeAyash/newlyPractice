package com.week3.variables;

import java.util.ArrayList;
import java.util.List;

public class LearningList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// the list is dynamic array that expands and shrinks automatically
		
		List <String> myCar = new ArrayList<String>();
		
		int size = myCar.size();
		System.out.println("num of my cars before purchasing   " + size);
		
		myCar.add("BMW");
		myCar.add("Audi");
		myCar.add("Honda");
		myCar.add("Mercedes");
		myCar.add("Tesla");
		
		int newsize = myCar.size();
		System.out.println("num of my cars is " + newsize);
		System.out.println("my car is:" + myCar);
		
		// this for loop execute as many items as in the arrayList which is myCar
		for (String car : myCar) {
			System.out.println("my new car :  " + car);
		}

	}

}
