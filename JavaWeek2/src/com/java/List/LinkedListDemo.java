package com.java.List;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		
		LinkedList <String> Linkedlist = new LinkedList<String>();
		
		Linkedlist.add("F");
		Linkedlist.add("B");
		Linkedlist.add("D");
		Linkedlist.add("E");
		Linkedlist.add("C");
		Linkedlist.addLast("Z");
		Linkedlist.addFirst("A");
		Linkedlist.add(0, "M");
		Linkedlist.remove(1);
		Linkedlist.set(1, "S");
		
		System.out.println(Linkedlist);
		
	}

}
