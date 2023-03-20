package com.java.List;

import java.util.ArrayList;
import java.util.Iterator;

public class ListDemo {
	
	public static void main(String[] args) {
		
	ArrayList<String> list = new ArrayList<String>();
	
	list.add("Toyota");
	list.add("BMW");
	list.add("Jeep");
	
	System.out.println(list);
	//list.remove(0);
	//System.out.println(list);
	
	list.set(0, "Honda");
	System.out.println(list);
	Iterator <String> itr = list.iterator();
	while (itr.hasNext()) {
		
		System.out.println(itr.next());
	}
	
	
	for(String st: list) {
		System.out.println(st);
	}
	
		/*
		 * for(Student st: studentlist) { System.out.println(st.stID + " " + st.stName +
		 * " "+ st.stAge);
		 * 
		 * }
		 */
	
	
	}
}
